package nomina;

public class Usuario {

	private String nombre;
	private String puesto;
	private double horas;
	private double horasExtras;
	
	public Usuario(String nombre, String puesto,  double horas, double horasExtras) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.horas = horas;
		this.horasExtras = horasExtras;
	}
	public String getNombre() {
		return nombre;
	}
	public String getPuesto() {
		return puesto;
	
	}
	public double getHoras() {
		return horas;
	}
	public double getHorasExtras() {
		return horasExtras;
	
}
	private double 	cobroHoras = 71.87;
	private double cobroHorasExtras = 25.96;
	
	public double calcularSueldo() {
		return cobroHoras * horas;
	}
	public double calculaHorasExtras() {
		return cobroHorasExtras * horasExtras;
	}
}