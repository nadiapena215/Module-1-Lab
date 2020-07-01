import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu implements ActionListener {

	JFrame frame = new JFrame("Number Systems");
	JPanel panel = new JPanel();
	JButton binToDecButton = new JButton();
	JButton binToHexButton = new JButton();
	JButton decToBinButton = new JButton();
	JButton decToHexButton = new JButton();
	JButton hexToBinButton = new JButton();
	JButton hexToDecButton = new JButton();
	
	public void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(binToDecButton);
		panel.add(binToHexButton);
		panel.add(decToBinButton);
		panel.add(decToHexButton);
		panel.add(hexToBinButton);
		panel.add(hexToDecButton);
				
		binToDecButton.setText("Bin to Dec");
		binToHexButton.setText("Bin to Hex");
		decToBinButton.setText("Dec to Bin");
		decToHexButton.setText("Dec to Hex");
		hexToBinButton.setText("Hex to Bin");
		hexToDecButton.setText("Hex to Dec");
		
		frame.pack();		

		binToDecButton.addActionListener(this);
		binToHexButton.addActionListener(this);
		decToBinButton.addActionListener(this);
		decToHexButton.addActionListener(this);
		hexToBinButton.addActionListener(this);
		hexToDecButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		//Binary
		if(e.getSource() == binToDecButton) {
			Binary.convertToDecimal();
			}
		if(e.getSource() == binToHexButton) {
			Binary.convertToHexadecminal();
			}
		
		//Decimal
		if(e.getSource() == decToBinButton) {
			Decimal.convertToBinary();
		}
		if(e.getSource() == decToHexButton) {
			Decimal.convertToHex();
		}
		
		//Hexadecimal
		if(e.getSource() == hexToBinButton) {
			Hexadecimal.convertToBinary();
		}
		if(e.getSource() == hexToDecButton) {
			Hexadecimal.convertToDecimal();
		}		
	}

}
