package rectangle;

public class Main {
	    public static void main(String[] args) {
	    	
	        Rectangle rectangle = new Rectangle(4, 5);
	        System.out.println("Rectangle:");
	        rectangle.printArea();
	        rectangle.printPerimeter();

	        Square square = new Square(4);
	        System.out.println("\nSquare:");
	        square.printArea();
	        square.printPerimeter();
	    }
	}

	
	


