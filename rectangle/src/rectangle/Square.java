package rectangle;

public class Square extends Rectangle {

	
	    public Square(int side) {
	        super(side, side);
	    }

	    @Override
	    public void printArea() {
	        int area = length * breadth;
	        System.out.println("Area of the square: " + area);
	    }

	    @Override
	    public void printPerimeter() {
	        int perimeter = 2 * (length + breadth);
	        System.out.println("Perimeter of the square: " + perimeter);
	    }
	}

