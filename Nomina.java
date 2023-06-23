package nomina;
import java.io.PrintStream;
import java.util.Scanner;
public class Nomina {
	
	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre: ");
		String nombre = en.nextLine();
		
		System.out.println("Ingrese el puesto: ");
		String puesto = en.nextLine();
		
		System.out.println("Ingrese las horas trabajadas: ");
		double horas = en.nextInt();
		
		System.out.println("Ingrese las horas extras trabajadas: ");
		double horasExtras = en.nextInt();
		
		Usuario nuevo = new Usuario(nombre, puesto, horas, horasExtras);
		
		double bruto = Sueldo.sueldoBruto(nuevo);
		double impuestos = Sueldo.Impuesto(bruto);
		double sueldoNeto = Sueldo.sueldoNeto(bruto, impuestos);

		
		
		System.out.println("Puesto: " + nuevo.getPuesto());
		System.out.println("Horas trabajadas: " + nuevo.getHoras());
		System.out.println("horas extra trabajadas" + nuevo.getHorasExtras());
		System.out.println("El sueldo bruto es: " + bruto);
		System.out.println("impuestos: " + impuestos);
		System.out.println("sueldo neto: " + sueldoNeto);
	}
	
}
