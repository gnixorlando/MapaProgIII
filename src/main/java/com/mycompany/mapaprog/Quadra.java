
package com.mycompany.mapaprog;

import java.util.Scanner;


public class Quadra {
    private int nome;
    private String tipoDaQuadra;
    private int valorMinuto;

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public String getTipoDaQuadra() {
        return tipoDaQuadra;
    }

    public void setTipoDaQuadra(String tipoDaQuadra) {
        this.tipoDaQuadra = tipoDaQuadra;
    }

    public int getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(int valorMinuto) {
        this.valorMinuto = valorMinuto;
    }
    
    public void cadastrarQuadra() {
        Scanner scan = new Scanner (System.in);   
        
        System.out.println("Qual o nome da quadra? (1,2,3...)");
        nome = scan.nextInt();
        
        System.out.println("Qual o valor por minuto?");
        valorMinuto = scan.nextInt();
        
        System.out.println("Qual o tipo da quadra? (volei, futsal...)");
        tipoDaQuadra = scan.next();
        
    }
    
    
    
}
