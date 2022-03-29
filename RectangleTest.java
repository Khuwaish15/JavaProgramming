
public class RectangleTest {
	public static void main(String[] args)
	{
		Rectangle rect1 = new Rectangle(4, 40);
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		
		rect1.setColor("Red");
		rect2.setColor("Red");
		
		System.out.println("Rectangle one:");
		System.out.println("Width: " + rect1.getWidth());
		System.out.println("Height: " + rect1.getHeight());
		System.out.println("Color: " + rect1.getArea());
		System.out.println("Perimeter: " + rect1.getPerimeter());
		System.out.println();
		System.out.println("Rectangle two:");
		System.out.println("Rectangle one:");
		System.out.println("Width: " + rect2.getWidth());
		System.out.println("Height: " + rect2.getHeight());
		System.out.println("Color: " + rect2.getArea());
		System.out.println("Perimeter: " + rect2.getPerimeter());
}

}
