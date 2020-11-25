package Singleton;

/***
 * 懒汉式3(线程不安全，同步代码块)
 *。
 *1)如果在多线程下，一个线程进入了 if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式
 *2)结论：在实际开发中，不要使用这种方式.
 *
 */
public class Singleton5 {

    private static Singleton5 instance;

    public Singleton5() {
    }

    private static Singleton5 getInstance() {
        if (null == instance) {
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
