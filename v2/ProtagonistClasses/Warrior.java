public class Warrior extends Protagonist {
	protected int swordSlices;

	public Warrior( String name , int pswordSlices){
		super(name);
		swordSlices = pswordSlices;
    }

    public String toString() {
      return super.toString(); + "SPECIAL MOVE: Can slice" + swordSlices + " times in one go";
    }  
}
