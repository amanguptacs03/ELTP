package com.assign.second;



public class ShapeDemo {
public static void main(String[] args) {
	Circle c=new Circle(2.5);
	Rectangle r=new Rectangle(12.5, 15.6);
	Triangle t=new Triangle(4,4,5);
	
	Cube cu=new Cube(4);
	Sphere s=new Sphere(6);
	Pyramid p=new Pyramid(8, 4, 12);
	
	ShapeDemo[] sd= {c,r,t,cu,s,p};
	for(ShapeDemo so: sd) {
		shapeManager(so);
}
}

public static void shapeManager(ShapeDemo so)
{
	 if(so instanceof TwoDimensional) {
		 ((TwoDimensional) so).calculateArea();
		 ((TwoDimensional) so).calculatePeimeter();
		 System.out.println(String.format("%25s", "NAME |")+((TwoDimensional) so).getName());
		 System.out.println(String.format("%25s", "AREA |")+((TwoDimensional) so).getArea());
		 System.out.println(String.format("%25s", "PERIMETER |")+((TwoDimensional) so).getPerimeter());
		 System.out.println("---------------------------------------------------------------------------");
	 }
	 if(so instanceof ThreeDimensional) {
		 ((ThreeDimensional) so).calculateSurfaceArea();
		 ((ThreeDimensional) so).calculateVolume();
		 System.out.println(String.format("%25s", "NAME |")+((ThreeDimensional) so).getName());
		 System.out.println(String.format("%25s", "VOLUME |")+((ThreeDimensional) so).getVolume());
		 System.out.println(String.format("%25s", "SURFACE AREA |")+((ThreeDimensional) so).getsArea());
		 System.out.println("---------------------------------------------------------------------------");
	 }
}

}
