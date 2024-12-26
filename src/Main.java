import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un nuemro entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr); //500
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }


        System.out.println("Numero Decimal = " + numeroDecimal);
        String resultadoBinario = "Numeros binarios = " + numeroDecimal + " <=> " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = numeroDecimal;
        String resultadoOctal = "Numeros Octal = " + numeroBinario + " <=> " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = numeroDecimal;
        String resultadoHexa = "Numeros Hexadecimal = " + numeroOctal + " <=> " + Integer.toHexString(numeroOctal);
        System.out.println(resultadoHexa);

        int numeroHexa = numeroDecimal;
        System.out.println("Numero Hexadecimal =" + numeroHexa);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexa;
        JOptionPane.showInputDialog(null,mensaje);
    }
}
