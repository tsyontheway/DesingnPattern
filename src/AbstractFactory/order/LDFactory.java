package AbstractFactory.order;

import AbstractFactory.Pizza.LDCheesePizza;
import AbstractFactory.Pizza.LDPepperPizza;
import AbstractFactory.Pizza.Pizza;

public class LDFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
