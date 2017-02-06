import utilidades.Leer;

public class VerTresDimensiones extends VerDosDimensiones {
	private int grosor;

	public VerTresDimensiones() {

		System.out.print("\n\tlndique grosor del rectángulo: ");
		grosor = Leer.pedirEnteroValidar();
	}

	public VerTresDimensiones(int ancho, int alto, int grosor) {
		super(alto, ancho);
		this.grosor = grosor;
	}

	public void verVolumenPoli() {
		System.out.println("\n\n\tUna caja con estos datos: ");
		System.out.println("\n\t\tANCHURA: " + getAncho());
		System.out.println("\n\t\tALTO: " + getAlto());
		System.out.println("\n\t\tGROSOR: " + grosor);
		System.out.println("\n\t\t\tOCUPA UN VOLUMEN DE: " + getAncho()
				* getAlto() * grosor);
	}
}
