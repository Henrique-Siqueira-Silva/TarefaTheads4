package view;

import javax.swing.JOptionPane;

import controller.ThreadCorridaSapos;

public class main {

	public static void main(String[] args) {
		
		int tamanho = 20;
		

		
		for ( int i=0; i < 5; i++) {
			
				ThreadCorridaSapos s = new ThreadCorridaSapos(tamanho, i);
				s.start();
		}
	}

}
