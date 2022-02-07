package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Object> AL = new ArrayList<Object>();
		int num = 525;
		AL.add("Lokesh");
		AL.add("Jammi");
		AL.add(num);
		System.out.println(AL.get(2));
		AL.remove("Lokesh");
		System.out.println(AL);
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(5);
		set.add(1);
		System.out.println(set.isEmpty());
		System.out.println(set);
		Iterator<Integer> i = set.iterator();
		System.out.println(i.hasNext());
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
