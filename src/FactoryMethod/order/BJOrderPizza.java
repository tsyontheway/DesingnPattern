package FactoryMethod.order;

import FactoryMethod.Pizza.BJCheesePizza;
import FactoryMethod.Pizza.BJPepperPizza;
import FactoryMethod.Pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
