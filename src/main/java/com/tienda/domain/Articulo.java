

package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author nahum
 */

@Data
@Entity
@Table(name="articulo")
public class Articulo implements Serializable{
     private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name="id_articulo")
        private Long idArticulo;
        private Long idCategoria;
        private String descripcion;
        private String detalle;
        private double precio;
        private int existencias;
        private boolean activo;

    public Articulo() {
    }

    public Articulo(Long idCategoria, String descripcion, String detalle, double precio, int existencias, boolean activo) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
    }
        
        
}

