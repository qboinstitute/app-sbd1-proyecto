package com.qbo.model.bd.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Embeddable
public class NotasId implements Serializable {

	private String idalumno;
	private String idcurso;
	
}
