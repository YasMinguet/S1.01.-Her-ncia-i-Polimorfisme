package lvl1_Ex4;

public class Vehicle {
	private static final String camp = "final static";
	private static String camp1; // no hay obligación de darle valor
	private final String camp2;
	private final String camp3="inicializado cuando se declara por lo que es comun para todos";
	
	static {
		System.out.println("Bloque de inicializador estático");
	}
	
	{
		System.out.println("Bloque inicializador estancia");
	}
	
	Vehicle(){
		System.out.println("Método Constructor");
		camp2 = "Valor Final una vez creado";
		camp1="static";
		
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
