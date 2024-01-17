import java.text.DecimalFormat;
import java.util.Locale;

public class Square extends Area {

	protected Square(double a) {
		super(a);
	}

	@Override
	public String getArea() {
		double area = a * a;
		Locale.setDefault(Locale.US);
		return new DecimalFormat("#,###.00").format(area);
	}

}
