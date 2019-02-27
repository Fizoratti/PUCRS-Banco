package br.pucrs.ep.es;

public class Caixa {
    private boolean disponibilidade;
    private Cliente clienteAtual;

    public Caixa() {
        disponibilidade = true;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void chamarProximoCliente() {

    }
}
