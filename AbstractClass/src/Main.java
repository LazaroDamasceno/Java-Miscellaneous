
public class Main {

	public static void main(String[] args) {
		Area square = new Square(12);
		System.out.println(square.getArea());
		
		Area rectangle = new Rectangle(13, 14);
		System.out.println(rectangle.getArea());
		
		Area trapezium = new Trapezium(15, 16, 17);
		System.out.println(trapezium.getArea());
		
		Area cylinder = new Cylinder(18, 19);
		System.out.println(cylinder.getArea());
	}

}
