package com.qbo.model.bd.pk;

import java.io.Serializable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PagosId implements Serializable {

	private String idalumno;
	
	private String ciclo;
	
	private Integer ncouta;
}
