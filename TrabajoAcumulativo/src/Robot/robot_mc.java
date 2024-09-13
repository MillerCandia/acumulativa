package Robot;

public class robot_mc {
	
	//composicion
	
	manos_mc manosRobotMc = new manos_mc("5 dedos", "5 uñas");
	piernas_mc piernasRobotMc = new piernas_mc("buenas", "1,10mt");
	torso_mc torsoRobotMc = new torso_mc("40cm", "20kg");
	cabeza_mc cabezaRobotMc = new cabeza_mc("circular", "7kg");
	String nombre_mc;
	
	public robot_mc(String nombre_mc) {
		this.nombre_mc = nombre_mc;
	}
	
	public void correr_mc() {

		System.out.println("estoy corriendo");

	}
	
	public void salar_mc() {

		System.out.println("estoy saltado");

	}
	
	

}
