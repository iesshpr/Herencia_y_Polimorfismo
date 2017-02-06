public class SuperClase {
	private int datoClase;

	public SuperClase(int datoEnv) {

		datoClase = datoEnv;
		System.out.println("\n\tHemos entrado en la función constructora de la superclase");
	}

	public void visualDatoSuperClase() {
		System.out.println("\n\n\n\tEl dato de la súper clase es " + datoClase);
	}
}
