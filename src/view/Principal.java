package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCruzamento;

public class Principal {
	public static void main(String []args) {
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		for(int idCarro=0;idCarro<4;idCarro++) {
			Thread tCarro = new ThreadCruzamento(idCarro,semaforo);
			tCarro.start();
		}
	}
}
