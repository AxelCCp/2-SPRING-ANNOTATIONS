package ejercicio;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Comercial")
public class Comercial implements Empleados {
	
	@Autowired
	public Comercial(@Qualifier("informeVentas")CreaInformeFinanciero especialInforme) {
		this.especialInforme=especialInforme;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "TAREA COMERCIAL 1: VENDER MUCHO";
	}
	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "INFORME COMERCIAL 1: ESTE ES EL INFORME PRESENTADO POR EL COMERCIAL" + "\n" +
				especialInforme.getInformeFinancieroEspecial();
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("@PostConstruct: Después de la construcción del Bean");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("@PreDestroy: Antes de que se cierre el contenedor de Spring");
	}
	
	public CreaInformeFinanciero especialInforme;
}
