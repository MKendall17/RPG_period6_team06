public class Warrior extends Protagonist {
	protected int swordSlices;

	public Warrior( int pswordSlices, String name){
		super(name);
		swordSlices = pswordSlices;
    }

    public String toString() {
      return "SPECIAL MOVE: Can slice" + swordSlices + " times in one go";
    }  

    /** Warrior.java:1: error: Warrior is not abstract and does not override abstract method toString() in Protagonist
	  * public class Warrior extends Protagonist {
	  *        ^
	  * 1 error
	*/

	public void specialize() {
    defense = defense / 2;
    attack = attack * 2 ;
    }

    public void normalize() {
    this.defense = 75;
    this.attack = 0.4;
    }

}
