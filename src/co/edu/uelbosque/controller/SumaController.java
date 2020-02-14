package co.edu.uelbosque.controller;

import co.edu.uelbosque.model.DataInput;
import co.edu.uelbosque.model.DataOutput;

public class SumaController {

	public static DataOutput sumar(DataInput input) {
		
		DataOutput out = new DataOutput();
		
		// separar numero de letra para el input 1
		int cant = input.getData1().length();
		String letter1 = input.getData1().substring(cant-1, cant);
		int num1 = Integer.parseInt(input.getData1().substring(0, cant-1));
		
		// separar numero de letra para el input 2
		cant = input.getData2().length();
		String letter2 = input.getData2().substring(cant-1, cant);
		int num2 = Integer.parseInt(input.getData2().substring(0, cant-1));
		
		// Sumar numeros
		out.setResultNum(num1 + num2);
		
		// Comparar letras
		if(letter1.equals(letter2)) {
			out.setResultLetter("B");
		} else {
			out.setResultLetter("A");
		}
		
		out.setResult(out.getResultNum() + out.getResultLetter());
		
		return out;
	}
}
