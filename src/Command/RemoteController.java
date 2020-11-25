package Command;

public class RemoteController {

    //开 按钮的命令数组
    Command[] onCommands;
    Command[] offCommands;

    //设置撤销的命令
    Command undoCommand;

    //构造器，完成对按钮初始化

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给按钮设置你需要的命令
    public void setCommand(int number, Command onCommand, Command offCommand) {
        onCommands[number] = onCommand;
        offCommands[number] = offCommand;
    }


    //按下开按钮
    public void onButtonWasPushed(int number) {
        //找到按下的开按钮，并调用对应方法
        onCommands[number].execute();
        //记录这次的操作，用于撤销
        undoCommand = onCommands[number];
    }


    //按下关按钮
    public void offButtonWasPushed(int number) {
        //找到按下的关的按钮，并调用对应方法
        offCommands[number].execute();
        //记录这次的操作，用于撤销
        undoCommand = offCommands[number];
    }

    //按下撤销按钮
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}