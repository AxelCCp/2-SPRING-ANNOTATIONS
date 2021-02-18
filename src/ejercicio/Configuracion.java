package ejercicio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ejercicio")
@PropertySource("classpath:informacionComercial")
public class Configuracion {
	
	@Bean						//SE TIENE QUE LLAMAR = AL PARAMETRO QUE RECIBE EL CONSTRUCTOR DE DIRECTOR. 
	public CreaInformeFinanciero reportaGerencia() {
		return new ReporteParaGerencia();
	}
	@Bean
	public Empleados directorDeFinanzas() {
		return new DirectorDeFinanzas(reportaGerencia());
	}

}
