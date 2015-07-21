package tests;

public class TestTask {
	public static void main(String[] args) {
		Task t1 = new Task(5);
		Task t2 = new Task(2);
		Task t3 = new Task(3);
		
		//t1.setDaemon(true);
		t1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("FIN MAIN");
	}
}
