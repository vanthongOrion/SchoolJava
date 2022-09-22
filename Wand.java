public class Wand {
    private String name;
    private double power;

    public Wand(String name, double power){
        this.name = name;
        this.power = power;
    }

    public String getName(){
        return this.name;
    }

    public double getPower(){
        return this.power;
    }

    @Override
    public String toString(){
        return "Wand={NAME=" + this.name + " ,POWER=" + this.power + " }";
    }
}
