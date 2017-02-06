import utilidades.Leer;
public class Empleado {
	private String nombre;
	private float sueldo;
	
	public void setNombre(){
		System.out.print("\n\t\tNOMBRE ");
		nombre=Leer.pedirCadena();
		return;
	}
	
	public void setSueldo(){
		System.out.print("\n\t\tSUELDO ");
		sueldo=Leer.pedirFloat();
		return;
	}
	
	public void setTodo(){
		setNombre();
		setSueldo();
		return;
	}
	public void getNombre(){
		System.out.print("\n\t\tNOMBRE " + nombre);
		return;
	}
	
	public void getSueldo(){
		System.out.print("\n\t\tSUELDO " + sueldo);
		return;
	}
	public void getTodo(){
		getNombre();
		getSueldo();
		return;
	}
}
