package quatro.tc.ecommerce.ecommerce4tc_back.recursos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import quatro.tc.ecommerce.ecommerce4tc_back.entidades.Produto;
import quatro.tc.ecommerce.ecommerce4tc_back.repositorios.ItemPedidoRepositorio;
import quatro.tc.ecommerce.ecommerce4tc_back.repositorios.ProdutoRepositorio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("produtos")
public class ProdutoRecurso {
    @Autowired
    private ProdutoRepositorio produtoRepositorio;
    
    @Autowired
    private ItemPedidoRepositorio itemPedidoRepositorio;

    @GetMapping
    public List<Produto> listar() {
        return produtoRepositorio.findAll(Sort.by("nome"));
    }

    @GetMapping("{id}")
    public Optional<Produto> buscarPorID(@PathVariable Integer id) {
        Optional<Produto> produto = produtoRepositorio.findById(id);
        if (produto.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return produto;
    }

    @PostMapping
    public Produto inserir(@RequestBody Produto produto) {
        return produtoRepositorio.save(produto);
    }

    @DeleteMapping("{id}")
    public void excluirPorId(@PathVariable Integer id) {
        Optional<Produto> produto = produtoRepositorio.findById(id);
        if (produto.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        boolean emUso = itemPedidoRepositorio.existsById(id);
        if (emUso) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
        
        produtoRepositorio.deleteById(id);
    }
}
