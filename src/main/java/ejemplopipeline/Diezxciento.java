package ejemplopipeline;

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
		System.out.println(diezxciento);
		return (int) diezxciento;
	}
	
	public int impuesto(){
		return 0;
	}
	
	public int saldoAhorro() {
		double noventaxciento = ahorro * 0.9;
		return (int) noventaxciento;
	}

}