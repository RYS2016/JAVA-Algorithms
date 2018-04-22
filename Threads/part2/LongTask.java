
public class LongTask extends Thread {

	private SharedResults sharedData;
	private int start,end, turn;
	
	public LongTask(SharedResults sharedData, int start, int end, int turn){
		super.setName(start + "_" + end);	
		this.sharedData = sharedData;
		this.start = start;
		this.end = end;
		this.turn = turn;
	}

	public void run(){
		int sum = 0;
		for (int counter = start; counter <= end; counter++){
			long time = (long) (Math.random() * .001); 
			try {
				Thread.sleep(time);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			sum = sum + counter;
		}
		sharedData.addToResults(turn, sum);
	}
	
}