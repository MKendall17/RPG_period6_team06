public class Archer extends Protagonist {
    public Archer() {
        super(name);
    }
  
    public void normalize() {
        this.defense = 30;
        this.attack = 50;
    }
  
    public String toString() {
      super.toString();
    }  
}
