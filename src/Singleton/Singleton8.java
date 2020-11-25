package Singleton;

/***
 * 枚举实现单例模式
 *
 *1)这借助 JDK1.5 中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 *2)这种方式是 Effective Java 作者 Josh Bloch  提倡的方式
 *3)结论：推荐使用
 *
 */
public class Singleton8 {

    enum SingletonTest {
        INSTANCE;

        public void sayOK() {
            System.out.println("ok");
        }

    }
    public static void main(String[] args) {
        SingletonTest singleton8 = SingletonTest.INSTANCE;
    }
}

