package cn.hhnail.behavioral.command;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Order {

	private Integer orderId;

	private Map<String ,Integer> food = new HashMap<String, Integer>();

	public Order(Integer orderId){
		this.orderId = orderId;
	}

	public void addOrder(String foodName,Integer num){
		food.put(foodName,num);
	}
}
