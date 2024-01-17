package shapes;
import java.text.DecimalFormat;
import java.util.Locale;

import abstractclass.Area;

public class Cylinder extends Area {

	protected Cylinder(double a, double b) {
		super(a, b);
	}

	@Override
	public String getArea() {
		double area = 2 * Math.PI * (a + b);
		Locale.setDefault(Locale.US);
		return new DecimalFormat("#,###.00").format(area);
	}

}
