package teste;

import br.pucrs.ep.es.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTeste {
    private Cliente cliente;
    @BeforeAll
    public void setUp(){
    cliente = new Cliente("Matheus", 25);
    }

    @Test
    public void testarCliente(){
        int idade = 25;
        assertEquals(cliente.getIdade(),idade);


    }
}
