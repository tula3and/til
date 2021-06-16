import java.util.*;

public class PrintHashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("A", 10);
		hashMap.put("B", 20);
		hashMap.put("C", 30);
		hashMap.put("D", 40);
		hashMap.put("E", 50);
		// Method 1: keySet()
		System.out.println("Use keySet()");
		for (String key : hashMap.keySet()) {
			System.out.println("key: " + key + ", value: " + hashMap.get(key));
		}
		// Method 2: entrySet()
		System.out.println("Use entrySet()");
		for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}
		// Method 3: Iterator
		Iterator<String> it = hashMap.keySet().iterator();
		System.out.println("Use Iterator");
		while (it.hasNext()) {
			String key = it.next();
			System.out.println("key: " + key + ", value: " + hashMap.get(key));
		}
	}
}
