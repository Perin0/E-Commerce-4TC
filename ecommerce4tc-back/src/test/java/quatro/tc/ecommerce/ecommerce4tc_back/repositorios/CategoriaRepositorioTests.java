package quatro.tc.ecommerce.ecommerce4tc_back.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import quatro.tc.ecommerce.ecommerce4tc_back.entidades.Categoria;

@SpringBootTest 
public class CategoriaRepositorioTests {
    @Autowired 
    private CategoriaRepositorio categoriaRepositorio;

    @Test 
    public void deveSalvarUmaCategoria(){
        var categoria = new Categoria();
        categoria.setNome("Câmeras");
        categoria.setDescricao("Câmeras digitais diversas");

        categoriaRepositorio.save(categoria);
        assertNotNull(categoria.getId());
        assertEquals(Short.parseShort("6"), categoria.getId());
    }
}
