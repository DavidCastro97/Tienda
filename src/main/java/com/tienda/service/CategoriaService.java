
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author nahum
 */

public interface CategoriaService {
   public List<Categoria> getCategorias(boolean activos);
   public Categoria getCategoria(Categoria categoria);
   public void save (Categoria categoria);
   public void delete (Categoria categoria);    
}

