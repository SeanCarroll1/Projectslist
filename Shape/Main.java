package Shape;

public class Main 
{
	public static void main (String [] args)
	{
		Shape shape= new Circle(3);
		Shape rect =new Rectangle(5,5);
		
		System.out.println(shape.area());
		System.out.println(rect.area());
	}
}
