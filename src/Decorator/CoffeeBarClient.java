package Decorator;


/**
 *          装饰者模式(结构型)
 *
 * * 装饰者模式：动态的将新功能附加到对象上。在对象功能扩展方面，它比继承更有弹性，装饰者模式也体现了开闭原则(ocp)
 *
 */
public class CoffeeBarClient {
    public static void main(String[] args) {
        // 装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack

       // 1. 点一份 LongBlack
        Drink drink = new LongBlack();
        System.out.println("费用1=" + drink.cost());
        System.out.println("描述=" + drink.getDes());

        // 2. drink 加入一份牛奶
        drink = new Milk(drink);

        System.out.println("drink 加入一份牛奶 费用 =" + drink.cost());
        System.out.println("drink 加入一份牛奶 描述 = " + drink.getDes());

        // 3. drink 加入一份巧克力

        drink = new Chocolate(drink);

        System.out.println("drink 加入一份牛奶 加入一份巧克力  费用 =" + drink.cost());
        System.out.println("drink 加入一份牛奶 加入一份巧克力 描述 = " + drink.getDes());

        // 3. drink 加入一份巧克力

        drink = new Chocolate(drink);

        System.out.println("drink 加入一份牛奶 加入2份巧克力   费用 =" + drink.cost());
        System.out.println("drink 加入一份牛奶 加入2份巧克力 描述 = " + drink.getDes());

    }
}
