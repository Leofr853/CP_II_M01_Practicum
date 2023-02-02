public class JUnit {
    public static void main(String[] args) {

        Person Leonardo = new Person ("Leonardo", "Redigolo", "Mr","000001", 2001);

        System.out.println(Leonardo);
        System.out.println(Leonardo.getFullName());
        System.out.println(Leonardo.getFormalName());
        System.out.println(Leonardo.getAge());
        System.out.println(Leonardo.getAge(1975));
    }
}

