package UB08.Aufgabe1;

public class Test {
    public static void main(String[] args) {

        // INITIALIZE
        StarsDatabase db = new StarsDatabase();

        Star sun = new Star("Sonne", "187");
        sun.apperentMagnitude(10D);
        sun.distance(10000D);
        sun.type("Subgiant");

        Star moon = new Star("Mond", "420");
        moon.apperentMagnitude(4D);
        moon.distance(100D);
        moon.type("Subgiant");

        Star polar = new Star("Polarstern", "69");
        polar.apperentMagnitude(7000D);

        // ADD
        System.out.println("ADD");
        db.add(sun);
        db.add(moon);
        db.add(sun);
        db.add(polar);
        for (Star star : db.db()) {
            System.out.println(star);
        }
        System.out.println();

        // REMOVE
        int remove = 2;
        System.out.println("REMOVE: " + remove);
        db.remove(remove);
        for (Star star : db.db()) {
            System.out.println(star);
        }
        System.out.println();

        // GET
        int get = 1;
        System.out.println("GET: " + get);
        System.out.println(db.get(get));
        System.out.println();

        // SIZE
        System.out.println("SIZE");
        System.out.println(db.size());
        System.out.println();

        // FIND
        String find = "1";
        System.out.println("FIND: " + find);
        System.out.println(db.find(find));

        // GET MAGNITUDE RANGE
        double low = 1D;
        double high = 1000D;
        System.out.println("MAG. RANGE: " + low + ", " + high);
        for (Star star : db.getMagnitudeRange(low, high)) {
            System.out.println(star);
        }
        System.out.println();

        // IS CLOSER THAN
        System.out.println("CLOSER");
        System.out.println(sun.isCloserThan(moon));
        System.out.println(moon.isCloserThan(sun));
        System.out.println();

        // GET DISTANCE IN PC
        System.out.println("DISTANCE");
        System.out.println(sun.getDistanceInPC());
        System.out.println();

        // GET ABSOLUTE MAGNITUDE
        System.out.println("ABS. MAGNITUDE");
        System.out.println(sun.getAbsoluteMagnitude());
        System.out.println(moon.getAbsoluteMagnitude());
        System.out.println();

        // CHECK TYPE
        System.out.println("CHECK");
        System.out.println(sun.checkType());
        System.out.println(moon.checkType());
        System.out.println();
    }

}
