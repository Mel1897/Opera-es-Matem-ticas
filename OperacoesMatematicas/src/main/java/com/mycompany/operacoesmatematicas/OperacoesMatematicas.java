/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoesmatematicas;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class OperacoesMatematicas {

    public static void main(String[] args) {
        //definição de dois numeros
         double num1 = 10.9;
         double num2 = 4.1;
         
         //Realizando operações matemáticas
         double soma = num1 + num2;
         double subtracao = num1 - num2;
         double multiplicacao = num1 * num2;
         double divisao = num1 != 0 ? num1 / num2 : Double.NaN;
         double resto = num1 % num2;
         double areadoquadrado = num1 * num1;
         double areadoretangulo = num1 * num2;
         double areadotriangulo = num1 * num2 / 2;
         double areadolosango = num1 * num2 / 2;
         double areadacircunferencia = Math.PI * num1 * num1;
         double media = num1 + num2 / 2;
         
         //exibindoos resultados
         System.out.println("Resultado das operações:");
         System.out.println("Soma:" + soma);
         System.out.println("Subtração:" + subtracao);
         System.out.println("Multiplicação:" + multiplicacao);
         System.out.println("Divisão:" + (num2 != 0 ? divisao: "Indefinido (divisão por zero)"));
         System.out.println("Resto da divisão:" + resto);
         System.out.println("Area do Quadrado:" + areadoquadrado);
         System.out.println("Area do Retangulo:" + areadoretangulo);
         System.out.println("Area do Losango:" + areadolosango);
         System.out.println("Area do Triangulo:" + areadotriangulo);
         System.out.println("Area da Circunferencia:" + areadacircunferencia);
         System.out.println("Media:" + media);
         
    }
}