public class Main {
    public static void main(String[] args) {
        //thread -> işlemleri aynı anda yapmak için

        ThreadDemo demo = new ThreadDemo("First");
        Thread t1 = new Thread(demo);
        //demo.run();

        ThreadDemo demo1 = new ThreadDemo("Last");
        Thread t2 = new Thread(demo1);
        //demo1.run();

        t1.start();
        t2.start();

    }
}