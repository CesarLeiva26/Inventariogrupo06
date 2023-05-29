package cibertec.edu.pe.Inventariogrupo06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cibertec.edu.pe.Inventariogrupo06.model.bd.ConteoModel;
import cibertec.edu.pe.Inventariogrupo06.service.ConteoService;

@Controller
@RequestMapping("/Conteo")
public class ConteoController {

	@Autowired
	private ConteoService conteoService;
	
	@GetMapping("/listarConteos")
	@ResponseBody
	public List<ConteoModel> listarConteos(){
		return conteoService.listarConteo();
	}
}
