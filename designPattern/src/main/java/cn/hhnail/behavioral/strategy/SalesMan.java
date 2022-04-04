package cn.hhnail.behavioral.strategy;

import lombok.Data;

/**
 * 销售员（环境类）
 */
@Data
public class SalesMan {

	// 销售策略
	private Strategy strategy;

	public SalesMan(Strategy strategy){
		this.strategy = strategy;
	}

	// 销售员展示促销策略
	public void show(){
		strategy.showStrategy();
	}
}
