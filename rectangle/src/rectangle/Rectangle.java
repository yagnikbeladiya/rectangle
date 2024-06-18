package rectangle;

public class Rectangle {

	    int length;
	    int breadth;

	    public Rectangle(int length, int breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    public void printArea() {
	        int area = length * breadth;
	        System.out.println("Area of the rectangle: " + area);
	    }

	    public void printPerimeter() {
	        int perimeter = 2 * (length + breadth);
	        System.out.println("Perimeter of the rectangle: " + perimeter);
	    }
	}


