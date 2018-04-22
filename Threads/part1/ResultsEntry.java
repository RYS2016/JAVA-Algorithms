

public class ResultsEntry{
	
	private int count;
	private char target;
	
	public ResultsEntry(int count, char target){
		this.count = count;
		this.target = target;
	}
	
	public int getCount(){
		return this.count;
	}
	
	public char getTarget(){
		return this.target;
	}
	
	public String toString(){
		return String.format("<%c, %d>", this.target, this.count);
	}
}
