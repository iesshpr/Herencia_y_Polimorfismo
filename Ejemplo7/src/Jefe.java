import utilidades.Leer;

public class Jefe extends Empleado {
	String nomDeparJefe;

	public Jefe() {
		System.out.println("\n\tVamos a insertar, los datos que le corresponde, como jefe que es: ");
		pedirDatosJefe();
	}

	public void pedirDatosJefe() {

		System.out.print("\t\t\tNombre del departamento donde ejerce la jefatura: ");
		nomDeparJefe = Leer.pedirCadena();
	}

	@Override
	public void visualTodosDatos() {
		super.visualTodosDatos();
		System.out.println("\t\t\tNombre del departamento donde ejerce la jefatura: "
		                    + nomDeparJefe);
	}
}
