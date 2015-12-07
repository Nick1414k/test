package bear;

public class Bear {
	
	private int legs;
	private boolean tail;
	private String color;
	private boolean awake;
	
	public Bear(int legs, boolean tail, String color, boolean awake){
		this.legs = legs;
		this.tail = tail;
		this.color = color;
		this.awake = awake;
	}
	
	public static void main (String[] args){
		Bear benno = new Bear(17, false, "Purple", true);
		benno.setLegs(12);
		System.out.println("de beer heeft " + benno.getLegs() + " Poten");
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setLegs (int newLegs) {
		this.legs = newLegs;
	}

}
