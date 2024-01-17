import java.text.DecimalFormat;
import java.util.Locale;

public class Rectangle extends Area {

	protected Rectangle(double a, double b) {
		super(a, b);
	}

	@Override
	public String getArea() {
		double area = a * b;
		Locale.setDefault(Locale.US);
		return new DecimalFormat("#,###.00").format(area);
	}

}
