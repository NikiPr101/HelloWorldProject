package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;

public class MyFirstGUIWindow {

	protected Shell shell;
	private Text vornameTF;
	private Label NachnameL;
	private Label StrasseL;
	private Label HausnummerL;
	private Label PLZ_L;
	private Text NachnameTf;
	private Text StrasseTF;
	private Text HausnummerTF;
	private Text PLZ_TF;
	private Label OrtL;
	private Text OrtTF;
	private Button btnAbbruch;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyFirstGUIWindow window = new MyFirstGUIWindow();
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
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		shell.setSize(845, 431);
		shell.setText("SWT Application");
		
		Button btnKnopf = new Button(shell, SWT.NONE);
		btnKnopf.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			System.out.println("Heast Lass mich arbeiten"+"\n"+"biep, crashjfbvdkj -d-sf􄋀4"+"\n"+"                "+"\n"+"-------------");
			System.out.println(vornameTF.getText()+"\n"+NachnameTf.getText()+"\n"+StrasseTF.getText()+"\n"+HausnummerTF.getText()+"\n"+PLZ_TF.getText()+"\n"+OrtTF.getText());
			}
		});
		btnKnopf.setBounds(59, 227, 164, 25);
		btnKnopf.setText("Knopf101");
		
		vornameTF = new Text(shell, SWT.BORDER);
		vornameTF.setBounds(95, 38, 128, 18);
		
		Label VornameL = new Label(shell, SWT.NONE);
		VornameL.setBounds(19, 41, 55, 15);
		VornameL.setText("Vorname");
		
		NachnameL = new Label(shell, SWT.NONE);
		NachnameL.setBounds(19, 69, 65, 15);
		NachnameL.setText("Nachname");
		
		StrasseL = new Label(shell, SWT.NONE);
		StrasseL.setBounds(19, 90, 55, 15);
		StrasseL.setText("Stra\u00DFe");
		
		HausnummerL = new Label(shell, SWT.NONE);
		HausnummerL.setBounds(19, 111, 80, 15);
		HausnummerL.setText("Hausnummer");
		
		PLZ_L = new Label(shell, SWT.NONE);
		PLZ_L.setBounds(19, 158, 55, 15);
		PLZ_L.setText("PLZ");
		
		NachnameTf = new Text(shell, SWT.BORDER);
		NachnameTf.setBounds(95, 69, 128, 15);
		
		StrasseTF = new Text(shell, SWT.BORDER);
		StrasseTF.setBounds(95, 87, 114, 21);
		
		HausnummerTF = new Text(shell, SWT.BORDER);
		HausnummerTF.setBounds(95, 111, 114, 21);
		
		PLZ_TF = new Text(shell, SWT.BORDER);
		PLZ_TF.setBounds(95, 155, 114, 18);
		
		OrtL = new Label(shell, SWT.NONE);
		OrtL.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		OrtL.setBounds(19, 179, 55, 15);
		OrtL.setText("Ort");
		
		OrtTF = new Text(shell, SWT.BORDER);
		OrtTF.setBounds(95, 176, 114, 18);
		
		btnAbbruch = new Button(shell, SWT.NONE);
		btnAbbruch.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		btnAbbruch.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		btnAbbruch.setFont(SWTResourceManager.getFont("Small Fonts", 30, SWT.NORMAL));
		btnAbbruch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		btnAbbruch.setBounds(351, 38, 342, 214);
		btnAbbruch.setText("ABBRUCH");
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent arg0) {
				System.out.println(arg0.x + " / " + arg0.y);
			}
		});
		composite.setBounds(351, 258, 342, 110);
		shell.setTabList(new Control[]{vornameTF, NachnameTf, StrasseTF, HausnummerTF, PLZ_TF, OrtTF, btnKnopf});

	}
}
