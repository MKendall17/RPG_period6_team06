public class Mage extends Protagonist {

	protected int potions;

	public Mage(int numberOfPotions, String name){
		super(name);
		potions = numberOfPotions;
    }

    public String toString() {
      return "SPECIAL MOVE: Can throw" + potions + " potions in one go";
    }  

    public void specialize() {
    defense = defense / 2;
    attack = attack * 2 ;
    }

    public void normalize() {
    this.defense = 75;
    this.attack = 0.4;
    }
}
