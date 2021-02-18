package ejercicio;

import org.springframework.stereotype.Component;

import es.pildoras.pruebaannotations.CreacionInformeFinanciero;
@Component
public class InformeFinanciero implements CreaInformeFinanciero {

	@Override
	public String getInformeFinancieroEspecial() {
		// TODO Auto-generated method stub
		return "***ENTREGA DEL INFORME FINANCIERO ESPECIAL";
	}

}
