package fr.blogspot.francisoud.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Interceptor {

	private long delay = 0;

	public Interceptor() {
		System.out.println("Creating Interceptor");
	}

	public long getDelay() {
		return delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}

	@Around("within(fr.blogspot.francisoud.webapp..*)")
	public Object logTime(ProceedingJoinPoint pjp) throws Throwable {
		final long before = System.currentTimeMillis();
		final Object obj = pjp.proceed();
		final long after = System.currentTimeMillis();
		final long duration = after - before;
		if (duration >= delay) {
			System.out.println("method: " + pjp.getSignature().toLongString() + " - duration: " + duration);
		}
		return obj;
	}
}
