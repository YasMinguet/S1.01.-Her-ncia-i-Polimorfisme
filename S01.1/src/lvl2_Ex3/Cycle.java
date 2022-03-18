package lvl2_Ex3;

public  class Cycle {
	
	protected int wheels;
	
	Cycle(){
		wheels=2;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public static void ride(Cycle c) {
		System.out.println("Estás montando en "+c.wheels());
	}
	
	public String wheels() {
		return wheels+" ruedas.";
	}
}
