package cibertec.edu.pe.Inventariogrupo06.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.edu.pe.Inventariogrupo06.model.bd.DetalleConteoModel;


@Repository
public interface DetalleConteoRepository 
		extends JpaRepository<DetalleConteoModel, Integer> {

}
