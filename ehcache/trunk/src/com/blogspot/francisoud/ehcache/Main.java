package com.blogspot.francisoud.ehcache;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import net.sf.ehcache.Statistics;

public class Main {

	private static final String CACHE_NAME = "default";

	/**
	 * Play with ehcache.xml params to see the differences. 
	 * <ul>
	 * <li>timeToIdleSeconds="4"</li>
	 * <li>timeToLiveSeconds="4"</li>
	 * </ul>
	 */
	public static void main(String[] args) throws InterruptedException {
		final CacheManager manager = initCache();
		final Cache cache = manager.getCache(CACHE_NAME);

		// get object from somewhere
		final List<MyObject> objects = findAllObject();
		
		// put them in cache for later use
		for (MyObject obj : objects) {
			final Element element = new Element(obj.getLabel(), obj);
			cache.put(element);
		}
		
		// Fetch them later...
		
		// Cache is configured for 4 seconds
		
		// Wait 1 second (we should hit the cache)
		Thread.sleep(1*1000L);
		
		Element element1 = cache.get("foo");
		if(element1 == null) {
			System.err.println("Problem object is not in cache ?!");
		} else {
			MyObject obj = (MyObject) element1.getValue();
			System.out.println("First test - Got: " + obj.getLabel());
		}
		
		// Wait 5 second (no more object in the cache anymore)
		Thread.sleep(5*1000L);
		
		final String objName = "bar";
		Element element2 = cache.get(objName);
		if(element2 != null) {
			System.err.println("Problem object is in cache! It should have expired by now ?!");
		} else {
			System.out.println("Second test - Didn't found second object: " + objName);
		}


		Statistics statistics = cache.getStatistics();
		System.out.println("==== Statistics ====");
		System.out.println("CacheHits: \t\t" + statistics.getCacheHits());
		System.out.println("CacheMisses: \t\t" + statistics.getCacheMisses());
		System.out.println("InMemoryHits: \t\t" + statistics.getInMemoryHits());
		System.out.println("OnDiskHits: \t\t" + statistics.getOnDiskHits());
		System.out.println("MemoryStoreObjectCount: \t" + statistics.getMemoryStoreObjectCount());
		
		// WARNING: Don't forget to close the cache manager
		manager.shutdown();
		
		System.out.println("\nDone");
	}

	private static CacheManager initCache() {
		final URL url = Main.class.getClassLoader().getResource("/ehcache.xml");
		final CacheManager manager = new CacheManager(url);
		manager.addCache(CACHE_NAME);
		return manager;
	}

	/**
	 * For example results of a select * from [table] (in DB)
	 */
	private static List<MyObject> findAllObject() {
		final List<MyObject> results = new ArrayList<MyObject>();
		results.add(new MyObject(1, "foo"));
		results.add(new MyObject(2, "bar"));
		return results;
	}
}
