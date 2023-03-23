
package com.mycompany.mapaprog;


public class Locacao {
    Locatario locatario;
    Quadra quadra;
    private int tempoMinuto;
    private char necessitaEquipamento;

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public int getTempoMinuto() {
        return tempoMinuto;
    }

    public void setTempoMinuto(int tempoMinuto) {
        this.tempoMinuto = tempoMinuto;
    }

    public char getNecessitaEquipamento() {
        return necessitaEquipamento;
    }

    public void setNecessitaEquipamento(char necessitaEquipamento) {
        this.necessitaEquipamento = necessitaEquipamento;
    }
    
    public void cadastrarLocacao() {
        Locatario l = new Locatario();
        l.cadastrarLocatario();
        Quadra q = new Quadra();
        q.cadastrarQuadra();
        
        
    }
    
}
