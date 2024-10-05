package TCS_NQT.Array;

public class Deadlock {
    public static void main(String[] args) {
        final Shared s1 = new Shared();
        final Shared s2 = new Shared();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                s1.method1(s2);
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                s2.method2(s1);
            }
        };
        t1.start();
        t2.start();
    }

}

class Shared {
    synchronized void method1(Shared s) {
        System.out.println("Thread 2");
        s.method2(this);
    }
    synchronized void method2(Shared s) {
        System.out.println("Thread 1");
        s.method1(this);
    }
}