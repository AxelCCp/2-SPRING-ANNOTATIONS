package ejercicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Comercial2")
public class Comercial2 implements Empleados {
	@Autowired
	@Qualifier("informeFinanciero")
	public void setEspecialInforme(CreaInformeFinanciero especialInforme) {
		this.especialInforme=especialInforme;
	}
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "TAREA COMERCIAL 2: VENDER CADA DÍA MÁS";
	}
	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "INFORME COMERCIAL 2: INFORME COMERCIAL" + "\n" + especialInforme.getInformeFinancieroEspecial();
	}
	
	
	public CreaInformeFinanciero especialInforme;
}
