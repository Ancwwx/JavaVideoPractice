package com.hspedu.homework;

public class LabeledPoint extends Point {
	private String lable;

	public LabeledPoint(String label,double x, double y) {
		super(x, y);
		this.lable = lable;
	}

}