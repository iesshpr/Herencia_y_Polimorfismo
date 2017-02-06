
public class Principal {

	public static void main(String[] args) {
		Empleado emple = new Empleado();
		Jefe jefe = new Jefe();
		System.out.println("\n\tVamos a insertar los datos del empleado: ");
		emple.setTodo();
		System.out.println("\n\tVamos a insertar los datos del jefe: ");
		jefe.setTodo();
		System.out.println("\n\tVamos a mostrar los datos del empleado: ");
		emple.getTodo();
		System.out.println("\n\tVamos a mostrar los datos del jefe: ");
		jefe.getTodo();
	}
}
