package com.blogspot.francisoud.ehcache;

import java.io.Serializable;

public class MyObject implements Serializable {

	private static final long serialVersionUID = 1L;

	private final int id;
	
	private final String label;

	public MyObject(final int id, final String label) {
		this.id = id;
		this.label = label;
	}
	
	@Override
	public String toString() {
		return id  + " - " + label;
	}

	public String getLabel() {
		return label;
	}
}
