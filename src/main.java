import java.util.Scanner;

import co.edu.uelbosque.controller.SumaController;
import co.edu.uelbosque.model.DataInput;
import co.edu.uelbosque.model.DataOutput;

/**
 * @author brian
 *
 */
public class main {

	/**
	 * @param args
	 */
	
	// Se asume que la vista del programa esta definida en la funcion main
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		// Leyendo el primer valor
		System.out.println ("Ingrese el primer valor: ");
		String val1 = leer.next();
		
		// Leyendo el segundo valor
		System.out.println ("Ingrese el segundo valor: ");
		String val2 = leer.next();
		
		// Crear objeto de tipo DataInput para alimentar al controller que generara el proceso de suma
		DataInput in = new DataInput(val1, val2);
		
		// Llamada al metodo sumar definido en el controller SumaController, encargado de procesar la suma
		DataOutput out = SumaController.sumar(in);
		
		// Se imprime el resultado
		System.out.println("El resultado de la suma es: " + out.getResult());
		
		leer.close();

	}

}
