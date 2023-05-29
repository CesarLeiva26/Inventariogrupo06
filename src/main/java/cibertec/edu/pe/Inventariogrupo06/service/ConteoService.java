package cibertec.edu.pe.Inventariogrupo06.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.edu.pe.Inventariogrupo06.model.bd.ConteoModel;
import cibertec.edu.pe.Inventariogrupo06.model.bd.Pallet;
import cibertec.edu.pe.Inventariogrupo06.repository.ConteoRepository;
import cibertec.edu.pe.Inventariogrupo06.repository.PalletRepository;

@Service
public class ConteoService {

	@Autowired
	private ConteoRepository  conteoService;

	public List<ConteoModel> listarConteo() {
		return conteoService.findAll();
	}
}
