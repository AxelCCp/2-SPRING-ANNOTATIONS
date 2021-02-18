package es.pildoras.pruebaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados {

	
	//CONSTRUCTOR QUE SOLICITA LA DEPENDENCIA, PARA QUE EL COMERCIAL "NO" ENTREGUE UN INFORME GEN�RICO,
	//SINO UN INFORME DE TRIM 1
	@Autowired
	public ComercialExperimentado(@Qualifier("informeFinancieroTRIM1")CreacionInformeFinanciero informeNuevo) {
		this.informeNuevo=informeNuevo;
	}
	
	
	public String getTareas() {
		return "COMERCIAL 1: VENDER, VENDER Y VENDER M�S";
	}
	public String getInforme() {
		return  informeNuevo.getInformeFinanciero();
	}
	
	
	//METODO INIT...
	@PostConstruct
	public void despuesDeConstruccionDeBean() {
		System.out.println("@PostConstruct...EJECUTA C�DIGO **DESPU�S** DE LA CREACI�N DEL BEAN ComercialExperimentado\n\n\n");
	}
	//METODO DESTROY
	@PreDestroy
	public void antesDeApagarSpring() {
		System.out.println("\n\n\n@PreDestroy...EJECUTA C�DIGO **ANTES** DE APAGAR EL CONTENEDOR DE SPRING, DESDE ComercialExperimentado");
	}
	
	
	private CreacionInformeFinanciero informeNuevo;
}
