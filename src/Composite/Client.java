package Composite;


/**
            组合模式(结构型)
 *
 * * 组合模式（Composite Pattern），又叫部分整体模式，它创建了对象组的树形结构，将对象组合成树状结构以表示“整体-部分”的层次关系。
 * * 组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
 * * 这种类型的设计模式属于结构型模式。
 * * 组合模式使得用户对单个对象和组合对象的访问具有一致性，即：组合能让客户以一致的方式处理个别对象以及组合对象
 *
 */
public class Client {
    public static void main(String[] args) {

        //从大到小创建对象 学校
        OrganizationComponent university = new University("清华大学", " 中国顶级大学 ");

        //创建 学院
        OrganizationComponent computerCollege = new College("计算机学院", " 计算机学院 ");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院", " 信息工程学院 ");


        //创建各个学院下面的系(专业)
        computerCollege.add(new Department("软件工程", " 软件工程不错 "));
        computerCollege.add(new Department("网络工程", " 网络工程不错 "));
        computerCollege.add(new Department("计算机科学与技术", " 计算机科学与技术是老牌的专业 "));

        //
        infoEngineerCollege.add(new Department("通信工程", " 通信工程不好学 "));
        infoEngineerCollege.add(new Department("信息工程", " 信息工程好学 "));

        //将学院加入到 学校
        university.add(computerCollege);
        university.add(infoEngineerCollege);

        university.print();

       // infoEngineerCollege.print();
    }

}
