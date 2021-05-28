class Rectangle{

	double area, length, height;

	Rectangle(double length, double height){
		this.length = length;
		this.height = height;
		this.area = length*height;

	}
	Rectangle(){}

	public double calculateArea(){
		return length*height;
	}
	public static void Display(){

	}


}
class Circle{

	double area, radius;

	double pi = 3.14159265359;

	Circle(double radius){
		this.radius = radius;
		this.area = 2*pi*radius;

	}
	Circle(){}

	public double calculateArea(){
		return 2*pi*radius;
	}
	public static void Display(){

	}

}
class Triangle{

	double area, length, height;

	Triangle(double length, double height){
		this.height = height;
		this.length = length;
		this.area = length*height/2;
	}
	Triangle(){}


	public  double calculateArea(){
		return length*height/2;
	}
	public static void Display(){

	}

}

public class Assignment6{

     public static void main(String []args){

     	Circle c = new Circle();
     	Rectangle r = new Rectangle();
     	Triangle t = new Triangle();


    }
}	
