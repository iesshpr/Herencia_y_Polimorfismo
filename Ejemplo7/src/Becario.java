import utilidades.Leer;

public class Becario extends Empleado {
	String univEstud;

	public Becario() {
		System.out.println("\n\tVamos a insertar, los datos que le corresponde, como becario que es: ");
		pedirDatosBecario();
	}

	public void pedirDatosBecario() {
		System.out.print("\t\t\tNombre de la universidad donde estudia el becario: ");
		univEstud = Leer.pedirCadena();
	}

	@Override
	public void visualTodosDatos() {
		super.visualTodosDatos();
		System.out.print("\n\n\tNOMBRE DE LA UNIVERSIDAD DONDE ESTUDIA: "
				+ univEstud);
	}
}