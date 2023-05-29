package cibertec.edu.pe.Inventariogrupo06.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.edu.pe.Inventariogrupo06.model.bd.Pallet;
import cibertec.edu.pe.Inventariogrupo06.repository.PalletRepository;
  
@Service
public class PalletService {

	@Autowired
	private PalletRepository  palletrepository;

	public List<Pallet> listarPallets() {
		return palletrepository.findAll();
	}
}