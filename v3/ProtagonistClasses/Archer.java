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
}
