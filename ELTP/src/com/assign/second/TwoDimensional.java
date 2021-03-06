package com.assign.second;

public abstract class TwoDimensional extends ShapeDemo{

	private String name;
	private double area,perimeter;
	
	public TwoDimensional(String name){
		super();
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public abstract void calculatePeimeter();
	public  abstract void calculateArea();
	
	
	
}
