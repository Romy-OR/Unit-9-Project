

public class Move{
    String name;
    int power;
    String type;
    int chance;
    int crit;

    public Move(String n, int p, String t){
      this.name = n;
      this.power = p;
      this.type = t;
      this.crit = 1;
      this.chance = 100;
    }

    public Move(String n, int p, String t, int cr){
      this.name = n;
      this.power = p;
      this.type = t;
      this.crit = cr;
      this.chance = 100;
    }
    
    public Move(String n, int p, String t, int cr, int c){
      this.name = n;
      this.power = p;
      this.type = t;
      this.chance = c;
    }
  
    public int getPower(){
      System.out.println(this.name + "!");
      if ((Math.random() * 100) > this.chance){
        System.out.println("Name missed!");
        return 0;
      }
      else{
      return this.power;
      }
    }

    public double getCrit(){
      if ((Math.random() * 100) < (this.crit * 6.25)){
        System.out.println("Critical Hit!");
        return 1.5;
      }
      else{
        return 1.0;
      }
    }
    
    public String toString(){
      return this.name;
    }
  }