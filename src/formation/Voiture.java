package formation;

public class Voiture implements Runnable{

	private String modele;
	private int vitesse;
	private int distance;
	
	public Voiture(String modele, int vitesse, int distance) {
		this.modele = modele;
		this.vitesse = vitesse;
		this.distance = distance;
	}

	@Override
	public void run() {
		float parcours = 0;
		int duree = 0;
		while(parcours<this.distance){
			try {
				Thread.sleep(1000);
				duree++;
				parcours += (float)vitesse/100;
				System.out.println(duree+"s : la "+this.modele+" a parcouru "+parcours+"km");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("La "+this.modele+" a terminé !");
	}
	
	
	
}
