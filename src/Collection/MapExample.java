package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String, String> HM = new HashMap<String, String>();
		HM.put("firstName", "Lokesh");
		HM.put("lastName", "Jammi");
		HM.put("Email", "jammilokesh@gmail.com");
		HM.put("Contact", "7893608884");
		System.out.println(HM);
		System.out.println(HM.get("firstName"));
		Set sm = HM.entrySet();
		Iterator it = sm.iterator();
		while(it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
