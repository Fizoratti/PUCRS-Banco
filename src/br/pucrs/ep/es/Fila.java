package br.pucrs.ep.es;

public class Fila {
    private int posicao;
    public Cliente cliente;


    public Fila(int pos, Cliente cl){
        this.posicao = pos;
        this.cliente = cl;
    }

    public Fila() {
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
