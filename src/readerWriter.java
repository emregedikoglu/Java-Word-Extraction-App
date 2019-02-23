import java.io.*;
import java.util.*;

public class readerWriter {

	public BufferedReader readFile(String readPath) throws FileNotFoundException {
		
		File file = new File(readPath);
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		
		return reader;
	}
	
	@SuppressWarnings("rawtypes")
	public void writeFile(String writePath, Map<Integer, String> map) throws IOException {
		
		PrintWriter writer = new PrintWriter(writePath);

		Set set = map.entrySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {

			Map.Entry me = (Map.Entry) iterator.next();
			writer.println(me.getValue() + " " + me.getKey());

		}
		
		writer.close();
	}
	
}
