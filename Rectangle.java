
public class Rectangle {
	private double width;
	private double height;
	
	private String color;
	
	public Rectangle()
	{
		width = 1;
		height = 1;
		
		color = "White";
	}
	
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public double getArea()
	{
		return height = width;
	}
	
	public double getPerimeter()
	{
		return 2*height + 2*width;
	}

}


