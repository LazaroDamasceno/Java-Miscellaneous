
public class Main {

	public static void main(String[] args) {
		Matrix matrix = new MatrixImpl();
		System.out.println(matrix);
		matrix.moveRight();
		System.out.println(matrix);
		matrix.moveFoward();
		System.out.println(matrix);
		matrix.moveFoward();
		System.out.println(matrix);
		matrix.moveBack();
		System.out.println(matrix);
		matrix.moveBack();
		System.out.println(matrix);
		matrix.moveLeft();
		System.out.println(matrix);
	}

}
