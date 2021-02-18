package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		//CARGAMOS EL XML
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//LEEMOS LA CLASE CONFIGURACION
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		
		
		//PEDIMOS EL BEAN
		Empleados antonio = contexto.getBean("ComercialExperimentado",Empleados.class);
		System.out.println(antonio.getTareas());
		System.out.println(antonio.getInforme());
		
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		Empleados Aj = contexto.getBean("ComercialExperimentado2",Empleados.class);
		System.out.println(Aj.getTareas());
		System.out.println(Aj.getInforme());
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		Empleados krilin  = contexto.getBean("ComercialExperimentado3",Empleados.class);
		System.out.println(krilin.getTareas());
		System.out.println(krilin.getInforme());
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("COMPROBANDO SINGLETON Y PROTOTYPE::::::::::::::::::::");
		
		Empleados vegeta  = contexto.getBean("ComercialExperimentado3",Empleados.class);
		System.out.println(krilin);
		System.out.println(vegeta);
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
											//SE USA COMO ID, 
											//EL NOMBRE DEL MÉTODO DE LA INYECCIÓN
		Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		DirectorFinanciero director = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println(director.getTareas());
		System.out.println(director.getInforme());
		System.out.println(director.getEmail());
		System.out.println(director.getNombreEmpresa());
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		contexto.close();
	}

}
