package ResponsibilityChain;

public abstract class Approver {
    Approver afterApprover; //下一个处理者

    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        afterApprover = approver;
    }

    public abstract void processRequest(PurchaseRequest request);
}
