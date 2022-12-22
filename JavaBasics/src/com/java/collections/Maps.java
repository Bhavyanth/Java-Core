package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "BMW"); // Adding elements
		map.put(2, "Audi");
		map.put(3, "Pagani");
		map.put(4, "Lambo");

		// Classic way of iterating
		Set set = map.entrySet();// Converting to Set so that we can traverse
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			// Converting to Map.Entry to get key and value separately
			Map.Entry entry = (Map.Entry) itr.next();
			// System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// New way of iterating
		// Elements can traverse in any order
		for (Map.Entry m : map.entrySet()) {
			// System.out.println(m.getKey() + " " + m.getValue());
		}

		// Comparing By Key

		// returns a Set view of the mappings contained in this map
		map.entrySet()
				// returns a sequential Stream with this collection as its source
				.stream()
				// sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByKey()) // Can be compared in reverse order
				// performs an action for each element of this stream
				.forEach(System.out::println);
		
		// Comparing By Value

				// returns a Set view of the mappings contained in this map
				map.entrySet()
						// returns a sequential Stream with this collection as its source
						.stream()
						// sorted according to the provided Comparator
						.sorted(Map.Entry.comparingByValue()) // Can be compared in reverse order
						// performs an action for each element of this stream
						.forEach(System.out::println);
	}
}
