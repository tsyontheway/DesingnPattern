package Adapter.InterfaceAdapter;

public class Client {

    public static void main(String[] args) {
        System.out.println(" === 接口适配器模式 ====");
        AbsAdapter absAdapter = new AbsAdapter() {
            //只需要去覆盖我们 需要使用 接口方法
            @Override
            public void m1() {
                super.m1();
            }
        };
        absAdapter.m1();
    }

}
