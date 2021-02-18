package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTRIM3 implements CreacionInformeFinanciero {

	public String getInformeFinanciero() {
		return "PRESENTACIÓN FAVORABLE DEL INFORME FINANCIERO DEL TRIMESTRE 3";
	}

}
