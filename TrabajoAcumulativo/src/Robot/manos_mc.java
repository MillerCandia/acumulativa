package Robot;

public class manos_mc {
	String numero_dedos_mc;
	String numero_uñas_mc;
	
	public manos_mc(String numero_dedos_mc,  String numero_uñas_mc) {
		
		this.numero_dedos_mc = numero_dedos_mc;
		this.numero_uñas_mc = numero_uñas_mc;
		
	}
	
	public void apretar_mc() {

		System.out.println("estoy apretando");

	}
	
	public void soltar_mc() {

		System.out.println("estoy soltado");

	}

}
