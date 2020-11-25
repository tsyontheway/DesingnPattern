package Adapter.ClassAdapter;

/**
 * 适配器模式
 *
 * * 适配器模式(Adapter Pattern)将某个类的接口转换成客户端期望的另一个接口表示，主的目的是兼容性，让原本因接口不匹配不能一起工作的两个类可以协同工作。其别名为包装器(Wrapper)
 * * 适配器模式属于结构型模式
 * * 主要分为三类：类适配器模式、对象适配器模式、接口适配器模式
 *
 * 工作原理
 *
 * * 适配器模式：将一个类的接口转换成另一种接口.让原本接口不兼容的类可以兼容
 * * 从用户的角度看不到被适配者，是解耦的
 * * 用户调用适配器转化出来的目标接口方法，适配器再调用被适配者的相关接口方法
 * * 用户收到反馈结果，感觉只是和目标接口交互
 *
 */


public class Client {
    public static void main(String[] args) {
        System.out.println(" === 类适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());

    }
}
