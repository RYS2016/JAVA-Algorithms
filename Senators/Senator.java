package cs520_hw5;

public class Senator {
	
	private static String name;
	private String party;
	private String state;
	private int yearsInOffice;
	
	public Senator (String name){
		Senator.name = name;
		}
	
	public void setName(String n){
		name = n;		
		}
	public void setParty(String p){
		party = p;
		}
	public void setState(String s){
		state = s;
		}
	public void setYearsInOffice(int y){
		yearsInOffice = y;
		}
	
	public static String getName(){
		return name;
		}
	public String getParty(){
		return party;
		}
	public String getState(){
		return state;
		}
	public int getyYerasInOffice(){
		return yearsInOffice;
		}
	
	public String toString(){
		return String.format("%s (%s) from %s has been the senator for "
				+ "%d years", name, party, state, yearsInOffice);
	}

}
