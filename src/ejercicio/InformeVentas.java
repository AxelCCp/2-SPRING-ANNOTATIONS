package ejercicio;

import org.springframework.stereotype.Component;

import es.pildoras.pruebaannotations.CreacionInformeFinanciero;
@Component
public class InformeVentas implements CreaInformeFinanciero {

	@Override
	public String getInformeFinancieroEspecial() {
		// TODO Auto-generated method stub
		return "ENTREGA DEL INFORME DE ***VENTAS***";
	}

	

}
