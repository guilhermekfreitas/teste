package com.guilhermekfreitas.uemanalytics.model;

import static com.google.common.base.Preconditions.*;

import com.google.common.base.Objects;


public class Curso {
	private Long id;
	private Integer numero;
	private String nome;
	private Campus campusCurso;
	private TipoPeriodo periodo;
	private Integer vagas;
	
	Curso() {
	}
	
	public Curso(Integer numero, String nome, Campus campusCurso, TipoPeriodo periodo, Integer vagas){
//		checkNotNull(campusCurso); // necessário?
//		checkNotNull(periodo);
		this.numero = numero;
		this.nome = nome;
		this.campusCurso = campusCurso;
		this.periodo = periodo;
		this.vagas = vagas;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Campus getCampusCurso() {
		return campusCurso;
	}
	
	public TipoPeriodo getPeriodo() {
		return periodo;
	}
	
	public Integer getVagas() {
		return vagas;
	}
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this)
				.add("numero", numero)
				.add("nome", nome)
				.add("campus", campusCurso)
				.add("periodo", periodo)
				.add("vagas", vagas).toString();
	}
	
}
