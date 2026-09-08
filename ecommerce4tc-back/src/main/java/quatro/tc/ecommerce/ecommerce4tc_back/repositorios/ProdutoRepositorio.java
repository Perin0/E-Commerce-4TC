package quatro.tc.ecommerce.ecommerce4tc_back.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import quatro.tc.ecommerce.ecommerce4tc_back.entidades.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Integer>{

}
