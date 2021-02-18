package ejercicio;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoEmpleados {
	
	public static void main(String[]args) {
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class); 
		
		Empleados aj = contexto.getBean("Comercial",Empleados.class);
		System.out.println(aj.getInforme());
		System.out.println(aj.getTareas());
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		Empleados fran = contexto.getBean("Comercial2",Empleados.class);
		System.out.println(fran.getInforme());
		System.out.println(fran.getTareas());
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		Empleados chunli = contexto.getBean("Comercial3",Empleados.class);
		System.out.println(chunli.getTareas());
		System.out.println(chunli.getInforme());
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		DptoComercial dptoComercial = contexto.getBean("DptoComercial",DptoComercial.class);
		System.out.println(dptoComercial.getTareas());
		System.out.println(dptoComercial.getInforme());
		System.out.println(dptoComercial.getEmail());
		System.out.println(dptoComercial.getTelefono());
		System.out.println(dptoComercial.getDireccion());
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		Empleados director = contexto.getBean("directorDeFinanzas",DirectorDeFinanzas.class);
		System.out.println(director.getTareas());
		System.out.println(director.getInforme());
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		
		contexto.close();
	}
}
