import utilidades.Leer;

public class VerDosDimensiones extends VerUnaDimension {
	private int alto;

	public VerDosDimensiones() {
		System.out.print("\n\tIndique la altura del rectángulo: ");
		alto = Leer.pedirEnteroValidar();
	}

	public VerDosDimensiones(int alto, int ancho) {
		super(ancho);
		this.alto = alto;
	}

	public void verArea() {
		System.out.println("\n\tUn rectángulo con estos datos: ");
		System.out.println("\n\t\tANCHURA: " + getAncho());
		System.out.println("\n\t\tALTO: " + alto);
		System.out.println("\n\t\t\tLA CARA OCUPA UN ÁREA DE: " + getAncho() * alto + "\n");
	}

	public int getAlto() {
		return alto;
	}
}