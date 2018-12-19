package com.sample.ruleengine.rule;

import com.sample.ruleengine.component.AbstractComponent;

public abstract class AbstractRule extends AbstractComponent {

	private AbstractComponent positiveComponent;
	private AbstractComponent negativeComponent;
	
	public void execute(Object arg) throws Exception {
		
		boolean outcome = makeDecision(arg);
		if (outcome){
			positiveComponent.execute(arg);
		}
		else {
			negativeComponent.execute(arg);
		}
	}

	protected abstract boolean makeDecision(Object arg) throws Exception;

}
