package sab;

class circle {

		private final double PI = 3.14;
		private double diameter, circumference, area;
		
		public circle(double d) {
			// TODO Auto-generated constructor stub
		}
		public void Circle(double diameter) {
			this.diameter = diameter;

		}
		public void calculateCircumference()
		{
			circumference = PI * diameter;
		}
		public void calculateArea()
		{
			area = PI * (diameter/2) * (diameter/2);
		}
		public double getDiameter() {
			return diameter;
		}
		public void setDiameter(double diameter) {
			this.diameter = diameter;
		}
		public double getCircumference() {
			return circumference;
		}
		public void setCircumference(double circumference) {
			this.circumference = circumference;
		}
		public double getArea() {
			return area;
		}
		public void setArea(double area) {
			this.area = area;
		}
		public double getPI() {
			return PI;
		}
		
	}
	class Circle_Tester{
		public static void main(String[] args) {
			circle circle1 = new circle(10.20);
			circle circle2 = new circle(5.7);
			//Create more objects of Circle class and add to the array given below for testing your code
			circle[] circles = {circle1, circle2};
			for (circle circle : circles) {
			circle.calculateCircumference();
				circle.calculateArea();
				System.out.println("Diameter of the circle is "+circle.getDiameter());
				System.out.println("Circumference of the circle is " + Math.round(circle.getCircumference()*100)/100.0);
				System.out.println("Area of the circle is " + Math.round(circle.getArea()*100)/100.0);
				System.out.println();
			}
		}
	}



