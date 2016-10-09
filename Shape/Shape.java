package Shape;

public abstract class Shape
{
	private double length, width;
	private double radius;
	private double side1,side2,side3;
	
	public void setWidth(double w)
	{
		this.width=w;
	}
	
	public void setLength(double l)
	{
		this.length=l;
	}
	
	public void setRadius(double r)
	{
		this.radius=r;
	}
	
	public void setTraingleSides(double s,double s2,double s3)
	{
		this.side1=s;
		this.side2=s2;
		this.side3=s3;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public double getLength()
	{
		return this.length;
	}
	
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
	
	
	abstract double area();
	
	abstract double perimeter();
}