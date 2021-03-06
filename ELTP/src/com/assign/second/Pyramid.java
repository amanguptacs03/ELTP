package com.assign.second;

public class Pyramid extends ThreeDimensional {
private double length ,width ,height;


	public Pyramid(double length, double width, double height) {
	super("pyramid");
	this.length = length;
	this.width = width;
	this.height = height;
}
	
	

	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	@Override
	public void calculateVolume() {
	setVolume((length*width*height)/3);

	}

	@Override
	public void calculateSurfaceArea() {
		setsArea(length*width+length*Math.sqrt((Math.pow((width/2), 2))+(height*height))+width*Math.sqrt((Math.pow((length/2), 2))+(height*height)));		// TODO Auto-generated method stub

	}

}
