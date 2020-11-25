package Bridge;

public class OnePlus implements Brand {
    @Override
    public void open() {
        System.out.println(" OnePlus手机开机 ");
    }

    @Override
    public void close() {
        System.out.println(" OnePlus手机关机 ");
    }

    @Override
    public void call() {
        System.out.println(" OnePlus手机打电话 ");
    }
}
