class Person {
    String name;
    int age;
    @Override
    public String toString(){
        return "Person{name ='" + name + "', age=" + age + "}";
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        if(p1 == null || p2 == null){ System.out.println("Err one or two objects are null");return;}

        String tempName = p1.name;
        int tempAge = p1.age;

        p1.name = p2.name;
        p1.age = p2.age;

        p2.name = tempName;
        p2.age = tempAge;
    }
}