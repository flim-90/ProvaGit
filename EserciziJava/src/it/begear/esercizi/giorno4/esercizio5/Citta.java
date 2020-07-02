package it.begear.esercizi.giorno4.esercizio5;
/* Scrivi un programma che sia in grado di istanziare degli oggetti 'distributori di benzina' di cui sia nota la città,
 *  il proprietario, la capacità e la benzina attualmente contenuta nel distributore. 
 *  Dell'oggetto Distributore, deve essere possibile simulare le operazioni di erogazione 
 *  del carburante e dei corrispondenti incassi.*/



public class Citta {

	public static void main(String[] args) throws Exception {

		
		Distributore distributore1 = new Distributore(); 
		Distributore distributore2 = new Distributore();
		Distributore distributore3 = new Distributore();
		Distributore distributore4 = new Distributore();
		
		
		
		distributore1.setCitta("Milano");
		distributore1.setProprietario("Franco");
		distributore1.setCapacita(1222);
		distributore1.setContenuto(1150);
		
		
		distributore1.erogazione(distributore1, 77, 1);
		
		
	}

}
