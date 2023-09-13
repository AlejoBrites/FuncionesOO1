package modelo;


import java.time.LocalDate;
import java.time.LocalTime;

public class Funciones {

		
	public static boolean esBisiesto (int anio) {
		
		return (anio % 4 == 0 && (anio % 100 != 0) || (anio % 400 == 0));
	}
	
	public static int traerDia(LocalDate fecha) {
		return fecha.getDayOfMonth();
	}

	public static int traerMes(LocalDate fecha) {
		return fecha.getMonthValue();
	}

	public static int traerAnio(LocalDate fecha) {
		return fecha.getYear();
	}

	public static int traerHora(LocalTime hora) {
		return hora.getHour();
	}

	public static int traerMinuto(LocalTime hora) {
		return hora.getMinute();
	}
	
	
	public static String traerFechaCorta (LocalDate fecha) {
		return String.format("%d/%d/%d",traerDia(fecha) ,traerMes(fecha),traerAnio(fecha));
	}
	
	public static String traerHoraaCorta (LocalTime hora) {
		return String.format("%d:%d",traerHora(hora),traerMinuto(hora));
	}
	
	public static boolean esDiaHabil(LocalDate fecha){
		int d= fecha.getDayOfWeek().getValue();
		/*Help:
		LocalDate fecha=LocalDate.of (2019,9,30);
		int nroDiaSem=fecha.getDayOfWeek().getValue(); //nroDiaSem=1,from 1 (Monday) to 7
		(Sunday)*/
		
		//return fecha.getDayOfWeek().getValue() > 0 && fecha.getDayOfWeek().getValue() < 7;
		return ((d>=1) &&( d<=5));
		}
	
	
	/******************************************************************
	public static String traerDiaDeLaSemana (LocalDate fecha) {
		
		return String.format("%s",fecha.getDayOfWeek());
	}
	*/
	public static String traerDiaDeLaSemanaEnLetras(LocalDate fecha) {
		String[] diasDeLaSemana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		return diasDeLaSemana[fecha.getDayOfWeek().getValue() - 1];//le pongo -1 porque el array empieza en 0.
	}
	
	//*****************************************************************
	
	/******************************************************************
	public static String traerMesEnLetras (LocalDate fecha) {
		return String.format("%s", fecha.getMonth());
	}
	*/
	public static String traerMesEnLetras (LocalDate fecha) {
		
		String mes="";
		switch (traerMes(fecha)) {
			case 1 -> mes = "Enero";
			case 2 -> mes = "Febrero";
			case 3 -> mes = "Marzo";
			case 4 -> mes = "Abril";
			case 5 -> mes = "Mayo";
			case 6 -> mes = "Junio";
			case 7 -> mes = "Julio";
			case 8 -> mes = "Agosto";
			case 9 -> mes = "Septiembre";
			case 10 -> mes = "Octubre";
			case 11 -> mes = "Noviembre";
			case 12 -> mes = "Diciembre";
		}
		
		return mes;
	}
	//*****************************************************************
	
	public static String traerFechaLarga (LocalDate fecha) {
		return String.format("%s %d de %s del %d", traerDiaDeLaSemanaEnLetras(fecha),traerDia(fecha),traerMesEnLetras(fecha),fecha.getYear());
	}
	
	public static int traerCantDiasDeUnMes (int anio, int mes) {
		if ((esBisiesto(anio)) && (mes == 2)) {
			return 29;
			}
		else if (mes == 2) {
			return 28;
			}
		else if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
			return 30;
		}
		else {
			return 31;
		}
		
		
	}
	
	
}
