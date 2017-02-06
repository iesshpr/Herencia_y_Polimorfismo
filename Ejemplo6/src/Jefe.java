import utilidades.Leer;

public class Jefe extends Empleado {
	private String nomdeparjefe;

	public Jefe() {
		indicaTipoPersonal();
		pedirDatosJefe();
	}

	public static void indicaTipoPersonal() {
		System.out.println("\n\n\tDICHO EMPLEADO ES RESPONSABLE DE UN DEPARTAMENTO.");
	}

	public void pedirDatosJefe() {
		System.out.print("\t\t\t NOMBRE DEL DEPARTAMENTO DONDE EJERCE LA JEFATURA: ");
		nomdeparjefe = Leer.pedirCadena();
	}

	
	public void visualTodosDatos() {
		/*
		 * Aquí sobrescribimos el método visualTodosDatos() que tiene la clase
		 * Empleado.
		 */
		super.visualTodosDatos(); /*
								 * Llamamos al método visualTodosDatos() que
								 * tiene la clase Empleado.
								 */
		System.out.print("\n\n\tNOMBRE DEL DEPARTAMENTO DONDE ");
		System.out.println(" EJERCE LA JEFATURA: " + nomdeparjefe);
	}
}
