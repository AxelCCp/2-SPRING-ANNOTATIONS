package es.pildoras.pruebaannotations;
import org.springframework.stereotype.Component;

//LA CLASE QUE IMPLEMENTA LA INTERFAZ, JUNTO A LA INTERFAZ, CONTRUYEN LA DEPENDENCIA

@Component
public class InformeFinancieroTRIM1 implements CreacionInformeFinanciero {
	
	public String getInformeFinanciero() {		
		return "PRESENTACIÓN DE INFORME FINANCIERO DEL TRIMESTRE 1";
	}

}
