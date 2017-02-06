
public class Jefe extends Empleado{
	private String departJefe;
	private String titulUniv;
	
	public void setDepartJefe(String departJefe){		
		this.departJefe=departJefe;
	}
	
	public void setTitulUniv(String titulUniv){
		this.titulUniv=titulUniv;
	}
	
	public void setTodo(String nombre,float sueldo, String departJefe, String titulUniv){
		super.setTodo(nombre, sueldo);
		setDepartJefe(departJefe);
		setTitulUniv(titulUniv);		
	}
	
	public String imprimeDepartJefe(){
		return "\n\t\tES JEFE DEL DEPARTAMENTO:  " + departJefe;
	}
	public String imprimeTitulUniv(){
		return "\n\t\tTIENE COMO TITULO UNIVERSITARIO: " + titulUniv;
	}
	
	public String imprimeTodo(){
		return super.imprimeTodo() + imprimeDepartJefe() + imprimeTitulUniv();
	}
}
