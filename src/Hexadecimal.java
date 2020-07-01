import javax.swing.JOptionPane;

public class Hexadecimal {
	public static void convertToBinary() {
		String hexInput = JOptionPane.showInputDialog("Enter hexadecimal to convert to Binary:");
		 String digits = "0123456789ABCDEF";
		 hexInput = hexInput.toUpperCase();
         int val = 0;
         for (int i = 0; i < hexInput.length(); i++) {
             char c = hexInput.charAt(i);
             int d = digits.indexOf(c);
             val = 16*val + d;
         }
         int i=1; 
         int j;
         int binnum[] = new int[100];
         String binAns = "";
         while(val != 0) {
             binnum[i++] = val%2;
             val = val/2;
         }
 		for(j=i-1; j>0; j--) {
 			 binAns = binAns + String.valueOf(binnum[j]);
         }
 		JOptionPane.showMessageDialog(null, "The Binary is: " + binAns);
 		//Citation: https://codescracker.com/java/program/java-program-convert-hexadecimal-to-binary.htm
}
	
	public static void convertToDecimal() {
		String hexInput1 = JOptionPane.showInputDialog("Enter hexadecimal to convert to Decimal:");
		String hstring = "0123456789ABCDEF";  
		hexInput1 = hexInput1.toUpperCase();  
		int num = 0;  
		for (int i = 0; i < hexInput1.length(); i++)  
		{  
			char ch = hexInput1.charAt(i);  
			int n = hstring.indexOf(ch);  
			num = 16*num + n;  
		}  
		JOptionPane.showMessageDialog(null, "The Decimal is: " + num);
		//Citation: https://beginnersbook.com/2019/04/java-hexadecimal-to-decimal-conversion/


}
}
