package Proxy.DynamicProxy;


/**
 *            动态代理
 *
 * 1)	代理对象,不需要实现接口，但是目标对象要实现接口，否则不能用动态代理
 * 2)	代理对象的生成，是利用 JDK 的 API，动态的在内存中构建代理对象
 * 3)	动态代理也叫做：JDK 代理、接口代理
 *
 *             代理模式
 *  1)	代理模式：为一个对象提供一个替身，以控制对这个对象的访问。即通过代理对象访问目标对象.这样做的好处是:可以在目标对象实现的基础上,增强额外的功能操作,即扩展目标对象的功能。
 *  2)	被代理的对象可以是远程对象、创建开销大的对象或需要安全控制的对象
 *  3)	代理模式有不同的形式, 主要有三种 静态代理、动态代理 (JDK 代理、接口代理)和  Cglib 代理  (可以在内存动态的创建对象，而不需要实现接口， 他是属于动态代理的范畴) 。
 */
public class Client {
    public static void main(String[] args) {

        //创建目标对象
        ITeacherDao teacherDao = new TeacherDao();

        //给目标对象，创建代理对象, 可以转成 ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();

        proxyInstance.teach();


        // proxyInstance=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        // System.out.println("proxyInstance= "+proxyInstance);

    }
}
