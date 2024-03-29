package shapes;
import java.text.DecimalFormat;
import java.util.Locale;

import abstractclass.Area;

public class Trapezium extends Area {

	protected Trapezium(double a, double b, double c) {
		super(a, b, c);
	}

	@Override
	public String getArea() {
		double area = 0.5 * ((a + b) * c);
		Locale.setDefault(Locale.US);
		return new DecimalFormat("#,###.00").format(area);
	}

}
