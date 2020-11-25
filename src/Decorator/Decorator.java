package Decorator;

public class Decorator extends Drink {

    private Drink drink;

    //组合 这里就是为了把drink（被修饰）引进来！！
    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // getPrice 自己价格
        return super.getPrice() + drink.cost();
    }


    @Override
    public String getDes() {
        // drink.getDes() 输出被装饰者的信息
        return des + " " + getPrice() + " && " + drink.getDes();
    }
}
