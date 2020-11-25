package Template;

/**
 *
 * * 模板方法模式（Template Method Pattern），又叫模板模式(Template	Pattern)， 在一个抽象类公开定义了执行它的方法的模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。
 * * 简单说，模板方法模式 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构，就可以重定义该算法的某些特定步骤
 * * 在模板方法模式的父类中，我们可以定义一个方法，它默认不做任何事，子类可以视情况要不要覆盖它，该方法称为“钩子”
 * * 这种类型的设计模式属于行为型模式。
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("----制作红豆豆浆----");
        SoYaMilk redBeanSoYaMilk = new RedBeanSoYaMilk();
        redBeanSoYaMilk.make();

        System.out.println("----制作花生豆浆----");
        SoYaMilk peanutSoYaMilk = new PeanutSoYaMilk();
        peanutSoYaMilk.make();
    }
}
