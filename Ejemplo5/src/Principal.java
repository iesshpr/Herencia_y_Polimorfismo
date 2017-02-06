import utilidades.Leer;
public class Principal {

	public static void main(String [] args) {
		int alto, ancho, grosor;
		System.out.println("Vamos a ver la dimension de una línea: ");
		VerUnaDimension lin1 = new VerUnaDimension(); // aqui se ejecuta el constructor de la clase Linea
		lin1.verLinea();
		
		System.out.println("\nVamos a ver las dimensiones de un rectangulo: ");
		VerDosDimensiones rect1 = new VerDosDimensiones();//se ejecuta el constructor de la clase Area
								// que llama primero al constructor de la clase Linea
		rect1.verArea();
		
		System.out.println("\nVamos a ver las dimensiones de una caja: ");
		VerTresDimensiones caja1 = new VerTresDimensiones();//primero se ejecuta el constructor de la clase AreaPoli
									// que llama al constructor de la clase Area
									//que llama al constructor de la clase Linea
		caja1.verVolumenPoli();
		
		System.out.println("\nPedimos ancho, alto y grosor de una caja." +
				"\nVeremos lo que ocupa una linea de esa caja, el area" +
				" de una de sus caras y el espacio que ocupa la caja.");
		System.out.print("\nAncho de una cara de la caja?  ");
		
		ancho=Leer.pedirEnteroValidar();
		System.out.print("\nAlto de esa cara de la caja?  ");
		
		alto=Leer.pedirEnteroValidar();
		System.out.print("\nGrosor de la caja?  ");
		
		grosor=Leer.pedirEnteroValidar();
		VerTresDimensiones caja2 = new VerTresDimensiones(ancho, alto, grosor);
		
		caja2.verLinea();
		caja2.verArea();
		caja2.verVolumenPoli();
	}//main

}//class
