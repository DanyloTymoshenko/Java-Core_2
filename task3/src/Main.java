public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Integra", 36);
        Person person2 = new Person("Seras", 23);

        System.out.println("Before swap");
        System.out.println("person1 " + person1);
        System.out.println("person2 " + person2);

        MakingChanges.changeIdentities(person1,person2);


        System.out.println("AFTER swap");
        System.out.println("person1 " + person1);
        System.out.println("person1 " + person2);


    }
}