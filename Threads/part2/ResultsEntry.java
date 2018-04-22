public class ResultsEntry {
	//declare instance variables
	private int count;
	private char target;
	
	public ResultsEntry(char target, int count) {
		this.target = target;
		this.count = count;
	}

	public char getTarget() {
		return this.target;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public String toString() {
		String returnValue;
		
		returnValue = "<" + this.target + ", " + this.count + ">";
		return returnValue;
	}
}