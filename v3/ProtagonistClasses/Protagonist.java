public abstract class Protagonist extends Character {

	/** error message:
	  * Protagonist.java:1: error: Protagonist is not abstract and does not override abstract method toString() in Protagonist
	  * public class Protagonist extends Character {
	  *        ^
	*/


    protected String name;
    protected int specialRand;

    public Protagonist(String s) {
        name = s;
        health = 250;
        strength = (int)(20 + 45 * Math.random());
        defense = 40;
        attack = 0.4;
        specialRand = (int) Math.random()*6;
    }

    public String getName() {
        return name;
    }
    
    public int getSpecialRand() {
        return specialRand;
    }

    public abstract void specialize();

    public abstract void normalize();
    
    public abstract String toString();
}
