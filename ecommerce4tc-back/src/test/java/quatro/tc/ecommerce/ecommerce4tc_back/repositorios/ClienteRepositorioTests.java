package quatro.tc.ecommerce.ecommerce4tc_back.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import quatro.tc.ecommerce.ecommerce4tc_back.entidades.Cliente;

@SpringBootTest 
public class ClienteRepositorioTests {
    @Autowired 
    private ClienteRepositorio clienteRepositorio;

    @Test 
    public void deveSalvarUmNovoCliente(){
        var cliente = new Cliente();
        cliente.setNome("Perino");
        cliente.setEmail("perino@gmail.com");
        cliente.setTelefone("11999999999");

        clienteRepositorio.save(cliente);
        assertNotNull(cliente.getId());
        assertEquals(6, cliente.getId());
    }
}
