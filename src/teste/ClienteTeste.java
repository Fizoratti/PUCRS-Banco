package teste;

import br.pucrs.ep.es.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTeste {
    public Cliente cliente;
    @BeforeEach
    public void inicicar(){
    cliente = new Cliente("Matheus", 25);
    }

    @Test
    public void clienteIdadeTest(){
        assertEquals(25,cliente.getIdade());
    }

    @Test
    public void clienteNomeTest(){

        assertEquals("Matheus",cliente.getNome());
    }
}
