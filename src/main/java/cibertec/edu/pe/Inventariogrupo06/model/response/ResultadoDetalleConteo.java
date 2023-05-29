package cibertec.edu.pe.Inventariogrupo06.model.response;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultadoDetalleConteo {

	private Boolean respuesta;
	private String mensaje;
}
