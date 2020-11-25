package Singleton;

/***
 * 懒汉式(线程不安全)
 *
 *1)起到了 Lazy Loading 的效果，但是只能在单线程下使用。
 *2)如果在多线程下，一个线程进入了 if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式
 *3)结论：在实际开发中，不要使用这种方式.
 *
 */
public class Singleton3 {

    private static Singleton3 instance;

    public Singleton3() {
    }

    private static Singleton3 getInstance() {
        if (null == instance) {
            instance = new Singleton3();
        }
        return instance;
    }
}
