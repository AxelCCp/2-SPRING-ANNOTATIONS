package ejercicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Comercial3")
public class Comercial3 implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "TAREA COMERCIAL 3: VENDE MUCHO TODOS LOS DÍAS";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "INFORME COMERCIAL 3: REPORTE SEMANAL VENTAS" + "\n" + reporteSemanal.getInformeFinancieroEspecial();
	}

	@Autowired
	@Qualifier("informeSemanal")
	public CreaInformeFinanciero reporteSemanal;
	

}
