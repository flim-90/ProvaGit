package it.begear.esercizi.giorno5.esercizio3;
/*ESERCIZIO 3 - Scrivere un programma che crea istanze di persone 
con nome, cognome e mail
Gestire le anomalie di mancato inserimento dei dati o di mail mal scritte
(manca la @ oppure manca il dominio)*/

import it.begear.esercizi.giorno5.esercizio4.EssereVivente;

public class MainPage {

	
	
	
	public static void main(String[] args) {
		Persona persona1 = new Persona("franco","rossi","franco.rossi@gmail.com");
		Persona persona2 = new Persona("michele","bianchi","michelebianchitiscali.it");

		
			try {checker(persona1);} 
			
			catch (Exception e){
				
				
			} finally {
				
				
				
			}
			
			
			try {checker(persona2);
			} catch( Exception e) {
			
			} 
			}
	

		
	
	
	private static void checker(Persona persona) throws Exception  {
		if (persona.getEmail() != null && persona.getEmail().contains("@") && persona.getEmail().contains(".") ) {
			
			System.out.println((persona.getNome()+" "+persona.getCognome()+" "+persona.getEmail()));
			
		} else {
			
			
			System.out.println("email non valida");
			throw new Exception();
			
			
		
	}  }}
	
