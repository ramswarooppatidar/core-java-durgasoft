package com.stringStringBuilderDuffer;

public class Practice4 {

	String string;
	public Practice4(String str) {
		// TODO Auto-generated constructor stub
		this.string = str;
	}
	
	@Override
	public String toString() {
		return "Practice4 [string=" + string + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//s sb sb colection wrapper class all overdie toString();
		System.out.println("hello"+ new StringBuilder("java se 8"));
		System.out.println("hello"+ new Practice4("java se 8"));

	}

}
