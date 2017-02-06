import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {
		Empleado empleados[];
		Jefe jefes[];
		int numemp, numjefes;
		int op;
		System.out.print("Indique los empleados que hay en la empresa: ");
		numemp = Leer.pedirEnteroValidar();
		empleados = new Empleado[numemp];
		for (int pos = 0; pos < numemp; pos++)
			empleados[pos] = new Empleado();
		System.out.print("\n\nIndique el número de jefes que hay en la empresa: ");
		numjefes = Leer.pedirEnteroValidar();
		jefes = new Jefe[numjefes];
		for (int pos = 0; pos < numjefes; pos++)
			jefes[pos] = new Jefe();
		visualtodosJefes(jefes);
		visualtodosEmpleados(empleados);
	}

	static void visualtodosEmpleados(Empleado empleados[]) {
		int pos;		
		System.out.println("Los datos de los empleados (que no son jefes) en la empresa son: ");
		for (pos = 0; pos < empleados.length; pos++) {
			empleados[pos].visualTodosDatos();
			System.out.print("\n\n\nPulse una tecla para continuar ");
			System.out.print("con la ejecución del programa: ");
			Leer.pedirCadena();
		}
	}

	static void visualtodosJefes(Jefe jefes[]) {
		int pos;
		System.out.println("Los datos de los jefes que hay en la empresa son: ");
		for (pos = 0; pos < jefes.length; pos++) {
			jefes[pos].visualTodosDatos();
			System.out.print("\n\n\nPulse una tecla para continuar ");
			System.out.println("con la ejecución del programa: ");
			Leer.pedirCadena();
		}
	}
}
