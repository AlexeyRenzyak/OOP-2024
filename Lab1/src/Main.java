//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        //Analyzer.analyze();
        //2 Test
        /*Species sampleSpecies = new  Species("Dog", "Omnivore", Sex.MALE, 1.0);
        sampleSpecies.addAge(1);
        System.out.println(sampleSpecies.getAge());
        sampleSpecies.addAge(2.5);
        System.out.println(sampleSpecies.getAge());*/
        //3
        /*Temperature temp = new Temperature(15.0, 'C');
        System.out.println(temp.getTemperatureCelsius());
        System.out.println(temp.getTemperatureFahrenheit());*/
        //4
        //GradeBookTest.main();
        //5
        Person b1 = new Person("Boy1", Gender.BOY);
        Person b2 = new Person("Boy2", Gender.BOY);
        Person g1 = new Person("Girl1", Gender.GIRL);
        Person g2 = new Person("Girl2", Gender.GIRL);
        DragonLunch.kidnap(g1);
        DragonLunch.kidnap(b1);
        DragonLunch.kidnap(g2);
        DragonLunch.kidnap(b2);
        System.out.println(DragonLunch.willDragonEatOrNot());

    }
}