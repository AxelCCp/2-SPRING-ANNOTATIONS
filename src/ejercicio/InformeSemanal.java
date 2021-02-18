package ejercicio;

import org.springframework.stereotype.Component;

@Component
public class InformeSemanal implements CreaInformeFinanciero {

	@Override
	public String getInformeFinancieroEspecial() {
		// TODO Auto-generated method stub
		return "ENTREGA ESPECIAL DE REPORTE SEMANAL... ***INCREMENTO DE VENTAS";
	}

}
