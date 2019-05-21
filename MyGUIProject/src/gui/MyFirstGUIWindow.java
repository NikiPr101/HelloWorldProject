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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import data.Person;

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
	private Label NachnameOut;
	private Label StrasseOut;
	private Label HausnummerOut;
	private Label PLZOut;
	private Label OrtOut;
	private Label VornameOut;

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
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_CYAN));
		shell.setSize(845, 431);
		shell.setText("SWT Application");
		
		Button btnKnopf = new Button(shell, SWT.NONE);
		btnKnopf.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnKnopf.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		btnKnopf.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			System.out.println("Lass mich arbeiten"+"\n"+"biep, crashjfbvdkj -d-sf􄋀4"+"\n"+"                "+"\n"+"-------------");
			System.out.println(vornameTF.getText()+"\n"+NachnameTf.getText()+"\n"+StrasseTF.getText()+"\n"+HausnummerTF.getText()+"\n"+PLZ_TF.getText()+"\n"+OrtTF.getText());
			
			getVornameOut().setText(getVornameTF().getText());
			getNachnameOut().setText(getNachnameTf().getText());
			getStrasseOut().setText(getStrasseTF().getText());
			getHausnummerOut().setText(getHausnummerTF().getText());
			getPLZOut().setText(getPLZ_TF().getText());
			getOrtOut().setText(getOrtTF().getText());
			
			Person p1; //
			p1 = new Person();
			//
			p1.setVorname(getVornameTF().getText());
			p1.setNachname(getNachnameTf().getText());
			p1.setStrasse(getStrasseTF().getText());
			p1.setHausnummer(getHausnummerTF().getText());
			p1.setPlz(getPLZ_TF().getText());
			p1.setOrt(getOrtTF().getText());
			//
			System.out.println(p1);
			//
			Person.getListe().add(p1);
			//
		System.out.println(Person.getListe());
			//
			getVornameTF().setText("");
			getNachnameTf().setText("");
			getStrasseTF().setText("");
			getHausnummerTF().setText("");
			getPLZ_TF().setText("");
			getOrtTF().setText("");
			}
		});
		btnKnopf.setBounds(19, 258, 287, 110);
		btnKnopf.setText("Knopf101");
		
		vornameTF = new Text(shell, SWT.BORDER);
		vornameTF.setBounds(111, 35, 128, 18);
		
		Label VornameL = new Label(shell, SWT.NONE);
		VornameL.setBackground(SWTResourceManager.getColor(SWT.COLOR_CYAN));
		VornameL.setBounds(19, 38, 55, 15);
		VornameL.setText("Vorname");
		
		NachnameL = new Label(shell, SWT.NONE);
		NachnameL.setBackground(SWTResourceManager.getColor(SWT.COLOR_CYAN));
		NachnameL.setBounds(19, 69, 65, 15);
		NachnameL.setText("Nachname");
		
		StrasseL = new Label(shell, SWT.NONE);
		StrasseL.setBackground(SWTResourceManager.getColor(SWT.COLOR_CYAN));
		StrasseL.setBounds(19, 90, 55, 15);
		StrasseL.setText("Stra\u00DFe");
		
		HausnummerL = new Label(shell, SWT.NONE);
		HausnummerL.setBackground(SWTResourceManager.getColor(SWT.COLOR_CYAN));
		HausnummerL.setBounds(19, 129, 80, 15);
		HausnummerL.setText("Hausnummer");
		
		PLZ_L = new Label(shell, SWT.NONE);
		PLZ_L.setBackground(SWTResourceManager.getColor(SWT.COLOR_CYAN));
		PLZ_L.setBounds(19, 158, 55, 15);
		PLZ_L.setText("PLZ");
		
		NachnameTf = new Text(shell, SWT.BORDER);
		NachnameTf.setBounds(111, 59, 128, 19);
		
		StrasseTF = new Text(shell, SWT.BORDER);
		StrasseTF.setBounds(111, 87, 128, 18);
		
		HausnummerTF = new Text(shell, SWT.BORDER);
		HausnummerTF.setBounds(111, 126, 128, 18);
		
		PLZ_TF = new Text(shell, SWT.BORDER);
		PLZ_TF.setBounds(111, 155, 128, 18);
		
		OrtL = new Label(shell, SWT.NONE);
		OrtL.setBackground(SWTResourceManager.getColor(SWT.COLOR_CYAN));
		OrtL.setBounds(19, 179, 55, 15);
		OrtL.setText("Ort");
		
		OrtTF = new Text(shell, SWT.BORDER);
		OrtTF.setBounds(111, 176, 128, 18);
		
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
		btnAbbruch.setBounds(452, 38, 342, 110);
		btnAbbruch.setText("ABBRUCH");
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent arg0) {
				System.out.println(arg0.x + " / " + arg0.y);
			}
		});
		composite.setBounds(351, 258, 342, 110);
		
		NachnameOut = new Label(shell, SWT.NONE);
		NachnameOut.setBounds(251, 59, 55, 15);
		
		StrasseOut = new Label(shell, SWT.NONE);
		StrasseOut.setBounds(251, 90, 55, 15);
		
		HausnummerOut = new Label(shell, SWT.NONE);
		HausnummerOut.setBounds(256, 129, 55, 15);
		
		PLZOut = new Label(shell, SWT.NONE);
		PLZOut.setBounds(256, 158, 55, 15);
		
		OrtOut = new Label(shell, SWT.NONE);
		OrtOut.setBounds(256, 179, 55, 15);
		
		VornameOut = new Label(shell, SWT.NONE);
		VornameOut.setBounds(251, 35, 55, 15);
		
		Button btnJson = new Button(shell, SWT.NONE);
		btnJson.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				//
				System.out.println(gson.toJson(Person.getListe()));
			}
		});
		btnJson.setBounds(125, 227, 75, 25);
		btnJson.setText("JSon");
		shell.setTabList(new Control[]{vornameTF, NachnameTf, StrasseTF, HausnummerTF, PLZ_TF, OrtTF, btnKnopf});

	}

	public Label getLabel() {
		return VornameOut;
	}
	public Text getVornameTF() {
		return vornameTF;
	}
	public Text getNachnameTf() {
		return NachnameTf;
	}
	public Text getStrasseTF() {
		return StrasseTF;
	}
	public Text getHausnummerTF() {
		return HausnummerTF;
	}
	public Text getPLZ_TF() {
		return PLZ_TF;
	}
	public Text getOrtTF() {
		return OrtTF;
	}
	public Label getNachnameOut() {
		return NachnameOut;
	}
	public Label getVornameOut() {
		return VornameOut;
	}
	public Label getStrasseOut() {
		return StrasseOut;
	}
	public Label getHausnummerOut() {
		return HausnummerOut;
	}
	public Label getPLZOut() {
		return PLZOut;
	}
	public Label getOrtOut() {
		return OrtOut;
		
	}
}
