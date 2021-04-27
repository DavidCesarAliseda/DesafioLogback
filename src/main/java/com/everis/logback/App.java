package com.everis.logback;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * Formacion Dual - Desafio Logback
 * 
 * @author dcesarfe
 *
 */
public class App {
	/**
	 * LOGGER ROOT
	 */
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * LOGGER Info
	 */
	final static Logger LOGGER_INFO = LoggerFactory.getLogger("Info");

	/**
	 * Metodo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		LOGGER_INFO.info("Inicio del metodo");

		Scanner sc = new Scanner(System.in);

		LOGGER_INFO.info("Peticion del primer numero");
		System.out.print("Introduzca el primer numero:");
		int n1 = sc.nextInt();

		LOGGER_INFO.info("Peticion del segundo numero");
		System.out.print("Introduzca el segundo numero:");
		int n2 = sc.nextInt();

		getNumberUnderstood(n1, n2);

		LOGGER_INFO.info("Fin del metodo");
	}

	/**
	 * Metodo que obtiene los numeros contenidos entre dos numeros dados por el usuario
	 * 
	 * @param n1
	 * @param n2
	 * 
	 */

	public static void getNumberUnderstood(int n1, int n2) {

		LOGGER_INFO.info("Entra en el metodo obtenerNumeroComprendidos");

		// Condicion para comprobar si es posible obtener los numeros intermedios
		if (n1 > n2) {
			LOGGER_INFO.info("Imposible obtener los numero comprendidos entre {} y {}, ya que el primer numero debe ser menor que el segundo", n1, n2);
		} else {
			// Bucle para obtener los numeros intermedios
			for (int i = n1; i <= n2; i++) {
				LOGGER.debug("Numero: {}", i);
			}
		}

		LOGGER_INFO.info("Sale del metodo obtenerNumeroComprendidos");

	}
}
