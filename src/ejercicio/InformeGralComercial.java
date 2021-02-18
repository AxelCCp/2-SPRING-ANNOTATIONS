package ejercicio;

import org.springframework.stereotype.Component;

@Component
public class InformeGralComercial implements CreaInformeFinanciero {

	@Override
	public String getInformeFinancieroEspecial() {
		// TODO Auto-generated method stub
		return "ENTREGA DEL ***INFORME ANUAL DE VENTAS*** "
				+ "\nMÁS EL ***BALANCE ANUAL*** CON RESPECTO AL AÑO ANTERIOR";
	}

}
