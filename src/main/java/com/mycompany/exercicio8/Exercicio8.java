/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio8;

/**
 *
 * @author daros
 */
import javax.swing.JOptionPane;
public class Exercicio8 {

    public static void main(String[] args) {
    
    int soma;
    int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero 1: "));
    int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número 2: "));
    
    soma = (numero1 + numero2);
    
    JOptionPane.showMessageDialog(null, "A soma dos números " + numero1 + " e " + numero2 + " é: " + soma);
    
    
    }
}
