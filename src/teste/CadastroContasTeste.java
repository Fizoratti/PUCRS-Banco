package teste;


import br.pucrs.ep.es.CadastroContas;
import br.pucrs.ep.es.Conta;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CadastroContasTeste {

    public CadastroContas cadastro;

    @BeforeEach
    public void iniciar(){
       cadastro = new CadastroContas();

        cadastro.inserirConta(new Conta("Matheus",25));
        cadastro.inserirConta(new Conta("Bianca",25));
        cadastro.inserirConta(new Conta("Vitor",63));
        cadastro.inserirConta(new Conta("Maria",58));
    }

    @Test
    public void removerContaTest(){

    }

    @Test
    public void pesquisarContaTest(){

    }



}
