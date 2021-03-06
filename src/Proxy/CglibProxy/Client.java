package Proxy.CglibProxy;


/**
 * 	Cglib 代理模式的基本介绍
 *
 * 1)	静态代理和 JDK 代理模式都要求目标对象是实现一个接口,但是有时候目标对象只是一个单独的对象,并没有实现任何的接口,这个时候可使用目标对象子类来实现代理-这就是 Cglib 代理
 * 2)	Cglib 代理也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功能扩展, 有些书也将Cglib 代理归属到动态代理。
 * 3)	Cglib 是一个强大的高性能的代码生成包,它可以在运行期扩展 java 类与实现 java 接口.它广泛的被许多 AOP 的框架使用,例如 Spring AOP，实现方法拦截
 * 4)	在 AOP 编程中如何选择代理模式：
 * 1.	目标对象需要实现接口，用 JDK 代理
 * 2.	目标对象不需要实现接口，用 Cglib 代理
 * 5)	Cglib 包的底层是通过使用字节码处理框架 ASM 来转换字节码并生成新的类
 *
 *             代理模式
 *  1)	代理模式：为一个对象提供一个替身，以控制对这个对象的访问。即通过代理对象访问目标对象.这样做的好处是:可以在目标对象实现的基础上,增强额外的功能操作,即扩展目标对象的功能。
 *  2)	被代理的对象可以是远程对象、创建开销大的对象或需要安全控制的对象
 *  3)	代理模式有不同的形式, 主要有三种 静态代理、动态代理 (JDK 代理、接口代理)和  Cglib 代理  (可以在内存动态的创建对象，而不需要实现接口， 他是属于动态代理的范畴) 。
 *
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();
        //获取到代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法，触发intercept 方法，从而实现 对目标对象的调用
        String res = proxyInstance.teach();
        System.out.println("res=" + res);
    }
}
