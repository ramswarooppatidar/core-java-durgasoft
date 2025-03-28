package com.stringStringBuilderDuffer;

final public class ImmutableClass {
	private int i;
	public ImmutableClass(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}
	public ImmutableClass modify(int i) {
		if(this.i == i) {
			return this;
		}else {
			return new ImmutableClass(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClass t1 = new ImmutableClass(10);
		ImmutableClass t2 = t1.modify(100);
		System.out.println(t2.i);
		System.out.println(t1.i);
		

	}

}
