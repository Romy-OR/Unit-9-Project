class Greninja extends Pokemon{

    public Greninja(){
        super("Greninja", 72, 95, 67, "Water", new Move[] {
                      new Move("pound", 40, "Normal"), 
                      new Move("water gun", 40, "Water"),
                      new Move("night slash", 60, "Dark", 70),
                      new Move("water pulse", 60, "Water", 70)});
    }
}