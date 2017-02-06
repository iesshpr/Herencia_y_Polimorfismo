
public class Empleado {
	private String nombre;
	private float sueldo;
	
	public void setNombre(String nombre){	
		this.nombre=nombre;
	}
	
	public void setSueldo(float sueldo){		
		this.sueldo=sueldo;
	}
	
	public void setTodo(String nombre,float sueldo){
		this.nombre=nombre;
		this.sueldo=sueldo;
	}
	public String imprimeNombre(){
		return "\n\t\tNOMBRE " + nombre;
	}
	
	public String imprimeSueldo(){
		return "\n\t\tSUELDO " + sueldo;
	}
	public String imprimeTodo(){		
		return imprimeNombre() + imprimeSueldo();
	}

}
