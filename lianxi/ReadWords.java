package lianxi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class ReadWords {

	public static void main(String[] args) {
		ReadWords reader = new ReadWords();
		BufferedReader words = reader.wordsFile();
		// key value (a set of strings)
		Map<Integer, TreeSet<String>> table = reader.readTable(words);
		reader.printTable(table);
	}

	private BufferedReader wordsFile() {
		BufferedReader words = null;
		try {
			words = new BufferedReader(new FileReader(
					"/Users/billyao/Desktop/words.md"));
		} catch (IOException e) {
			System.out.println("Couldn't open words file");
			System.out.println(e.getMessage());
			System.exit(1);
		}
		return words;
	}

	// Returns a table whose keys are integers and whose values are sets of
	// strings.
	// Takes a file of words.
	private Map<Integer, TreeSet<String>> readTable(BufferedReader words) {
		Map<Integer, TreeSet<String>> table = new HashMap<Integer, TreeSet<String>>();

		try {
			for (String word = words.readLine(); word != null; word = words
					.readLine()) {
				// System.out.println("read one more " + word);
				int key = word.length();
				if (table.get(key) == null)
					table.put(key, new TreeSet<String>());

				table.get(key).add(word);
			}
		} catch (IOException e) {
			System.out.println("Error during copy:" + e.getMessage());
			System.exit(1); // Because of this, the "finally" won't be reached.
							// Worse, the "finally"s of the parent methods won't
							// be reached either.
			// Never, ever, exit in catch statements. (Except in toy programs.)
		} finally {
			try {
				words.close();
			} catch (IOException e) {
				System.out.println("Error closing files:" + e.getMessage());
				System.exit(1);
			}
		}
		return table;
	}

	private void printTable(Map<Integer, TreeSet<String>> table) {
		// Word list successfully read and stored:
		// For each entry e of the table, print the key and the value:

		for (Map.Entry<Integer, TreeSet<String>> e : table.entrySet()) {
			System.out.print("Key \t" + e.getKey() + " -> ");
			for (String s : e.getValue())
				System.out.print("\t"+s+"\n");
		}
	}
}
