package nomina;

public class Sueldo {
	
	 public static double sueldoBruto(Usuario nuevo) {
		 double sueldoBase = nuevo.calcularSueldo();
		 double HorasExtras = nuevo.calculaHorasExtras();
		 return sueldoBase + HorasExtras;
		 
	 }
	 private static double impuesto18 = 0.18;
	 private static double impuesto16 = 0.16;
	 private static double sueldoMin = 2000;
	 public static double Impuesto(double bruto) {
		 if (bruto >sueldoMin) {
			 return bruto * impuesto18;
		 }else {
			 return bruto * impuesto16;
		 }
	 }
	 public static double sueldoNeto(double bruto, double impuestos) {
		 return bruto - impuestos;
	 }
		
	}

