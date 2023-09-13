package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Funciones;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate fecha= LocalDate.of(2023, 2, 28);
		LocalTime hora=LocalTime.of(12, 55);
		
		System.out.println("Bisiesto? "+Funciones.esBisiesto(2023));
		
		System.out.println(Funciones.traerFechaCorta(fecha));
		
		System.out.println(Funciones.traerHoraaCorta(hora));
		
		System.out.println("Es dias habil? "+Funciones.esDiaHabil(fecha));
		
		System.out.println(Funciones.traerDiaDeLaSemanaEnLetras(fecha));
		
		System.out.println(Funciones.traerMesEnLetras(fecha));
		
		System.out.println(Funciones.traerFechaLarga(fecha));
		
		System.out.println(Funciones.traerCantDiasDeUnMes(5, 2002) +" dias");
	}

}
