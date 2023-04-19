
interface Executable {
    int execute(int a, int b);
}

interface StringExecutable {
    int execute(String a);
}

class Runner {
    public void run(Executable e){
        System.out.println("Executing code block...");
        int value = e.execute(12, 13);
        System.out.println("Return value: " + value);
    }

    public void run(StringExecutable e){
        System.out.println("Executing code block...");
        int value = e.execute("Hello");
        System.out.println("Return value: " + value);
    }
}


public class LambdaMain {

    public static void main(String[] args) {

        int c = 100;
        int d = 77;

        Runner runner = new Runner();
        runner.run(new Executable() {
            public int execute(int a, int b) {
                System.out.println("Hello there!");
                return a + b + c;
            }
        });

        System.out.println("============================");

        runner.run((int a, int b) -> {
            System.out.println("Hello there");
            return a +b +c;
        });

//        runner.run(() -> {
//            System.out.println("This code is passed in Lambda Expression");
//            System.out.println("Hello there!");
//            return 8;
//        });
    }
}
