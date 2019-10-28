package demos.java9.collection;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by booth02-mgr2 on 16.07.2017.
 */
public class CollectionDemo {

	public static void main(String[] args) {
		List<String> lst = List.of("Hello");
		Set.of("Test");
		Map.of("key", "value");
		Map.ofEntries(new AbstractMap.SimpleImmutableEntry<String, String>("key", "value"));
	}

}
