package test_builder;

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.SWT;
import org.eclipse.jface.viewers.ListViewer;

public class window1 {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			window1 window = new window1();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(877, 583);
		shell.setText("SWT Application");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(764, 510, 97, 34);
		btnNewButton.setText("New Button");
		
		List list = new List(shell, SWT.BORDER | SWT.V_SCROLL);
		list.setItems(new String[] {"uno", "dos ", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"});
		list.setBounds(442, 287, 419, 217);

	}
}
