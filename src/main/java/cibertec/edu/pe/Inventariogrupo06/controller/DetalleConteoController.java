package cibertec.edu.pe.Inventariogrupo06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cibertec.edu.pe.Inventariogrupo06.model.bd.ConteoModel;
import cibertec.edu.pe.Inventariogrupo06.model.bd.DetalleConteoModel;
import cibertec.edu.pe.Inventariogrupo06.model.request.DetalleConteoRequest;
import cibertec.edu.pe.Inventariogrupo06.model.response.ResultadoDetalleConteo;
import cibertec.edu.pe.Inventariogrupo06.service.DetalleConteoService;



@Controller
@RequestMapping("/DetalleConteo")
public class DetalleConteoController {
	@Autowired
	private DetalleConteoService detalleConteoService;
	
	@GetMapping("/frmDetalleConteo")
	public String frmMantSala(Model model) {
		model.addAttribute("listaDetalleConteo", 
				detalleConteoService.listarDetalleConteo());
		return "DetalleConteo/frmDetalleConteo";
	}
	@PostMapping("/registrarDetalleConteo")
	@ResponseBody
	public ResultadoDetalleConteo registrarDetalleConteo(
			@RequestBody DetalleConteoRequest detalleConteoRequest
			) {
		String mensaje ="Detalle conteo  registrado correctamente";
		Boolean respuesta = true;
		try {			
			DetalleConteoModel objDetalleConteoModel = new DetalleConteoModel();
			if(objDetalleConteoModel.getIddetalle() > 0) {
				objDetalleConteoModel.setIddetalle(detalleConteoRequest.getIddetalle());
			}
			
			objDetalleConteoModel.setDetalle(detalleConteoRequest.getDetalle());
			objDetalleConteoModel.setObservacion(detalleConteoRequest.getObservacion());
			ConteoModel objConteoModel = new ConteoModel();
			objConteoModel.setIdconteo(detalleConteoRequest.getIdconteo());
			objDetalleConteoModel.setConteo(objConteoModel);
			detalleConteoService.registrarDetalleConteo(objDetalleConteoModel);
		}catch(Exception ex) {
			mensaje = "Dato no registrada";
			respuesta = false;
		}
		return ResultadoDetalleConteo.builder()
				.mensaje(mensaje)
				.respuesta(respuesta)
				.build();
	}
	
	@DeleteMapping("/eliminarDetalleConteo")
	@ResponseBody
	public ResultadoDetalleConteo eliminarDetalleConteo(@RequestBody
			DetalleConteoRequest detalleConteoRequest) {
		String mensaje = "Detalle cnte eliminada correctamente";
		Boolean respuesta = true;
		try {
			detalleConteoService.eliminarDetalleConteo(detalleConteoRequest.getIddetalle());
		}catch (Exception e) {
			mensaje = "Sala no eliminada";
			respuesta = false;
		}
		
		return ResultadoDetalleConteo.builder()
				.mensaje(mensaje)
				.respuesta(respuesta)
				.build();
	}
	
	@GetMapping("/listarDetalleConteo")
	@ResponseBody
	public List<DetalleConteoModel> listarDetalleConteo(){
		return detalleConteoService.listarDetalleConteo();
	}
}
