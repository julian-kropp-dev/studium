package ÜB08.Augabe1;

public class Test {
    public static void main(String[] args) {

        // INITIALIZE
        StarsDatabase db = new StarsDatabase();

        Star sun = new Star("Sonne", "187");

        Star moon = new Star("Mond", "420");

        Star polar = new Star("Polarstern", "69");

        // ADD
        db.add(sun);
        db.add(moon);
        db.add(sun);
        db.add(polar);
        System.out.println("ADD");
        for (Star star : db.db()) {
            System.out.println(star);
        }
        System.out.println();

        // REMOVE
        int remove = 2;
        System.out.println("REMOVE" + remove);
        db.remove(remove);
        for (Star star : db.db()) {
            System.out.println(star);
        }
        System.out.println();

        // GET
        int get = 1;
        System.out.println("GET" + get);
        System.out.println(db.get(get));
        System.out.println();

        // SIZE
        System.out.println("SIZE");
        System.out.println(db.size());
        System.out.println();

        // FIND
        String find = "1";
        System.out.println("REMOVE" + find);
        System.out.println(db.find(find));

    }

}
