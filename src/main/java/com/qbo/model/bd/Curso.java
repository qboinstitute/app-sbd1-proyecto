package com.qbo.model.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "curso")
@Getter
@Setter
@NoArgsConstructor
public class Curso {	
	@Id
	private String idcurso;	
	@Column(name = "nomcurso")
	private String nomcurso;	
	@Column(name = "credito")
	private Integer credito;

}
