package FactoryMethod.order;

import FactoryMethod.Pizza.LDCheesePizza;
import FactoryMethod.Pizza.LDPepperPizza;
import FactoryMethod.Pizza.Pizza;

public class LDOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
