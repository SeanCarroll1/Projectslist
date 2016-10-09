package Shape;

public class Circle extends Shape
{

	Circle(double r)
	{
		setRadius(r);
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		 return Math.PI * Math.pow(getRadius(), 2);
	}

	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * getRadius();
	}
	
}
