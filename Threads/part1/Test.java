import java.io.*;
import java.net.*;


public class Test {
	
	public static void main(String[] args) {
		
		String pageURL = "http://norvig.com/big.txt";
		URL urlObject = null;
		
		
		StringBuffer buffer = new StringBuffer();
		SharedResults results = new SharedResults();
		String inputLine;
		
		LongTask[] tasks = new LongTask[26];
		char c = 'a';
		
		try {
			urlObject = new URL(pageURL);
			InputStreamReader longTaskArray = new InputStreamReader(urlObject.openStream());
			
			//object to read from file
			BufferedReader reader = new BufferedReader(longTaskArray);
			
			inputLine = reader.readLine();
			while (inputLine  != null) {
					buffer.append(inputLine.toLowerCase() + "\n");
					inputLine = reader.readLine();
			}
			
				for (int i = 0; i < tasks.length; i++) {
					tasks [i] = new LongTask(results, buffer, c);
					c = (char)(c + 1);
					
					tasks[i].start();
				
					System.out.printf("Thread %s running\n", tasks[i].getName());
				}
			
			try {
				for (int i = 0; i < tasks.length; i++) {
					tasks[i].join();
				}
			}catch (InterruptedException ex) {
					ex.printStackTrace();
			}			
			System.out.println("\nAlphabet Count = " + results.getResult());
		}catch (MalformedURLException ex) {
					ex.printStackTrace();
			}catch (IOException e) {
					e.printStackTrace();
			}
		System.out.printf("Input Data Length:  %d\n", buffer.length());
	}
}
