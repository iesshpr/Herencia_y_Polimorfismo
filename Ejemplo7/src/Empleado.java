import utilidades.Leer;

public class Empleado {
	private String nom;
	private int edad;

	public Empleado() {
		pedirDatos();
	}

	public void pedirDatos() {
		System.out.println("\nVamos a insertar los datos del empleado: ");
		System.out.print("\n\n\n\tNOMBRE: ");
		nom = Leer.pedirCadena();
		System.out.print("\n\n\tEDAD: ");
		edad = Leer.pedirEnteroValidar();
	}

	public void visualTodosDatos() {
		System.out.print("\n\n\nSus datos son: ");
		System.out.println("\n\n\n\tNOMBRE: " + nom);
		System.out.println("\n\n\tEDAD: " + edad);
	}
}
