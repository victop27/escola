/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.escola;

/**
 *
 * @author victor57780717
 */
public class Escola {

    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Ana", "Pereira", "Branca", "Matutino", 2005, "Ceilandia");
        Estudante estudante2 = new Estudante("Maria", "Pereira", "Branca", "Matutino", 2000, "Ceilandia");
        Estudante estudante3 = new Estudante("Joao", "Pereira", "Branca", "Matutino", 2013, "Ceilandia");
        Estudante estudante4 = new Estudante("Pedro", "Pereira", "Branca", "Matutino", 2004, "Ceilandia");
        
        estudante1.calcularIdade();
        estudante2.calcularIdade();
        estudante3.calcularIdade();
        estudante4.calcularIdade();
        
        estudante1.imprimir();
        estudante2.imprimir();
        estudante3.imprimir();
        estudante4.imprimir();

    }
}
