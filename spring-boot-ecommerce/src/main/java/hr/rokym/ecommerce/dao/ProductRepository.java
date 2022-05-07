package hr.rokym.ecommerce.dao;

import hr.rokym.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

   Page<Product> findByCategoryId(@RequestParam("id") long id, Pageable pegeable);

   Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
}
