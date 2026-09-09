package quatro.tc.ecommerce.ecommerce4tc_back.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import quatro.tc.ecommerce.ecommerce4tc_back.entidades.Pedido;

@SpringBootTest 
public class PedidoRepositorioTests {
    @Autowired 
    private ClienteRepositorio clienteRepositorio;

    @Autowired 
    private PedidoRepositorio pedidoRepositorio;

    @Test 
    public void deveSalvarUmPedidoNovo(){
        var pedido = new Pedido();
        pedido.setData(LocalDateTime.parse("2026-09-08T22:15:30"));
        pedido.setStatus("Pago");
        
        var cliente = clienteRepositorio.findById(1).orElseThrow();
        pedido.setCliente(cliente);

        pedidoRepositorio.save(pedido);
        assertNotNull(pedido.getId());
        assertEquals(6, pedido.getId());
    }
}
