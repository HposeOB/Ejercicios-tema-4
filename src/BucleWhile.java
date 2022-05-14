import javax.swing.*;

public class BucleWhile {

    public static void main(String[] args) {
        int numeroWhile = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero: "));
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }

}
