package Robot;

public class trajeBatmanMc extends outfit_mc {
	
	String TipoDeCapa_mc;
	

	public trajeBatmanMc(String material_mc, String sexo_mc, String TipoDeCapa_mc) {
		super(material_mc, sexo_mc);
		this.TipoDeCapa_mc = TipoDeCapa_mc;
		
	}
	
	public void volar_mc() {

		System.out.println("estoy volando");

	}
	
	public void saltar_mc() {

		System.out.println("estoy saltado");

	}

}
