package tcscore;

public abstract class Shape {
	protected double length;
	protected double breadth;
	protected double radius;
	public Shape(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public Shape(double radius) {
		this.radius = radius;
	}
	abstract void area();
}
