package br.pucrs.ep.es;

public class Conta {
    public double saldo;
    public enum Categoria{
        Silver, Gold, Platinum;
    }
    private Categoria categoria;
    private double valorizacao;
    private Cliente cliente;

    public Conta(String nome, int idade) {
        this.saldo = 0;
        setCategoria(Categoria.Silver);
        this.cliente = new Cliente(nome, idade);
    }



    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {

            if (valor > 0) {
                calcularValorizacao();
                this.saldo += valor * this.valorizacao;
                upgradeConta();
            }else{
                throw new IllegalArgumentException();
            }
        }






    public void retirada(double valor){
        if(getSaldo()>=valor) {
            this.saldo -=  valor;
            retrocedeConta();

        }else{
            throw new IllegalArgumentException();

        }
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


        if(saldo < 100000.00 && getCategoria() == "Platinum"){
            setCategoria(Categoria.Gold);
        }else if(saldo < 25000.00 && getCategoria()=="Gold"){
            setCategoria(Categoria.Silver);
        }
        //tem que fazer
        // não pode voltar dois upgrades em uma unica retirada
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


    }

    @Override
    public String toString() {
        return "Cliente: "+cliente.getNome()+"Saldo: " + saldo + " Categoria: " + categoria + " Valorizção:" + valorizacao;

    }
}
