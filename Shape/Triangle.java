package Shape;

public class Triangle extends Shape 
{
	Triangle(double s, double s2, double s3)
	{
		setTraingleSides(s,s2,s3);
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double perimeter() 
	{
		// TODO Auto-generated method stub
		return getSide1() + getSide2() + getSide3();
	}

}
