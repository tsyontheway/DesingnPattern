package Bridge;

/**
 *     桥接模式
 *
 * 1)桥接模式(Bridge 模式)是指：将实现与抽象放在两个不同的类层次中，使两个层次可以独立改变。
 * 2)是一种结构型设计模式
 * 3)Bridge 模式基于类的最小设计原则，通过使用封装、聚合及继承等行为让不同的类承担不同的职责。它的主要特点是把抽象(Abstraction)与行为实现(Implementation)分离开来，从而可以保持各部分的独立性以及应对他们的功能扩展
 *
 */
public class Client {
    public static void main(String[] args) {

        Phone phone1 = new FoldedPhone(new XiaoMi());

        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("=======================");



        UpRightPhone phone3 = new UpRightPhone(new OnePlus());

        phone3.open();
        phone3.call();
        phone3.close();

        System.out.println("==============");
    }
}
