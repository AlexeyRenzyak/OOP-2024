public class Test5 {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, 10000);
        Person alice = new PhDStudent("Alice", 26, 4, 4);
        Animal murka = new Cat("Murka", 5);
        john.assignPet(murka);
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        john.leavePetWith(alice);
        System.out.println(registry);
        john.retrievePetFrom(alice);
        System.out.println(registry);
        Animal rex = new Dog("Rex", 3);
        alice.assignPet(rex);
        Person test = new Student("TestStudent", 19, 3.4);
        registry.addPerson(test);
        test.assignPet(rex);
        test.leavePetWith(alice);
        john.leavePetWith(alice);
        test.leavePetWith(john);
        System.out.println(registry);
        test.retrievePetFrom(alice);
        test.retrievePetFrom(john);
        john.retrievePetFrom(alice);
        System.out.println(registry);

    }
}
