package es.pildoras.pruebaannotations;
import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTRIM2 implements CreacionInformeFinanciero {

	public String getInformeFinanciero() {	
		return "PRESENTACI�N DE INFORME CATASTR�FICO DEL TRIMESTRE 2";
	}

}
