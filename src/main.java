import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) throws Exception {

		hashMap h = new hashMap();
		readerWriter rw = new readerWriter();

		//Read first file and second file
		BufferedReader reader1 = rw.readFile("input_1.txt");
		BufferedReader reader2 = rw.readFile("input_2.txt");

		//Put the data from the first file into the Hash Map
		HashMap<Integer, String> firstFileHMap = h.firstFileHMap(reader1);

		//Make the data in the second file a single string
		String concatStr = concatString(reader2);

		//Find the index of each string and put into hash map
		HashMap<Integer, String> lastFileHMap = h.lastFileHMap(firstFileHMap, concatStr);

		//Sort by last hash map
		Map<Integer, String> sorted = new TreeMap<Integer, String>(lastFileHMap);
		
		//Print sorted hash map to file
		rw.writeFile("output.txt", sorted);
		
		System.out.println("DONE!");

		reader1.close();
		reader2.close();
	}
	
	public static String concatString(BufferedReader reader) throws IOException {
		String line = "";
		String line2 = "";

		while ((line = reader.readLine()) != null) {

			line2 = line2 + line;

		}
		
		return line2;
	}

}
