import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int numeroIf = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero: "));
        if(numeroIf<0){
            System.out.println("numero negativo");
        } else if (numeroIf>0) {
            System.out.println("numero positivo");
        }else{
            System.out.println("numero igual a 0");
        }

    }
}