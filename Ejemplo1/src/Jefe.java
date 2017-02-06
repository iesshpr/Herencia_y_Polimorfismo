import utilidades.Leer;
public class Jefe extends Empleado{
	private String departJefe;
	private String titulUniv;
	
	public void setDepartJefe(){
		System.out.print("\n\t\tDEPARTAMENTO DEL QUE ES JEFE? ");
		departJefe=Leer.pedirCadena();
		return;
	}
	
	public void setTitulUniv(){
		System.out.print("\n\t\tTITULO UNIVERSITARIO? ");
		titulUniv=Leer.pedirCadena();
		return;
	}
	
	public void setTodo(){
		super.setTodo();
		setDepartJefe();
		setTitulUniv();		
	}
	
	public void getDepartJefe(){
		System.out.print("\n\t\tES JEFE DEL DEPARTAMENTO:  " + departJefe);
	}
	public void getTitulUniv(){
		System.out.print("\n\t\tTIENE COMO TITULO UNIVERSITARIO: " + titulUniv);
	}
	
	public void getTodo(){
		super.getTodo();
		getDepartJefe();
		getTitulUniv();
	}
}
