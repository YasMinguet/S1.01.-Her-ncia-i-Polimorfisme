package lvl1_Ex5;

public class Animal {

	Animal(){
		
	}
	
	public void run(String mode) {
		System.out.println("El animal está corriendo "+mode);
	}
	
	public void run(int patas) {
		System.out.println("El animal está corriendo a "+patas+" patas");
	}
	
	public void run(String mode, int patas) {
		System.out.println("El animal está corriendo a "+patas+" patas "+mode);
	}
	
}
