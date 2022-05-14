import javax.swing.*;

public class DoWhile {

    public static void main(String[] args) {

        int numDoWhile = Integer.parseInt(JOptionPane.showInputDialog(null, "introduce un numero "));
        int i = 0;
        do {
            System.out.println(numDoWhile);
            numDoWhile++;
            i++;
        }while (i <= 0);
    }
}
