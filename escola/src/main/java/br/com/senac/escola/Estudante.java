/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.escola;

/**
 *
 * @author victor57780717
 */
public class Estudante {
    String nome;
    String sobrenome;
    String cor;
    String turno;
    int anoNascimento;
    int idade;
    String endereco;
    
    public Estudante(String nomeRecebido, String sobrenomeRecebido, String corRecebida,
            String turnoRecebido, int anoNascimentoRecebido, String enderecoRecebido){
         nome = nomeRecebido;
         sobrenome = sobrenomeRecebido;
         cor = corRecebida;
         turno = turnoRecebido;
         anoNascimento = anoNascimentoRecebido;
         endereco = enderecoRecebido;
         idade = 0;
    }
    
    
    public void calcularIdade(){
        idade = 2026 - anoNascimento;
    }
    
}
