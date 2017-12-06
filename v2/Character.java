public class Character {
  protected int health;
  protected int strength;
  protected int defense;
  protected double attack;

  public boolean isAlive() {
    return health > 0;
  }

  protected int getDefense() {
    return defense;
  }

  protected void lowerHP(int a) {
    health -= a;
  }

  public int attack(Character c) {
    int damage = (int)(strength * attack - c.getDefense());
    c.lowerHP(damage);
    return damage;
  }
  
  public String toString() {
    return Stats();
  }
  
  //helper function for the toString method
  
  protected String Stats() {
    return "STATS || " + 
           "Health:" health + "||" +
           "Strength:" + strength + "||" + 
           "Defense:" + getDefense() + "||" + 
           "Attack:" + attack;
  }
}
