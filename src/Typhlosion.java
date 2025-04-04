class Typhlosion extends Pokemon{
  
    public Typhlosion(){
      super("Typhlosion", 78, 84, 78, "Fire", new Move[] {
                      new Move("tackle", 40, "Normal"), 
                      new Move("ember", 40, "Fire"),
                      new Move("flame wheel", 60, "Fire", 2, 85),
                      new Move("lava plume", 80, "Fire", 1, 50)});
    }
  
  }