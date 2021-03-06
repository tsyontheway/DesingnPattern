package AbstractFactory.order;

import AbstractFactory.Pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    AbstractFactory factory;

    public OrderPizza(AbstractFactory factory) {
       setFactory(factory);
    }

    public void setFactory(AbstractFactory factory){
        Pizza pizza = null;
        this.factory = factory;

        do {
            String orderType = getType();
            pizza = factory.createPizza(orderType);
            if (null != pizza) {
                //输出pizza 制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }

        }while (true);

    }





    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
