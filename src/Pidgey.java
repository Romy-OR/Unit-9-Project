public class Pidgey extends Pokemon{
    public Pidgey(){
        super("Pidgey", 40, 10, 15, "Flying", new Move[] {
                        new Move("tackle", 8, "Normal", 4), 
                        new Move("gust", 10, "Flying", 4),
                        new Move("sand attack", 0, "Ground", 4),
                        new Move("quick attack", 4, "Normal", 4)});
      }
    }