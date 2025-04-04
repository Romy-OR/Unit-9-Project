class Gengar extends Pokemon{

    public Gengar(){
        super("Gengar", 60, 65, 60, "Ghost", new Move[] {
                      new Move("lick", 30, "Ghost", 3),
                      new Move("payback", 50, "Dark", 1, 70),
                      new Move("hex", 65, "Ghost", 1, 60),
                      new Move("sucker punch", 70, "Dark", 1, 60)});
    }
}