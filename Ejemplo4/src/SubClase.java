public class SubClase extends SuperClase {
	public SubClase(int datoEnvSubClase) {
		/*
		 * La subclase solo quiere el dato recibido para enviárselo a la
		 * superclase.
		 */
		super(datoEnvSubClase);
		System.out.println("\n\t\tHemos entrado en la función constructora de la subclase");
	}
}