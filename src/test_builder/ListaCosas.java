package test_builder;

import java.util.ArrayList;

import org.eclipse.jface.viewers.IStructuredContentProvider;

public class ListaCosas implements IStructuredContentProvider {

	private ArrayList<String> milista = new ArrayList<String>();
	public ListaCosas() {
		super();
		milista.add("elemento_0");
		milista.add("elemento_1");
		milista.add("elemento_2");
		milista.add("elemento_3");
		milista.add("elemento_4");
		milista.add("elemento_5");
		milista.add("elemento_6");
		milista.add("elemento_7");
		milista.add("elemento_8");
		milista.add("elemento_9");
		milista.add("elemento_10");
		milista.add("elemento_11");
		milista.add("elemento_12");
		milista.add("elemento_13");
		milista.add("elemento_14");
		milista.add("elemento_15");
		milista.add("elemento_16");
		milista.add("elemento_17");
		milista.add("elemento_18");
		milista.add("elemento_19");
		milista.add("elemento_20");
		milista.add("elemento_21");
		milista.add("elemento_22");
		milista.add("elemento_23");
		milista.add("elemento_24");
		milista.add("elemento_25");
		milista.add("elemento_26");
		milista.add("elemento_27");
		milista.add("elemento_28");
		milista.add("elemento_29");
	}
	@Override
	public Object[] getElements(Object arg0) {
		// TODO Auto-generated method stub
		return milista.toArray();
	}

}
