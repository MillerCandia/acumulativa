package Robot;

public class piernas_mc {
	
	String estado_mc;
	String longitud_mc;
	
	
	public piernas_mc(String estado_mc,  String longitud_mc) {
		
		this.estado_mc = estado_mc;
		this.longitud_mc = longitud_mc;
		
		
	}
	
	public void saltar_mc() {

		System.out.println("estoy saltado");

	}
	
	public void estirar_mc() {

		System.out.println("estoy estirando mis piernas");

	}

}
