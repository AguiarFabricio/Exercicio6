/**
 *
 * @author Fabricio de Aguiar
 */
/**5 - (Exercício anterior) - Faça um programa em JAVA,
declarando uma variável do tipo inteiro (int),
atribua um valor qualquer a esta variável,
depois mostre o valor desta variável em uma
mensagem.
6 - Repita o exercício anterior, mas agora mostre a
mensagem abaixo usando concatenação no código:
O valor da variável é : <número escolhido>*/
package com.mycompany.exercicio6;
import javax.swing.JOptionPane;

public class Exercicio6 {

    public static void main(String[] args) {
        int numero;
        numero = 10;
        JOptionPane.showMessageDialog(null, "O valor da variável é : " + numero);
    }
}
