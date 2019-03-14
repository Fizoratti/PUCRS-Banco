package br.pucrs.ep.es;

public class Cliente {
    private String nome;
    private int idade;


    public Cliente(String nome, int idade) {
        setNome(nome);
        setIdade(idade);

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




    @Override
    public String toString() {

        String srt = getNome() +", "+getIdade()+ "anos, ";
        return srt;
    }
}
