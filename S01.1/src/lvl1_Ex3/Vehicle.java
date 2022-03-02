package lvl1_Ex3;

public class Vehicle {
	
	static {
		System.out.println("Bloque de inicializador estático");
	}
	
	{
		System.out.println("Bloque inicializador estancia");
	}
	
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
