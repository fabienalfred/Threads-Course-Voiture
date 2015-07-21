package tests;

public class Task extends Thread {
	private int delai;

	public Task(int delai) {
		this.delai = delai;
	}

	@Override
	public void run() {
		System.out.format(">>> DEBUT TACHE %s de %d s.\n", getName(), delai);
		try {
			this.sleep(delai * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.format(">>> FIN TACHE %s de %d s.\n", getName(), delai);
	}
	

}

