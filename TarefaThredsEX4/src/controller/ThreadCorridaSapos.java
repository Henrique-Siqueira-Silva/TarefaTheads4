package controller;

public class ThreadCorridaSapos extends Thread  {
		
	int TamanhoCorrida;
	int i;
	
	
	public ThreadCorridaSapos(int tamanho, int i ) {
		this.TamanhoCorrida = tamanho;
		this.i = i;
	}

	@Override
	public void run() {
		Corrida(TamanhoCorrida, i);
		
	}
	

	
	private void Corrida (int tamanho, int i) {
		
		while (tamanho > 0) {
			int num = (int) (Math.random() * 4 + 1);
			tamanho = tamanho - num;
			System.out.println("Sapo "+i+ " esta a "+tamanho+ " da chegada");
		}
		System.out.println("Sapo "+i + " chegou " );
			
		}


}
