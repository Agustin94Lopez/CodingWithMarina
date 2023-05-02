public class Recursivitat {
	private int x=33;
	public static void main(String args[]) {
		Recursivitat programa = new Recursivitat();
		programa.Inicio();
	}

	public void Inicio() {
		recursividad(x);
	}
	public void recursividad(int x) {
		if (x >0) {
			if (x % 2 == 0) {
				System.out.println("El nombre " + x + " és parell");
			} else {
				System.out.println("El nombre " + x + " és senar");
			}
			recursividad(x - 1);
		}
	}
}