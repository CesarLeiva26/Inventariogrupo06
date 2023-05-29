package cibertec.edu.pe.Inventariogrupo06.model.bd;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "detalleconteo")
public class DetalleConteoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer iddetalle;
    
    @Column(name = "detalle")
    public String detalle;
    
    @Column(name = "observacion")
    public String observacion;
    
	@ManyToOne
	@JoinColumn(name ="idconteo")
	private ConteoModel conteo;
    
  
	
}