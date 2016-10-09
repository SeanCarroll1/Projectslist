package Shape;

public class Rectangle extends Shape {

	//Constructor set width and length of rectangle.
	Rectangle (double w, double l)
	{
		setWidth(w);
		setLength(l);
	}
	
	//Return area of rectangle.
	@Override
	double area()
	{
		return getWidth()*getLength();
	}

	//Return Perimeter of Rectangle.
	@Override
	double perimeter()
	{
		return 2* (getWidth() + getLength());
	}

}
