package ejemplopipeline;

import java.text.DecimalFormat;

public class Diezxciento {
	
	public int ahorro;
	public int sueldo;
	
	public Diezxciento(){
		ahorro = 20000000;
		sueldo = 700000;
	}
	
	public Diezxciento(int ahorro, int sueldo) {
		this.ahorro = ahorro;
		this.sueldo = sueldo;
	}
	
	public int diezxciento(){
		double diezxciento = ahorro * 0.1;
		System.out.println("Diez porciento: "+ diezxciento);
		return (int) diezxciento;
	}
	
	public Float impuesto(int sueldo){
		Integer sueldoAnual = sueldo*12;
		
		float inpuesto = 0.0f;
		if (sueldoAnual > 17864280 && (sueldoAnual < 29773800)){
			inpuesto =  0.08f;
		}else if(sueldoAnual > 29700000 && (sueldoAnual < 41600000)){
			inpuesto = 0.135f;
		}
		
		DecimalFormat formato = new DecimalFormat("#,###.##");
		String valorFormateado = formato.format(sueldoAnual);

		System.out.println("Sueldo Anual: "+ valorFormateado); 
		System.out.println("Inpuesto: "+ inpuesto); 
		return inpuesto;
	}
	
	public int saldoAhorro() {
		double noventaxciento = ahorro * 0.9;
		return (int) noventaxciento;
	}

}