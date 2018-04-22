
public class LongTask extends Thread{

	private SharedResults sharedData;
	private StringBuffer inputData;
	private char target;
		
	public LongTask(SharedResults r, StringBuffer buf, char target){
		
		super("Thread_" + target);
		
		sharedData = r;
		inputData = buf;
		this.target = target;
		//Thread.currentThread().setName("Thread_" + target);
	}
	
	public void run(){
			int count = 0;
		 	for (int i = 0; i < inputData.length(); i++){
				if (inputData.charAt(i) == target) 
					count++;	
		 	}
		ResultsEntry obj1 = new ResultsEntry(count, this.target); 
		sharedData.addToResults(obj1);					
	}	
}
