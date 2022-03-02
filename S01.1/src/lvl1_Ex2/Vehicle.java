package lvl1_Ex2;

public class Vehicle {
		
	Vehicle(){
		System.out.println("Método Constructor");
	}
	
	public void start() {
		System.out.println("El vehículo arranca.");
	}
	public static void stop() {
		System.out.println("El vehículo se detiene.");
	}
	public void speedUp() {
		System.out.println("El vehículo acelera.");
	}
}
