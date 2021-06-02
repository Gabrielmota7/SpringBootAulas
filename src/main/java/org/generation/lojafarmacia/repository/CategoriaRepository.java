  
package org.generation.lojafarmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.generation.lojafarmacia.model.categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<categoria, Long> {

	public List<categoria> findAllByTipoContainingIgnoreCase(String tipo);
}
