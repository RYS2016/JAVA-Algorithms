

import java.util.ArrayList;

public class SharedResults {

	private ArrayList<ResultsEntry> results;
				
	public SharedResults(){
		this.results = new ArrayList<ResultsEntry>();
	}
	
	public synchronized void addToResults(ResultsEntry arg){
		
			System.out.printf("%s is adding %s, \n", Thread.currentThread().getName(), arg);
			results.add(arg);			
			System.out.printf(" Cumulative Result are %s\n ", results);
		}	
	public synchronized long getResult() {
		
			long sum = 0;
			for (ResultsEntry arg : results) {
				sum += arg.getCount();
			}
			return sum;			
	}			
}
