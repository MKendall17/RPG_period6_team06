public class Warrior extends Protagonist {
	protected int swordSlices;

	public Warrior( int pswordSlices, String name){
		super(name);
		swordSlices = pswordSlices;
    }

    public String toString() {
      return super.toString() + "SPECIAL MOVE: Can slice" + swordSlices + " times in one go";
    }  
}
