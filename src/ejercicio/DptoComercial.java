package ejercicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("DptoComercial")
public class DptoComercial implements Empleados{
	
	@Autowired
	public DptoComercial(@Qualifier("informeGralComercial")CreaInformeFinanciero informeDptoComercial) {
		this.informeDptoComercial=informeDptoComercial;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "TAREA DPTO.COMERCIAL: SE ENCARGA DE REALIZAR LAS VENTAS DE LA EMPRESA";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "INFORME DPTO.COMERCIAL: ENTREGA INFORMES SEMANALES, MENSUALES, SEMESTRALES Y ANUALES" + "\n" + informeDptoComercial.getInformeFinancieroEspecial();
	}
	//***
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//***
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono=telefono;
	}
	//***
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}


	public CreaInformeFinanciero informeDptoComercial;
	@Value("${email}")
	public String email;
	@Value("${telefono}")
	public String telefono;
	@Value("${direccion}")
	public String direccion;

}
