package Shape;

public abstract class Shape
{
	//Set varaible for different shapes.
	private double length, width;
	private double radius;
	private double side1,side2,side3;
	
	//set width.
	public void setWidth(double w)
	{
		this.width=w;
	}
	//set length
	public void setLength(double l)
	{
		this.length=l;
	}
	
	//set radius for circle.
	public void setRadius(double r)
	{
		this.radius=r;
	}
	
	//set sides of the triangle.
	public void setTraingleSides(double s,double s2,double s3)
	{
		this.side1=s;
		this.side2=s2;
		this.side3=s3;
	}
	
	//return width value.
	public double getWidth()
	{
		return this.width;
	}
	//return length value.
	public double getLength()
	{
		return this.length;
	}
	
	//return radius.
	public double getRadius()
	{
		return this.radius;
	}
	
	public double getSide1()
	{
		return this.side1;
	}
	
	public double getSide2()
	{
		return this.side2;
	}
	
	public double getSide3()
	{
		return this.side3;
	}
	
	//abstract methods to be used in sub classes
	abstract double area();
	
	abstract double perimeter();
}