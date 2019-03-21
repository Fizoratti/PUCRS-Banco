package teste;


import br.pucrs.ep.es.Conta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContasTeste {

    public Conta conta;


    @BeforeEach
    public void iniciar(){

        conta = new Conta("Matheus",25);
    }

    @Test
    public void getClienteTest(){
        assertEquals("Matheus",conta.getCliente().getNome());
    }

    @Test
    public void getSaldoTest(){
        assertEquals(0,conta.getSaldo());
    }

    @Test
    public void depositarTest(){
        conta.depositar(2000);
        assertEquals(2000,conta.getSaldo());
    }

    @Test
    public void depositarInvalidoTest(){
        assertThrows(IllegalArgumentException.class, ()->conta.depositar(0) );
    }

    @Test
    public void retiradaTest(){
        conta.depositar(6000);
        conta.retirada(2500);
        assertEquals(3500,conta.getSaldo());
    }

    @Test
    public void retiradaInvalidaTest(){
        conta.depositar(6000);
        assertThrows(IllegalArgumentException.class, ()->conta.retirada(6100) );
    }

    @Test
    public void upgradeContaGoldTest(){
        conta.depositar(50000);
        assertEquals("Gold",conta.getCategoria());
    }

    @Test
    public void upgradeCOntaPlatinumTest(){
        conta.depositar(200000);
        assertEquals("Platinum",conta.getCategoria());
    }

    @Test
    public void retrocedeContaGoldTest(){
        conta.depositar(200000);
        conta.retirada(110000);
        assertEquals("Gold",conta.getCategoria());
    }

    @Test
    public void retrocedeContaSilverTest (){
        conta.depositar(50000);
        conta.retirada(26000);
        assertEquals("Silver",conta.getCategoria());
    }

    @Test
    public void retrocedeContaGoldApenasUmSaqueTest(){
        conta.depositar(200000);
        conta.retirada(176000);
        assertEquals("Gold",conta.getCategoria());
    }




}
