package cibertec.edu.pe.Inventariogrupo06.model.request;
import lombok.Data;

@Data
public class DetalleConteoRequest {
	private Integer iddetalle;
	private String detalle;
	private String observacion;
	private Integer idconteo;
}
