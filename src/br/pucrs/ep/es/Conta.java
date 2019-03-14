package br.pucrs.ep.es;

public class Conta {
    public double saldo;
    public enum Categoria{
        Silver, Gold, Platinum;
    }
    private Categoria categoria;
    private double valorizacao;

    public Conta(double saldo) {
        this.saldo = saldo;
        setCategoria(Categoria.Silver);
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        calcularValorizacao();
        this.saldo += valor * this.valorizacao;
    }

    public String getCategoria() {
        return categoria.toString();
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void upgradeConta(){
        if(saldo >= 50000.00 && saldo < 200000.00){
            setCategoria(Categoria.Gold);
        }else if(saldo >= 200000.00){
            setCategoria(Categoria.Platinum);
        }else{
            setCategoria(Categoria.Silver);
        }
    }

    public void retrocedeConta(){
        //tem que fazer
    }

    public void calcularValorizacao() {
        if(categoria == Categoria.Silver) {
            this.valorizacao = 1.00;
        }
        if(categoria == Categoria.Gold) {
            this.valorizacao = 1.01;
        }
        if(categoria == Categoria.Platinum) {
            this.valorizacao = 1.025;
        }

        //oi
    }
}
