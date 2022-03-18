package lvl2_Ex4;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Rossegador> list = Arrays.asList(new Ratoli(), new Jerbu(), new Hamster());
		for (int i=0;i<list.size();i++) {
			list.get(i).correr();
			list.get(i).ensumar();
			list.get(i).rossegar();
		}

	}

}
