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
        
        System.out.println("Nome: " + estudante1.nome);        
        System.out.println("Sobrenome: " + estudante1.sobrenome);
        System.out.println("Cor: " + estudante1.cor);
        System.out.println("Turno: " + estudante1.turno);
        System.out.println("Ano Nascimento: " + estudante1.anoNascimento);
        System.out.println("Idade: " + estudante1.idade);
        System.out.println("Endereco: " + estudante1.endereco);
        
        System.out.println("-----------------------------------------");
        
        System.out.println("Nome: " + estudante2.nome);        
        System.out.println("Sobrenome: " + estudante2.sobrenome);
        System.out.println("Cor: " + estudante2.cor);
        System.out.println("Turno: " + estudante2.turno);
        System.out.println("Ano Nascimento: " + estudante2.anoNascimento);
        System.out.println("Idade: " + estudante2.idade);
        System.out.println("Endereco: " + estudante2.endereco);
        
        System.out.println("-----------------------------------------");
        
        System.out.println("Nome: " + estudante3.nome);        
        System.out.println("Sobrenome: " + estudante3.sobrenome);
        System.out.println("Cor: " + estudante3.cor);
        System.out.println("Turno: " + estudante3.turno);
        System.out.println("Ano Nascimento: " + estudante3.anoNascimento);
        System.out.println("Idade: " + estudante3.idade);
        System.out.println("Endereco: " + estudante3.endereco);
        
        System.out.println("-----------------------------------------");
        
        System.out.println("Nome: " + estudante4.nome);        
        System.out.println("Sobrenome: " + estudante4.sobrenome);
        System.out.println("Cor: " + estudante4.cor);
        System.out.println("Turno: " + estudante4.turno);
        System.out.println("Ano Nascimento: " + estudante4.anoNascimento);
        System.out.println("Idade: " + estudante4.idade);
        System.out.println("Endereco: " + estudante4.endereco);

    }
}
