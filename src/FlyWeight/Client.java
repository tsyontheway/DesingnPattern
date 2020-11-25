package FlyWeight;

/**
 *
            享元模式(结构型)

 * 享元模式（Flyweight Pattern） 也叫 蝇量模式: 运用共享技术有效地支持大量细粒度的对象
 * 常用于系统底层开发，解决系统的性能问题。像数据库连接池，里面都是创建好的连接对象，在这些连接对象中有我们需要的则直接拿来用，避免重新创建，如果没有我们需要的，则创建一个
 * 享元模式能够解决重复对象的内存浪费的问题，当系统中有大量相似对象，需要缓冲池时。不需总是创建新对象，可以从缓冲池里拿。这样可以降低系统内存，同时提高效率
 * 享元模式经典的应用场景就是池技术了，String 常量池、数据库连接池、缓冲池等等都是享元模式的应用，享元模式是池技术的重要实现方式

 1)	在享元模式这样理解，“享”就表示共享，“元”表示对象
 2)	系统中有大量对象，这些对象消耗大量内存，并且对象的状态大部分可以外部化时，我们就可以考虑选用享元模式
 3)	用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象，用 HashMap/HashTable 存储
 4)	享元模式大大减少了对象的创建，降低了程序内存的占用，提高效率
 5)	享元模式提高了系统的复杂度。需要分离出内部状态和外部状态，而外部状态具有固化特性，不应该随着内部状态的改变而改变，这是我们使用享元模式需要注意的地方.
 6)	使用享元模式时，注意划分内部状态和外部状态，并且需要有一个工厂类加以控制。
 7)	享元模式经典的应用场景是需要缓冲池的场景，比如 String 常量池、数据库连接池

 *
 */
public class Client {

    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite webSite = webSiteFactory.getWebSiteCategory("新闻");

        webSite.use(new User("Tom"));
    }

}