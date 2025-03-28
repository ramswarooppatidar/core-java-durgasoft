package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	 private int id;
	 private String name;
	 
	 //this both is not serilizable
	 transient String ignoreSerializString;
	 static String notBelongsToObjectString;
	 
	 //if we nod generated then jvm generated and that is platform dependent
	 private static final long serialVersionUID = 1L;
	 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIgnoreSerializString() {
		return ignoreSerializString;
	}
	public void setIgnoreSerializString(String ignoreSerializString) {
		this.ignoreSerializString = ignoreSerializString;
	}
	public static String getNotBelongsToObjectString() {
		return notBelongsToObjectString;
	}
	public static void setNotBelongsToObjectString(String notBelongsToObjectString) {
		Employee.notBelongsToObjectString = notBelongsToObjectString;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", ignoreSerializString=" + ignoreSerializString + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
