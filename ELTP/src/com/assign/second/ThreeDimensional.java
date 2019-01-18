package com.assign.second;

public abstract class ThreeDimensional extends ShapeDemo {

	private String name;
	private double sArea,volume;
	
	public ThreeDimensional(String name){
		super();
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getsArea() {
		return sArea;
	}
	public void setsArea(double sArea) {
		this.sArea = sArea;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	
	
	public abstract void calculateVolume();
	public  abstract void calculateSurfaceArea();
	


}
