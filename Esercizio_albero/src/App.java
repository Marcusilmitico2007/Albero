public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Tree <Integer> t1 = new Tree<>();

        t1.add(9);
        t1.add(13);
        t1.add(5);
        t1.add(7);
        t1.add(11);
        t1.add(15);
        t1.add(3);
        t1.add(6);
        t1.add(10);

        System.out.println(t1.toString());

    }
}




