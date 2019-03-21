package teste;


import br.pucrs.ep.es.CadastroContas;
import br.pucrs.ep.es.Conta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

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
        //não está funcionando
        cadastro.removerConta("Matheus");
        ArrayList<Conta> aux = new ArrayList<Conta>(){{
            cadastro.inserirConta(new Conta("Bianca",25));
            cadastro.inserirConta(new Conta("Vitor",63));
            cadastro.inserirConta(new Conta("Maria",58));
        }};
        assertIterableEquals(aux,cadastro.getContas());
    }

    @Test
    public void pesquisarContaTest(){
        //não está funcionando
        cadastro.removerConta("Matheus");
        ArrayList<Conta> aux = new ArrayList<Conta>();
        aux.add(new Conta("Bianca",25));
        aux.add(new Conta("Vitor",63));
        aux.add(new Conta("Maria",58));
        assertIterableEquals(aux,cadastro.getContas());
    }



}
