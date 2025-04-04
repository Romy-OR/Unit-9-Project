public class Bulbasaur extends Pokemon{
  
    public Bulbasaur(){
      super("Bulbasaur", 50, 10, 15, "Grass", new Move[] {
                      new Move("tackle", 8, "Normal", 4), 
                      new Move("tail whip", 0, "Normal", 4),
                      new Move("vine whip", 10, "Grass", 4),
                      new Move("bite", 10, "Normal", 4)});
    }
  
  }