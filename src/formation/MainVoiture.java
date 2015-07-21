package formation;

public class MainVoiture {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(">>>DEBUT DE LA COURSE<<<");
		int distance = 10;
		Thread v1 = new Thread(new Voiture("Mustang", 200, distance));
		Thread v2 = new Thread(new Voiture("BMW", 100, distance));
		Thread v3 = new Thread(new Voiture("Mini", 50, distance));
		
		v1.start();
		v2.start();
		v3.start();
		
		v1.join();
		v2.join();
		v3.join();
		
		System.out.println(">>>FIN DE LA COURSE<<<");
	}

}
