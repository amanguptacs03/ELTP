package com.assign.second;

public class Cube extends ThreeDimensional {

	private double side;
	
	
	
	public Cube(double side) {
		super("Cube");
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public void calculateVolume() {
		setVolume(side*side*side);

	}

	@Override
	public void calculateSurfaceArea() {
		setsArea(6*side*side);

	}

}
