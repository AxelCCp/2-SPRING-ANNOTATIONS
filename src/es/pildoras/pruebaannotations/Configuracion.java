package es.pildoras.pruebaannotations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//ESTA ES NUESTRA CLASE DE CONFIGURACI�N QUE SUSTITUYE AL ARCHIVO applicationContext.xml

@Configuration //LE DECIMOS A SPRING QUE ESTA CLASE ES EL ARCHIVO DE CONFIGURACI�N
@ComponentScan("es.pildoras.pruebaannotations") //LE DECIMOS QUE ESCANEE ESTE PAQUETE.
@PropertySource("classpath:datosEmpresa.propiedades")
public class Configuracion {
	
	//(1)DEFINIR EL BEAN PARA LA CLASE InformeFinancieroDtoCompras:
	//SE CREA UN M�TODO QUE DEVUELVE UN OBJ DE TIPO INTERFAZ "CreacionInformeFinanciero".
	//*NOMBRE M�TODO "informeFinancieroDtoCompras": ID DEL BEAN Q HABR� Q SOLICITAR.
	//*RETURN NEW: INSTANCIAMOS UN OBJ DE TIPO  "InformeFinancieroDtoCompras"
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {
		return new InformeFinancieroDtoCompras();
		
	}
	
	//(2)DEFINIR EL BEAN PARA "DirectorFinanciero" E INYECTAR DEPENDENCIAS:
	//*EMPLEADOS: ES DE TIPO EMPLEADOS, PQ QUEREMOS QUE NOS DEVUELVA UN OBJ DE TIPO.. 
	// DIRECTORFINANCIERO, Y ESTE ES DE TIPO EMPLEADOS, PQ IMPLEMENTA ESTA INTERFAZ.
	
	//LLAMAMOS AL CONSTRUCTOR "DirectorFinanciero"
	//LE PEDIMOS QUE NOS DEVUELVA UN OBJ DE TIPO "DirectorFinanciero"
	//y le pasamos por par�metro al constructor, el Bean "informeFinancieroDtoCompras()"
	//aqu� se inyecta la dependencia.
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
}
