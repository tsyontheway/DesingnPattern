package Singleton;

/***
 * 懒汉式2
 *
 *1)解决了线程安全问题
 * 2)效率太低了，每个线程在想获得类的实例时候，执行 getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接 return 就行了。方法进行同步效率太低
 * 3)结论：在实际开发中，不推荐使用这种方式
 *
 */
public class Singleton4 {

    private static Singleton4 instance;

    public Singleton4() {
    }

    //加入了同步处理的代码
    private static synchronized Singleton4 getInstance() {
        if (null == instance) {
            instance = new Singleton4();
        }
        return instance;
    }
}
