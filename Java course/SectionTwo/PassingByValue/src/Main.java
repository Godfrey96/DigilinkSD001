public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        //*****************************************
        int value = 7;
        System.out.println("1. Value is: " + value);
        main.show(value);
        System.out.println("4. Value is: " + value);

        //******************************************

        Person person = new Person("Mogau");
        System.out.println("1. Person is: " + person);
        main.show(person);
        System.out.println("4. Person is: " + person);
    }
    
    public void show(int value){
        System.out.println("2. Value is: " + value);

        value = 8;

        System.out.println("3. Value is: " + value);
    }

    public void show(Person person) {
        System.out.println("2. Person is: " + person);

        person.setName("Sue");

        person = new Person("Godfrey");

        System.out.println("3. Person is: " + person);
    }
}