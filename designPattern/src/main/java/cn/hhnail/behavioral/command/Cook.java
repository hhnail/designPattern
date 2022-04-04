package cn.hhnail.behavioral.command;

/**
 * 厨师类 （实现者 / 接收者）
 */
public class Cook {

	public void makeFood(String foodName,Integer num){
		System.out.println(num+"份"+foodName+"做好啦!");
	}
}
