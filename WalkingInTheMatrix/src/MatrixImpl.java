
public class MatrixImpl implements Matrix {
	
	private final Object[][] array = {
			{"A", "B", "C", "D", "E", "F", "G", "H"},
			{"I", "J", "K", "L", "M", "N", "O",},
			{"P", "Q", "R", "S", "T", "U", "V", "W"},
			{"X", "Y", "Z", "AA", "AB", "AC", "AD", "AE"},
			{"AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM"},
			{"AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU"},
			{"AV", "AW", "AX", "AY", "AZ", "BA", "BB", "BC"},
			{"BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BK"}
	};
	private int i = 0;
	private int j = 0;
	
	@Override
	public void moveFoward() {
		if (i == 0) i = 7;
		else --i;
	}
	
	@Override
	public void moveBack() {
		if (i == 7) i = 0;
		else ++i;
	}
	
	@Override
	public void moveLeft() {
		if (j == 0) j = 7;
		else --j;
	}
	
	@Override
	public void moveRight() {
		if (j == 7) j = 0;
		else ++j;
	}
	
	@Override
	public String toString() {
		return String.format("The current position is %s em [%d][%d].", array[i][j], i, j);
	}
	
}
