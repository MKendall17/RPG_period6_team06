public class Archer extends Protagonist {
  private int flamingArrows;
    
    public Archer(int numberOfFlamingArrows, String name) {
        super(name);
        flamingArrows = numberOfFlamingArrows;
    }
  
    public String toString() {
      super.toString();
      return "SPECIAL MOVE: Can toss" + flamingArrows + " flaming arrows in one go";
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
