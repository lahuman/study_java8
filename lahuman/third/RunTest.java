package lahuman.third;

public class RunTest {
    public static void main(String[] args){

        Runnable r1 = () -> System.out.println("HELLO WORLD 1");
        Runnable r2 = new Runnable() {
            public void run() {
                System.out.println("HELLO WORLD 2");
            }
        };

        process(r1);
        process(r2);
        process(() -> System.out.println("HELLo WORD 3"));
    }

    public static void process(Runnable r){
        r.run();
    }
}
