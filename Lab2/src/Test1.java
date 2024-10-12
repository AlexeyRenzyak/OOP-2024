import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        /*
        //Part a
        Cylinder s1 = new Cylinder(2, 5);
        Cube s2 = new Cube(4);
        Sphere s3 = new Sphere(5);
        System.out.println(s1.volume());
        System.out.println(s1.surfaceArea());
        System.out.println(s2.volume());
        System.out.println(s2.surfaceArea());
        System.out.println(s3.volume());
        System.out.println(s3.surfaceArea());
        */
        /*
        //Part b
        Game g1 = new Game("GTA V", "Rockstar", 2013,"Action", 50, 4.7, "M");
        System.out.println(g1);
         */
        //Part c
        Ship s1 = new Ship("CivilShip1", "Civilian", "USA", 20);
        Ship s2 = new Ship("CivilShip2", "Civilian", "Britain", 5);
        Warship s3 = new Warship("Akagi", "Japan", 1600, "Carrier");
        Warship s4 = new Warship("Shoukaku", "Japan", 1660, "Carrier");
        Warship s5 = new Warship("Hiei", "Japan", 1360, "Battleship");
        Warship s6 = new Warship("Shoukaku", "Japan", 1660, "Carrier");
        Ship s7 = new Ship("CivilShip2", "Civilian", "Britain", 5);

        HashSet<Ship> test = new HashSet();
        test.add(s1);
        test.add(s2);
        test.add(s3);
        test.add(s4);
        test.add(s5);
        test.add(s6);
        test.add(s7);
        System.out.println(test);
        }
    }

