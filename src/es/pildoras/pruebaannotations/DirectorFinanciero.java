package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "SE ENCARGA DE LA GESTIÓN  Y DIRECCIÓN DE LAS OPERACIONES DE LA EMPRESA";
	}
	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}

	//SE NECESITARÁN 2 BEANS, UN "BEAN:DirectorFinanciero"  y  "BEAN:InformeFinancieroDtoCompras" 
	
	
	public String getEmail() {
		return email;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	private CreacionInformeFinanciero informeFinanciero;
	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
}
