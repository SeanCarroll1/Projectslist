package Shape;

public class Circle extends Shape
{
	//Constructor , set radius .
	Circle(double r)
	{
		setRadius(r);
	}
	
	//Return area for circle.
	@Override
	double area() {
		// TODO Auto-generated method stub
		 return Math.PI * Math.pow(getRadius(), 2);
	}

	//Return perimeter for Circle.
	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * getRadius();
	}
	
}
