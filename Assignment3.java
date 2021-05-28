interface Shape{
	public double calculateArea();
	public void Display();
}

class Rectangle implements Shape{

	double area, length, height;

	Rectangle(double length, double height){  
		this.length = length;
		this.height = height;
		this.area = length*height;

	}
	Rectangle(){} //default constuctor 

	public double calculateArea(){
		return length*height;
	}
	public void Display(){
		int x;
	}


}
class Circle implements Shape{

	double area, radius;

	double pi = 3.14159265359;

	Circle(double radius){
		this.radius = radius;
		this.area = pi*(radius*radius);

	}
	Circle(){}

	public double calculateArea(){
		return pi*(radius*radius);
	}
	public void Display(){
		int x;
	}

}
class Triangle implements Shape{

	double area, length, height;

	Triangle(double length, double height){
		this.height = height;
		this.length = length;
		this.area = length*height/2;
	}
	Triangle(){}


	public double calculateArea(){
		return length*height/2;
	}
	public void Display(){
		int x;
	}

}

public class Assignment3{

     public static void main(String []args){

     	Circle c = new Circle();
     	Rectangle r = new Rectangle();
     	Triangle t = new Triangle();


    }
}	
