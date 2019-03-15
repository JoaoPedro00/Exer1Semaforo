package controller;

import java.util.concurrent.Semaphore;

public class ThreadCruzamento extends Thread {
	private int DirCarro;
	private Semaphore semaforo;
	
	
	public ThreadCruzamento(int DirCarro, Semaphore semaforo) {
		this.DirCarro = DirCarro;
		this.semaforo = semaforo;
	}

	public void run() {
		try {
			semaforo.acquire();
			carroAnda();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
		  semaforo.release();
		}
	}
	
	private void carroAnda() {
		String vet[]= {"norte","sul","leste","oeste"};
		System.out.println("Carro "+vet[DirCarro]+" anda ");
	}
	
		
}
