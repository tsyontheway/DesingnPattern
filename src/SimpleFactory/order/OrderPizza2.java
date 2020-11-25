package SimpleFactory.order;

import SimpleFactory.Pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//使用静态方法
public class OrderPizza2 {

    Pizza pizza = null;
    public OrderPizza2() {
        do {
            String orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
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
