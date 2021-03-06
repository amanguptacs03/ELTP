package com.assign.second;

public class Sphere extends ThreeDimensional{
	private double radius;
	
	public Sphere(double radius) {
		super("Sphere");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculateVolume() {
	setVolume(4/3*Math.PI*radius*radius*radius);
		
	}

	@Override
	public void calculateSurfaceArea() {
		setsArea(4*Math.PI*radius*radius);
		
	}
	
}
