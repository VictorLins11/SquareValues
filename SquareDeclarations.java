public class SquareDeclarations {
	
	private double side;
	private double area;
	private double perimeter;
	
	public SquareDeclarations() {
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getArea() {
		return (side * 4);
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return (side * side);
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
}