package cibertec.edu.pe.Inventariogrupo06.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.edu.pe.Inventariogrupo06.model.bd.DetalleConteoModel;
import cibertec.edu.pe.Inventariogrupo06.repository.DetalleConteoRepository;

@Service
public class DetalleConteoService {
	
	@Autowired
	private DetalleConteoRepository estadoRepository;
	
	public List<DetalleConteoModel> listarDetalleConteo(){
		return estadoRepository.findAll();
	}
	
	public void registrarDetalleConteo(DetalleConteoModel detalleConteo) {
		estadoRepository.save(detalleConteo);
	}
	
	public void eliminarDetalleConteo(Integer idDetalle) {
		estadoRepository.deleteById(idDetalle);
	}
}
