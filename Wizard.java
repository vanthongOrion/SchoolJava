public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public Wizard(String name, int hp, int mp, Wand wand){
        this.hp = hp;
        this.mp = mp;
        this.name = name;
        this.wand = wand;
    }

    void heal(Hero h){
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        h.setHp(h.getHp() - recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public int getMp(){
        return this.mp;
    }

    public void setMp(int mp){
        this.mp = mp;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Wand getWand(){
        return this.wand;
    }

    public void setWand(Wand wand){
        this.wand = wand;
    }

    @Override
    public String toString(){
        return "Wizard={NAME=" + this.name + " ,HP=" + this.hp + " ,MP=" + this.mp +" ,WAND={" + this.wand.toString()+"}";
    }
}
