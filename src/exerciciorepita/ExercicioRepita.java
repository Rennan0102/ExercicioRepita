package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        int numero, contador = -1, soma = 0, par = -1, impar = 0, acimaCem = 0, media = 0;
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um Número: <br><em>[0 - Sair]</em></html>"));
            soma += numero;
            
            if (numero % 2 == 0){
                par++;
            } else{
                impar++;
            }
            if (numero > 100){
                acimaCem++;
            }
            contador++;
        } while (numero != 0);
        
        media = soma / contador;
        System.out.println(contador);
        JOptionPane.showMessageDialog(null, "            Resultado Final"
                + "\nSoma Total: " + soma
                + "\nTotal Pares: " + par 
                + "\nTotal Ímpares: " + impar
                + "\nAcima de 100: " + acimaCem
                + "\nMédia dos Valores: " + media);
    }
    
}
