package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTRIM4 implements CreacionInformeFinanciero {

	public String getInformeFinanciero() {
		return "PRESENTACIÓN DEL INFORME FINANCIERO DEL CIERRE DEL AÑO";
	}

}
