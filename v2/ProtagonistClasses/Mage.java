public class Mage extends Protagonist {

	protected int potions;

	public Mage(int numberOfPotions, String name){
		super(name);
		potions = numberOfPotions;
    }

    public String toString() {
      return super.toString() + "SPECIAL MOVE: Can throw" + potions + " potions in one go";
    }  
}
