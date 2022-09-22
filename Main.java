public class Main {
    public static void main(String[] args){
        Wand wand = new Wand("wand",100.5);
        Wizard w = new Wizard("wizard", 100,100,wand);
        Hero h = new Hero("minato",100);
        Matango m = new Matango('f',100);

//        System.out.println(w);
//        w.heal(h);
//        System.out.println(h);
//        System.out.println(m);

        w.setName("van");
        System.out.println(w);

    }
}
