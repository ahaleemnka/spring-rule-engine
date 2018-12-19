package com.sample.ruleengine.action;

import com.sample.ruleengine.component.AbstractComponent;

public abstract class AbstractAction extends AbstractComponent {
	
	private AbstractComponent nextStep;
	
	public void execute(Object arg) throws Exception {
		this.doExecute(arg);
		if (nextStep != null){
			nextStep.execute(arg);
		}	
	}

	protected abstract void doExecute(Object arg) throws Exception;

	public AbstractComponent getNextStep() {
		return nextStep;
	}

	public void setNextStep(AbstractComponent nextStep) {
		this.nextStep = nextStep;
	}

}
