package lvl2_Ex1;

public class App {

	public static void main(String[] args) {
		Cycle c=new Cycle();
		Unicycle u=new Unicycle();
		Bicycle b=new Bicycle();
		Tricycle t=new Tricycle();
		Cycle.ride(c);
		Cycle.ride(t);
		Cycle.ride(b);
		Cycle.ride(u);
		

	}

}
