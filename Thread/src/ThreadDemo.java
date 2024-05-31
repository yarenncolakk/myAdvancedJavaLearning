public class ThreadDemo implements Runnable {
    String name;

    public ThreadDemo(String name) {
        this.name = name;
        System.out.println(name + " demo is started!");
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(this.name + " : " + i);
                Thread.sleep(1000); //1000milisaniye beklet
            }
        } catch (Exception e) {
            System.out.println(this.name + "error");
        }
        System.out.println(name + " demo is finished!");
    }
}
