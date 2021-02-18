package es.pildoras.pruebaannotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado2")
public class ComercialExperimentado2 implements Empleados {
	@Autowired
	@Qualifier("informeFinancieroTRIM2")
	public void setInformeNuevo(CreacionInformeFinanciero informeNuevo) {
		this.informeNuevo=informeNuevo;
	}
	
	
	
	
	public String getTareas() {
		return "COMERCIAL 2: VENDER, VENDER Y VENDER MÁS";
	}
	public String getInforme() {
		return informeNuevo.getInformeFinanciero();
	}

	private CreacionInformeFinanciero informeNuevo;

}
