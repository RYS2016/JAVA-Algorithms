public class Senator {
	
	private String name, party, state;
	private int yearsinOffice;
	
	public Senator (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	public String getParty () {
		return party;
	}
	public String getState () {
		return state;
	}
	public int getYearsinOffice () {
		return yearsinOffice;
	}
	
	public void setName (String n) {
		name = n;
	}
	public void setParty (String p) {
		party = p;
	}
	public void setState (String s) {
		state = s;
	}
	public void setYearsinOffice (int years) {
		yearsinOffice = years;
	}
	
	public String toString() {
		return String.format(name + " (" + party + ") from " + state + 
				" has been the senator for " + yearsinOffice + " years");
	}
}
