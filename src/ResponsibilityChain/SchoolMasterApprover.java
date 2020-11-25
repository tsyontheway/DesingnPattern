package ResponsibilityChain;

public class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getPrice() >= 30000){
            System.out.println("请求编号 id"+request.getId()+"被"+this.name+"处理");
        }
        //请求末端 无需调用后继
    }
}
