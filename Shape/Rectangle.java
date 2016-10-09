package Shape;

public class Rectangle extends Shape {

	Rectangle (double w, double l)
	{
		setWidth(w);
		setLength(l);
	}
	@Override
	double area()
	{
		return getWidth()*getLength();
	}

	@Override
	double perimeter()
	{
		return 2* (getWidth() + getLength());
	}

}
