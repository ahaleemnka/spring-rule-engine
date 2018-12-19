package com.sample.ruleengine;

import com.sample.ruleengine.component.AbstractComponent;

public class SpringRuleEngine {
	
	private AbstractComponent firstStep;
	
	public void setFirstStep(AbstractComponent firstStep){
		this.firstStep = firstStep ;
	}

	public void processRequest(Object arg) throws Exception{
		firstStep.execute(arg);
	}
}
