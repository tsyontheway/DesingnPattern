package ProtoType.DeepClone;

/**
 * 深拷贝
 *
 * 1)复制对象的所有基本数据类型的成员变量值
 * 2)为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，直到该对象可达的所有对象。也就是说，对象进行深拷贝要对整个对象(包括对象的引用类型)进行拷贝
 * 3)深拷贝实现方式 1：重写 clone 方法来实现深拷贝
 * 4)深拷贝实现方式 2：通过对象序列化实现深拷贝(推荐)
 *
 * 	 原型模式的注意事项和细节
 *
 * 1)	创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，同时也能够提高效率
 * 2)	不用重新初始化对象，而是动态地获得对象运行时的状态
 * 3)	如果原始对象发生变化(增加或者减少属性)，其它克隆对象的也会发生相应的变化，无需修改代码
 * 4)	在实现深克隆的时候可能需要比较复杂的代码
 * 5)	缺点：需要为每一个类配备一个克隆方法，这对全新的类来说不是很难，但对已有的类进行改造时，需要修改其源代码，违背了 ocp 原则，这点请同学们注意.
 *
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        //方式1 完成深拷贝
//        DeepProtoType p2 = (DeepProtoType) p.clone();
//        System.out.println("p.name=" + p.name + "   p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//        System.out.println("p2.name=" + p.name + "  p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());


        //方式2 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.deepClone();
        System.out.println("p.name=" + p.name + "   p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p.name + "  p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
    }
}
