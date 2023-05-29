package cibertec.edu.pe.Inventariogrupo06.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultadoproductoResponse {

	private Boolean respuesta;
	private String mensaje;
}