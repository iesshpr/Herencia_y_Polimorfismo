import utilidades.Leer;

public class Empleado {
	private String nom;
	private int edad;

	public Empleado() {
		indicaTipoPersonal();
		pedirDatos();
	}
	
	public void pedirDatos() {
		System.out.println("\nVamos a insertar los datos del empleado: ");
		System.out.print("\n\n\n\tNOMBRE: ");
		nom = Leer.pedirCadena();
		System.out.print("\n\n\tEDAD: ");
		edad = Leer.pedirEnteroValidar();
	}

	public static void indicaTipoPersonal() {
		System.out.println("\n\n\tESTA PERSONA ES UN EMPLEADO DE LA EMPRESA.");
	}

	public void visualTodosDatos() {
		System.out.print("\n\n\nSe va a visualizar los datos de un empleado:");
		System.out.println("\n\n\n\tNOMBRE: " + nom);
		System.out.println("\n\n\tEDAD: " + edad);
	}
}