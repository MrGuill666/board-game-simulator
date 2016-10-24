package hu.bme.aut.gergelyszaz.BGS.action.impl;

import hu.bme.aut.gergelyszaz.BGS.action.AbstractAction;
import hu.bme.aut.gergelyszaz.BGS.game.SelectableManager;
import hu.bme.aut.gergelyszaz.BGS.game.VariableManager;
import hu.bme.aut.gergelyszaz.bGL.Action;

/**
 * Created by gergely.szaz on 2016. 10. 16..
 */
public class SelectAction extends AbstractAction {

    private final SelectableManager selectableManager;
	private String toVar;

	public SelectAction(VariableManager variableManager, Action action,
								SelectableManager selectableManager) {
        super(variableManager,action);
		 this.selectableManager = selectableManager;
		this.toVar=action.getToVar().getName();
    }

    @Override
    public void Execute() throws IllegalAccessException {
		selectableManager.setSelectableObjects(o -> {
			variableManager.store(null, VariableManager.THIS, o);
			return variableManager.evaluate(action.getCondition());
		});
		 selectableManager.setSelectableName(this.toVar);
			 //TODO game.wait
			 //TODO game.save
			 //TODO game.refreshViews

    }
}
