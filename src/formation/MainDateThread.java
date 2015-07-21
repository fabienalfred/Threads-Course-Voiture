package formation;

public class MainDateThread {

	public static void main(String[] args) throws InterruptedException {
		int delai = 5;
		DateThread t1 = new DateThread(delai, "t1");
		t1.start();
		t1.join();
		System.out.println(">>>FIN MAIN<<<");
	}

}
