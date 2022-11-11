
package com.tienda.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author nahum
 */

public interface CategoriaDao extends CrudRepository<Categoria, Long>{
    
}
