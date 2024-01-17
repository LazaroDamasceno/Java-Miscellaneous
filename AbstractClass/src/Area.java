
public abstract class Area {

	protected double a;
	protected double b;
	protected double c;
	
	protected Area(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	protected Area(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	protected Area(double a) {
		this.a = a;
	}
	
	public abstract String getArea();
	
}
