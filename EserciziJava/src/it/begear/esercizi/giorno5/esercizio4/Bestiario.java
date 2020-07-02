package it.begear.esercizi.giorno5.esercizio4;

import java.util.Arrays;

/*ESERCIZIO 4 - Scrivere un programma che mette in un array una serie di esseri viventi. 
Uno degli attributi degli esseri viventi è il booleano 'esiste'.
Il programma lancia una eccezione gestita quando si cerca di mettere nell'array 
un essere che non esiste (drago, balrog, Chtuhlu ecc)*/

public class Bestiario  {

	public static void main(String[] args) throws Exception {
	
		EssereVivente[] bestiario = new EssereVivente[6];
		EssereVivente Chtuhlu = new EssereVivente(false);
		EssereVivente Ornitorinco = new EssereVivente(true);
		EssereVivente Giaguaro = new EssereVivente(true);
		EssereVivente Dagon = new EssereVivente(false);
		EssereVivente StarSpawn = new EssereVivente(false);
		EssereVivente Vipera = new EssereVivente(true);
		ingabbia(Vipera, bestiario);
		ingabbia(StarSpawn, bestiario);
	
	}	
	
	public static void ingabbia(EssereVivente essereVivente, EssereVivente[] bestiario) throws Exception {
			if (essereVivente.isEsistenza() == false)	{
				
				
				System.out.println("la bestia è fittizia");
				throw new Exception();
				
			}
			
			
			
		for (int i=0; i < bestiario.length; i++) {
					if (bestiario[i] == null && essereVivente.isEsistenza()) {
					bestiario[i] = essereVivente;
					System.out.println(Arrays.toString(bestiario));}
					
		}
					
	
	} 
	
		
		} 
		
	
	
	

	


