package lvl1_Ex7;

public class App {

	public static void main(String[] args) {
		
		Amphibian frog= new Frog();
		frog.breath();
		frog.eat();
		frog.move();
		// frog.jump(); da error porque se ha hecho upcasting, no existe en Amphibian
		//para que funcionara sería de la siguiente forma:
		Frog frog2=(Frog)frog;
		frog2.jump();

	}

}
