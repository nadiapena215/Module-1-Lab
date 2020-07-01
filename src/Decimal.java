import javax.swing.*;

public class Decimal {
	
	public static void convertToBinary() {
		String decimalInput = JOptionPane.showInputDialog("Enter decimal to convert to Binary:");
		int db = Integer.parseInt(decimalInput);
		int binary[] = new int[40];
	    int index = 0;
	    String binAnswer=""; 
	    while(db > 0){
	      binary[index++] = db%2;
	      db = db/2;
	     }
	     for(int i = index-1;i >= 0;i--){
	    	 binAnswer = binAnswer + String.valueOf(binary[i]);
	     }
	     JOptionPane.showMessageDialog(null, "The binary is: " + binAnswer);
	     //Citation: https://beginnersbook.com/2014/07/java-program-for-binary-to-decimal-conversion/
	}
	
	public static void convertToHex() {
		String decimalInput1 = JOptionPane.showInputDialog("Enter decimal to convert to Hexadecimal:");
		int dh = Integer.parseInt(decimalInput1);
		int rem;
		String hexAnswer=""; 
		char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		 
	     while(dh>0)
	     {
	       rem=dh%16; 
	       hexAnswer=hex[rem]+hexAnswer; 
	       dh=dh/16;
	     }
	 	JOptionPane.showMessageDialog(null, "The Hexadecimal is: " + hexAnswer);
	 	//Citation: https://beginnersbook.com/2014/07/java-program-to-convert-decimal-to-hexadecimal/
	}
}
