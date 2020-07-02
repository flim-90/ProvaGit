package it.begear.esercizi.giorno4.esercizio7;

public class AereoMotore extends Aereomobile  {
	
	private double potenzaCv;

	public AereoMotore(String sigla, double potenzaCv)  {
		super(sigla);
		
		setPotenzaCv(potenzaCv);
	}

	public double getPotenzaCv() {
		return potenzaCv;
	}

	public void setPotenzaCv(double potenzaCv) {
		potenzaCv = potenzaCv;
	}
	
	
	@Override
	public void superiorita(Aereomobile aereomobile)  {
	 try {
	if (this.potenzaCv > ((AereoMotore) aereomobile).potenzaCv) {
			
			System.out.println("Il tuo AereoMotore è piu' potente di: "+ (this.potenzaCv - ((AereoMotore) aereomobile).potenzaCv));
			
	} else {
			
			System.out.println("Il tuo AereoMotore è meno potente di: "+ ((((AereoMotore) aereomobile).potenzaCv) - this.potenzaCv));
			
		}
	
	} catch (ClassCastException e) {
		
		System.out.println("Comparazione non consentita");
		
	}
	
}
}		
		
	

	

	
	
	

