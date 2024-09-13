package Robot;

public class trajeSupermanMc extends outfit_mc{
	
	String tipoDeAjuste_mc;

	public trajeSupermanMc(String material_mc, String sexo_mc, String tipoDeAjuste_mc) {
		super(material_mc, sexo_mc);
		this.tipoDeAjuste_mc = tipoDeAjuste_mc;
		
	}
	
	public void volar_mc() {

		System.out.println("estoy volando");

	}
	
	public void saltar_mc() {

		System.out.println("estoy saltado");

	}

}
