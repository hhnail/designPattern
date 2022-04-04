package cn.hhnail.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Waitor {

	// 服务员可能接收很多卓客人的点餐命令
	private List<Command> commands = new ArrayList<>();

	public void saveCommand(Command command){
		commands.add(command);
	}

	public void sendOrder(){
		System.out.println("饭店开门，订单来了！！");
		this.commands.forEach(command -> {
			if(command !=null){
				command.execute();
			}
		});
	}
}
