package cs520_hw5;

import java.util.LinkedList;
import java.util.StringTokenizer;

import java.util.HashMap;
import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.util.Set;
import java.util.Iterator;
import java.io.FileReader;
import java.io.IOException;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class SenatorTest {

	public static void main(String[] args) throws IOException {
		
		LinkedList <String> senatorQueue;
		senatorQueue = new LinkedList<String>();
		
		HashMap<String, Object> senatorMap;
		senatorMap = new HashMap<String, Object>(); 
		
		String inputFileName = "data.txt";
		FileReader fileReader = new FileReader(inputFileName);	
		BufferedReader reader = new BufferedReader(fileReader);
		
		String input = reader.readLine();
		 
		while (input != null) {				
			    processInputData(input);
				senatorQueue.add(input);
				senatorMap.put(Senator.getName(), input);
				input = reader.readLine();
		}		
								
	Iterator<String> itr1 = senatorQueue.iterator();
		while (itr1.hasNext()) {
			String nextElement = itr1.next();
			System.out.println(nextElement);
		}
			System.out.println("\n");
		
		for (Map.Entry entry : senatorMap.entrySet()) {
			System.out.format("%s %-15s %s %s", "Key: ", 
					entry.getKey(), "Value: ", entry.getValue());
			System.out.println();
		}
	}	
	
	private static Senator processInputData(String data) {
		StringTokenizer st = new StringTokenizer (data, ",");
		String name = st.nextToken();
		Senator currentSenator = new Senator(name);
		String yearsinOffice = st.nextToken();				
		try {
			int years = Integer.parseInt(yearsinOffice);
			currentSenator.setYearsInOffice(years);
		}
		catch (NumberFormatException e)
		{
			System.out.println(-99);
		}
		String party = st.nextToken();
		currentSenator.setParty(party);
		String state = st.nextToken();
		currentSenator.setState(state);		
				
		return currentSenator;		
	}
}
