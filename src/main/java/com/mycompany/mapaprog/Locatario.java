
package com.mycompany.mapaprog;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;


public class Locatario {
    private String nome;
    private String cpf;
    private String telefone;
    private int anoNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public void cadastrarLocatario() {
        Scanner scan = new Scanner (System.in);   
        
        System.out.println("Insira o nome do locatário: ");
        nome = scan.next();
        System.out.println("Insira o cpf do locatário: ");
        cpf = scan.next();
        System.out.println("Insira o telefone do locatário: ");
        telefone = scan.next();
        
        verificarMaiorIdade();
        
        
    }
    
    public void verificarMaiorIdade() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = scan.nextInt();
        
        
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();
        int idade = Period.between(LocalDate.of(anoNascimento, 1, 1), hoje).getYears();
        
        
        if (idade >= 18) {
            System.out.println("Idade permitida para cadastro!");
        } else if (anoNascimento + 18 == anoAtual) {
         System.out.println("Idade permitida para cadastro!");
        } else {
         System.out.println("Locatário menor de idade. Programa finalizado");
          }
        
    }
    
}
