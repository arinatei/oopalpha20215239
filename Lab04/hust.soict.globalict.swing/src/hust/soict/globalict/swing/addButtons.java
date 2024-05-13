package hust.soict.globalict.swing;

void addButton(JPanel panelButtons) {
ButtonListener btnListener = new ButtonListener();
for(int i = 1; i <= 9; i++) {
btnNumbers[i] = new JButton(""+i);
panelButtons.add(btnNumbers[i]);
btnNumbers[i].addActionListener(btnListener);
}

btnDelete = new JButton("DEL");
panelButtons.add(btnDelete);
btnDelete.addActionListener(btnListener);
btnNumbers[0] = new JButton("0");
panelButtons.add(btnNumbers [0]);
btnNumbers[0].addActionListener(btnListener);
btnReset = new JButton("C");
panelButtons.add(btnReset);
btnReset.addActionListener(btnListener);
}