package hust.soict.globalict.swing;

public class ButtonListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if(button.charAt(0) >= '0' && button.charAt(0) <= '9') {
			tfDisplay.setText(tfDisplay.getText() + button);
		}
		else if(button.equals("DEL")) {
			//DEL case
		}
		else {
			//C case
		}
	}
}
