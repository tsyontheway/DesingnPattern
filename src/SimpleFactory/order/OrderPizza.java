package SimpleFactory.order;

import SimpleFactory.Pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {


    /**
     * public OrderPizza() {
     * Pizza pizza ;
     * String orderType;
     * Label:
     * do {
     * orderType = getType();
     * switch (orderType) {
     * case "greek":
     * pizza = new GreekPizza();
     * pizza.setName(" 希腊披萨 ");
     * break;
     * case "cheese":
     * pizza = new CheesePizza();
     * pizza.setName(" 奶酪披萨 ");
     * break;
     * case "pepper":
     * pizza = new PepperPizza();
     * pizza.setName("胡椒披萨");
     * break;
     * default:
     * break  Label;
     * }
     * //输出pizza 制作过程
     * pizza.prepare();
     * pizza.bake();
     * pizza.cut();
     * pizza.box();
     * <p>
     * } while (true);
     * <p>
     * }
     */


    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;

        do {
            String orderType = getType();
            pizza = simpleFactory.createPizza(orderType);
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
        } while (true);
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
