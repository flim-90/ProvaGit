package it.begear.esercizi.giorno4.esercizio7;
/*ESERCIZIO 7 - In un aerodromo si vogliono salvare informazioni sugli aeromobili.
Di ogni aeromobile si vuole sapere la sigla (string) che lo identifica.
Gli alianti sono aeromobili caratterizzati da un numero (int) che ne descrive l'efficienza aereodinamica.
Gli aerei a motore sono caratterizzati invece dalla potenza in CV del motopropulsore (double).
Gli alianti si confrontano in base all'efficienza, gli aerei a motore in base alla potenza in CV.
Scrivi un'interfaccia pubblica 'comparazione' contenente un metodo boolean 'superiore' per verificare se un aeromibile è superione
 a un altro come prestazioni.
Il metodo deve sempre restituire un messaggio di errore se gli aeromobili non sono coparabili o 
se uno dei parametri in ingresso è null.*/
public class Areodromo {

	public static void main(String[] args)  {
		
		
		

		AereoMotore aereomotore1 = new AereoMotore("123", 22.5);
		AereoMotore aereomotore2 = new AereoMotore("742", 27.1);
		Aliante aliante1 = new Aliante("256", 33);
		Aliante aliante2 = new Aliante("860", 77);
		
		aliante1.superiorita(aereomotore2);
		aliante2.superiorita(aliante1);
		aereomotore2.superiorita(aereomotore1);
		aereomotore1.superiorita(aliante1);
	}


}
