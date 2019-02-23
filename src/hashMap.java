import java.io.*;
import java.util.*;

public class hashMap {

	public HashMap<Integer, String> firstFileHMap(BufferedReader reader) throws IOException {
		
		HashMap<Integer, String> firstFileHMap = new HashMap<Integer, String>();
		
		String line = "";
		
		int count = 0;

		while ((line = reader.readLine()) != null) {

			firstFileHMap.put(count, line);
			count++;

		}
		
		return firstFileHMap;
	}
	
	@SuppressWarnings("rawtypes")
	public HashMap<Integer, String> lastFileHMap(HashMap<Integer, String> hmap, String concatStr) {
		
		HashMap<Integer, String> lastFileHMap = new HashMap<Integer, String>();

		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		
		while (iterator.hasNext()) {
			
			Map.Entry me = (Map.Entry) iterator.next();
			
			String str = "";
			str = (String) me.getValue();
			
			int index;
			index = concatStr.indexOf(str);
			
			lastFileHMap.put(index, str);
			
		}
		
		return lastFileHMap;
	}
	
}
