import javax.swing.*;

public class Binary {
	
	public static void convertToDecimal() {
		String binaryInput = JOptionPane.showInputDialog("Enter binary to convert to Decimal:");
		int bd = Integer.parseInt(binaryInput);
		int decimal = 0;
		int p = 0;
		while(true){
		  if(bd == 0){
			 break;
			 } else {
		      int temp = bd%10;
		      decimal += temp*Math.pow(2, p);
		      bd = bd/10;
		      p++;
		       }
		    }
		JOptionPane.showMessageDialog(null, "The decimal is: " + decimal);
		//Citation: https://beginnersbook.com/2014/07/java-program-for-binary-to-decimal-conversion/
	}
	
	public static void convertToHexadecminal() {
		String binaryInput1 = JOptionPane.showInputDialog("Enter binary to convert to Hexadecimal:");
		int bh = Integer.parseInt(binaryInput1);
		int rem;
        String hexdecnum="";  
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(bh>0)
        {
            rem = bh%16;
            hexdecnum = hex[rem] + hexdecnum;
            bh = bh/16;
        }
        JOptionPane.showMessageDialog(null, "The Hexadecimal is: " + hexdecnum);
	//Citation: https://codescracker.com/java/program/java-program-convert-binary-to-hexadecimal.htm
	}
}
