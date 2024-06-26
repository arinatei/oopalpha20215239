package hust.soict.globalict.swing;

public class NumberGrid extends JFrame {
	private JButton[] btnNumbers = new JButton[10];
	private JButton btnDelete, btnReset;
	private JTextField tfDisplay;
	
	public NumberGrid() {
		
		tfDisplay = newJTextField();
		tfDisplay.setComponentOrientation(
				ComponentOrientation.RIGHT_TO_LEFT);
		JPanel panelButtons = new JPanel(new GridLayout(4, 3));
		addButtons(panelButtons);
		
		Container cp = getContentPane();
		cp.SetLayout(new BorderLayout());
		cp.add(tfDisplay, BorderLayout.NORTH);
		cp.add(panelButtons, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Number Grid");
		setSize(200, 200);
		setVisible(true);
	}
}
