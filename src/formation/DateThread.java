package formation;

import java.util.Date;

public class DateThread extends Thread {

	private int delai;
	
	public DateThread() {
	}
	
	public DateThread(int delai){
		this.delai = delai;
	}
	
	public DateThread(int delai, String nom) {
		this.delai = delai;
		this.setName(nom);
	}

	@Override
	public void run() {
		System.out.println(">>>DEBUT "+getName()+"<<<");
		for(int i=0 ; i<delai ; i++){
			try {
				Thread.sleep(1000);
				Date date = new Date();
				System.out.println(date.toString());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(">>>FIN "+getName()+"<<<");
	}

}
