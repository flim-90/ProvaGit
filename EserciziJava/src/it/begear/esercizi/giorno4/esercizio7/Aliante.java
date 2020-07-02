package it.begear.esercizi.giorno4.esercizio7;

public class Aliante extends Aereomobile {

	private int efficenzaAereodinamica;

	public Aliante(String sigla, int efficenzaAereodinamica) {
		super(sigla);
		setEfficenzaAereodinamica(efficenzaAereodinamica);
	}

	public int getEfficenzaAereodinamica() {
		return efficenzaAereodinamica;
	}

	public void setEfficenzaAereodinamica(int efficenzaAereodinamica) {
		this.efficenzaAereodinamica = efficenzaAereodinamica;
	}
	
	@Override
	public void superiorita(Aereomobile aereomobile) {
		 try {
				if (this.efficenzaAereodinamica > ((Aliante) aereomobile).efficenzaAereodinamica) {
						
						System.out.println("Il tuo AereoMotore è piu' potente di: "+ (this.efficenzaAereodinamica - ((Aliante) aereomobile).efficenzaAereodinamica));
						
				} else {
						
						System.out.println("Il tuo AereoMotore è meno potente di: "+ ((((Aliante) aereomobile).efficenzaAereodinamica) - this.efficenzaAereodinamica));
						
					}
				
				} catch (ClassCastException e) {
					
					System.out.println("Comparazione non consentita");
					
				}
		}
		 





	
	}

	
	

