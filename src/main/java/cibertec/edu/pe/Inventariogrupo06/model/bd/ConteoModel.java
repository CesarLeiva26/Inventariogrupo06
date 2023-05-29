package cibertec.edu.pe.Inventariogrupo06.model.bd;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "conteo")
public class ConteoModel {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    public Integer idconteo;
	    
	    @Column(name = "conteo")
	    public int conteo ;
	 
	   
}
