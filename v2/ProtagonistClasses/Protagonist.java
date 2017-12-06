public class Protagonist extends Character {
    protected String name;
    protected int specialRand;

    public Protagonist(String s) {
        name = s;
        health = 250;
        strength = (int)(20 + 45 * Math.random());
        defense = 40;
        attack = 0.4;
        specialRand = Math.random()*6;
    }

    public String getName() {
        return name;
    }
    
    public int getSpecialRand() {
        return specialRand;
    }

    public void specialize() {
    defense = defense / 2;
    attack = attack * 2 ;
    }

    public void normalize() {
    this.defense = 75;
    this.attack = 0.4;
    }
    
    public String toString() {
        super.toString();
        return "Name:" + name;
    }
}
