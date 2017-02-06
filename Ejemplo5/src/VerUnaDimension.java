import utilidades.Leer;

public class VerUnaDimension {

	private int ancho;

	public VerUnaDimension() {
		System.out.print("\n\tIndique cual es su anchura: ");
		ancho = Leer.pedirEnteroValidar();
	}

	public VerUnaDimension(int ancho) {
		this.ancho = ancho;
	}
	
	public void verLinea() {
		System.out.println("\n\t\tLA LINEA TIENE UNA ANCHURA DE " + ancho);
	}

	public int getAncho() {
		return ancho;
	}
}