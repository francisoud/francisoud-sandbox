package com.blogspot.francisoud.instrospection;

import org.apache.commons.lang.builder.ToStringBuilder;

public class MyBean {
	
	private Integer id = new Integer(12345);
	
	private String firstName = "john";

	private String lastName = "doe";
	
	private String address = "123 street name";

	private String phone = "+33123456789";

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String toStringManual() {
		final StringBuilder sb = new StringBuilder(toString());
		sb.append("[id=");
		sb.append(id.toString());
		sb.append(",firstName=");
		sb.append(firstName);
		sb.append(",lastName=");
		sb.append(lastName);
		sb.append(",address=");
		sb.append(address);
		sb.append(",phone=");
		sb.append(phone);
		sb.append("]");
		return sb.toString();
	}

	public String toStringApache() {
		return ToStringBuilder.reflectionToString(this);
	}
}
