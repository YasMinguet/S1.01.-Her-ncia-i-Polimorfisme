package lvl2_Ex3;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Cycle> list = Arrays.asList(new Unicycle(), new Bicycle(), new Tricycle());

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Bicycle) {
				Bicycle b=(Bicycle)list.get(i);
				b.balance();
			} else if (list.get(i) instanceof Unicycle) {
				Unicycle u=(Unicycle)list.get(i);
				u.balance();
			}
		}

	}

}
