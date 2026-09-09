package quatro.tc.ecommerce.ecommerce4tc_back.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import quatro.tc.ecommerce.ecommerce4tc_back.entidades.ItemPedido;

@SpringBootTest 
public class ItemPedidoRepositorioTests {
    @Autowired
    private ItemPedidoRepositorio itemPedidoRepositorio;

    @Autowired 
    private PedidoRepositorio pedidoRepositorio;

    @Autowired 
    private ProdutoRepositorio produtoRepositorio;

    @Test 
    public void deveSalvarUmNovoItemPedido(){
        var itemPedido = new ItemPedido();
        itemPedido.setQuantidade(2);
        itemPedido.setValorUnitario(new BigDecimal("12.99"));

        var produto = produtoRepositorio.findById(1).orElseThrow();
        itemPedido.setProduto(produto);

        var pedido = pedidoRepositorio.findById(1).orElseThrow();
        itemPedido.setPedido(pedido);

        itemPedidoRepositorio.save(itemPedido);

        assertNotNull(itemPedido.getId());
        assertEquals(6, itemPedido.getId());
    }
}
