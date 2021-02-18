package es.pildoras.pruebaannotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado3")
@Scope("prototype")
public class ComercialExperimentado3 implements Empleados {

	public String getTareas() {
		return "COMERCIAL 3: VENDER, VENDER Y VENDER MÁS ";
	}

	public String getInforme() {
		return nuevoInforme.getInformeFinanciero();
	}

	@Autowired
	@Qualifier("informeFinancieroTRIM3")
	private CreacionInformeFinanciero nuevoInforme;
}
