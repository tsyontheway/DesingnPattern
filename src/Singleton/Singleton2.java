package Singleton;

/***
 * 饿汉式(静态代码块)
 *
 * 1)这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
 * 2)结论：这种单例模式可用，但是可能造成内存浪费
 *
 */
public class Singleton2 {

    private Singleton2() {

    }

    private static Singleton2 instance;

    static { //静态代码块初始化
        instance = new Singleton2();
    }

    public static void main(String[] args) {

    }
}
