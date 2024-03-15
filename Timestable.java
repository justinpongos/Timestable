import javax.swing.JOptionPane;
public class Timestable {
	public static void main (String[]args) {
		int row = (Integer.parseInt(JOptionPane.showInputDialog("How many rows?")));
		int column = (Integer.parseInt(JOptionPane.showInputDialog("How many column's?")));
		
		int [][] table = new int[row][column];
		
        for (int r = 0; r < table.length; r++) {
            for (int c = 0; c < table[0].length; c++) {
            	table[r][c] = (r + 1) * (c + 1);
            }//end for 1
        }//end for 2
        for (int r = 0; r < table.length; r++) {
            for (int c = 0; c < table[0].length; c++) {
            	System.out.print(table[r][c] + " ");
            }//end for 1
            System.out.print("\n");
        }//end for 2
	}//end main
}//end class
