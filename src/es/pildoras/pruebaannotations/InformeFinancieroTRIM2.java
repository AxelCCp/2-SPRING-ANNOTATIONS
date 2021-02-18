package es.pildoras.pruebaannotations;
import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTRIM2 implements CreacionInformeFinanciero {

	public String getInformeFinanciero() {	
		return "PRESENTACIÓN DE INFORME CATASTRÓFICO DEL TRIMESTRE 2";
	}

}
