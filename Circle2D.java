import java.util.Scanner;
public class Circle2D {
	
	//instance variables or data fields
	double x, y;
	double radius;
	
	public double getRadius() {
		return radius;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public Circle2D() {
		x=0;
		y=0;
		radius=1;
	}

	
	
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	
	
	public boolean contains(double x1, double y1) {
	
		double differenceInXCoordinates = Math.abs(x - x1);
		double differenceInYCoordinates = Math.abs(y - y1);
		if (differenceInXCoordinates < radius && differenceInYCoordinates < radius)
			return true; 	
		else 
			return false;
	}
    
	
	
	public Circle2D(double x, double y, double radius ) {
		
		this.x = x;
		this.y = y;
		this.radius=radius;
	}
	public boolean contains(Circle2D circle) {
		
	
		double distance_between_centers_of_circles = Math.sqrt(((x-circle.getX())*(x-circle.getX()))+((y-circle.getY())*(y-circle.getY())));
		if(radius < distance_between_centers_of_circles + circle.getRadius())
			 return false;
		else
			return true;
	}
	 
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the coordinates of the center (x , y) of the original circle:  ");
		double xOfOriginalCircle = scan.nextDouble();
		double yOfOriginalCircle = scan.nextDouble();
		System.out.println("Enter the radius of the original circle: ");
		double radiusOfOriginalCircle= scan.nextDouble();
		Circle2D circle = new Circle2D(xOfOriginalCircle , yOfOriginalCircle, radiusOfOriginalCircle);
		
		
		System.out.println("\nEnter the coordinates of the point (x,y) whose containment is to be checked: ");
		double xCoordinate = scan.nextDouble();
		double yCoordinate = scan.nextDouble();
		System.out.println(
				"Does the given point lie inside the original circle? " + 
								circle.contains(xCoordinate,yCoordinate)			
				);
		
		
		
		System.out.println("\nEnter the center (x,y) and radius of a new circle: ");
		double xOfNewCircle = scan.nextDouble();
		double yOfNewCircle = scan.nextDouble();
		double radiusOfNewCircle = scan.nextDouble();
		Circle2D circle1 = new Circle2D(xOfNewCircle,yOfNewCircle,radiusOfNewCircle);
		System.out.println("Does the new circle lie inside the original circle: "+ circle.contains(circle1));
		
		
		
		System.out.println("\nEnter the center (x,y) of new circle and radius of a new circle: ");
		double xcoordinate=scan.nextDouble();
		double ycoordinate=scan.nextDouble();
		double radiusofcircle=scan.nextDouble();
		Circle2D circle2 = new Circle2D(xcoordinate,ycoordinate,radiusofcircle);
		System.out.println("Does the new circle overlaps the original circle? " + circle.overlaps(circle2));
		
		
		
	}
	
	public boolean overlaps(Circle2D circle) {
		 double difference_in_Xcoordinates = Math.abs(x-circle.getX());
		 double difference_in_Ycoordinates = Math.abs(y-circle.getY());
		 double difference_in_radius = Math.abs(radius-circle.getRadius());
		 if(difference_in_Xcoordinates==0 && difference_in_Ycoordinates==0 && difference_in_radius==0)
			 return true;
		 else
			 return false;
		 
	 }


}
