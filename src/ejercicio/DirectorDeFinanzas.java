package ejercicio;

import org.springframework.stereotype.Component;

@Component("DirectorDeFinanzas")
public class DirectorDeFinanzas implements Empleados {

	
	public DirectorDeFinanzas(CreaInformeFinanciero reportaGerencia) {
		this.reportaGerencia=reportaGerencia;
	}
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "TAREA DIRECTOR: DIRIGE LAS OPERACIONES FINANCIERAS DE LA EMPRESA";
	}
	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "DIRECTOR: PIDE AL DPTO. DE COMERCIAL, LOS INFORMES FINANCIEROS y REPORTA A GERENCIA"
				+ "\n" + reportaGerencia.getInformeFinancieroEspecial();
	}

	private CreaInformeFinanciero reportaGerencia;
	
}
