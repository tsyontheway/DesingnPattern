package SimpleFactory.order;

import SimpleFactory.Pizza.CheesePizza;
import SimpleFactory.Pizza.GreekPizza;
import SimpleFactory.Pizza.PepperPizza;
import SimpleFactory.Pizza.Pizza;

//简单工厂类
public class SimpleFactory {

    //根据orderType返回Pizza对象
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        System.out.println("使用简单工厂方法模式");
        switch (orderType) {
            case "greek":
                pizza = new GreekPizza();
                pizza.setName(" 希腊披萨 ");
                break;
            case "cheese":
                pizza = new CheesePizza();
                pizza.setName(" 奶酪披萨 ");
                break;
            case "pepper":
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
                break;
            default:
                System.out.println("订购失败");
                break;
        }
        return pizza;


    }


//简单工厂模式 也叫 静态工厂模式

    public static Pizza createPizza2(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式2");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }


}
