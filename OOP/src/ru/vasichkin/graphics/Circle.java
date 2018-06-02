package ru.vasichkin.graphics;



public class Circle extends Shape {
	
	public int x;
	public int y;
	public double radius;
	
	public double getSquare() {
		return Math.PI*radius*radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if(radius>0)
			this.radius = radius;
		else
			throw new RuntimeException("radius <=0");
	}
	public Circle(int x,int y,double radius) {
		this(x,y,radius,DEFAULT_COLOR);
	}
	public Circle(int x,int y,double radius,String color){
		super.color=color;
		this.x=x;
		this.y=y;
		setRadius(radius);		
	}

	public void scale(double d) {
		//this.radius=this.radius*d;
		setRadius(getRadius()*d);
	}
	
	@Override
	public void draw() {
		System.out.printf("Circle: x = %1$-10d y = %2$-10d radius = %3$-10.3f color = %4$-10s\n",this.x,this.y,getRadius(),color);
	}
	@Override
	public String toString() {
	return 	String.format("Circle (%1$d, %2$d) radius = %3$.3f color: %4$s\n",this.x,this.y,this.radius,color);
	}
	@Override
	public Circle clone() {
		return new Circle(this.x,this.y,getRadius(),this.color);
	}
}
