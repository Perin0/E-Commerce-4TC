
package quatro.tc.ecommerce.ecommerce4tc_back.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import quatro.tc.ecommerce.ecommerce4tc_back.entidades.Categoria;
import quatro.tc.ecommerce.ecommerce4tc_back.entidades.Produto;

@SpringBootTest 
public class ProdutoRepositorioTests {
    @Autowired 
    private CategoriaRepositorio categoriaRepositorio;

    @Autowired 
    private ProdutoRepositorio produtoRespoRepositorio;

    @Test
    public void deveSalvarUmProdutoNovo(){
        var produto = new Produto();
        produto.setNome("Notebook Lenovo");
        produto.setDescricao("SSD 2TB, 16GB RAM");
        produto.setPreco(new BigDecimal("12570.99"));
        produto.setEstoque(Short.parseShort("10"));
        
        // SELECT * FROM categoria WHERE id = 1
        var categoria = categoriaRepositorio.findById(Short.parseShort("1")).orElseThrow();
        produto.setCategoria(categoria);

        produtoRespoRepositorio.save(produto);
        assertNotNull(produto.getId());
        assertEquals(6, produto.getId());
    }
}
