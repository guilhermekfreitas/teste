package com.guilhermekfreitas.uemanalytics.model;

public class CandidatoRegular implements CandidatoVestibular {

	private Long id;
	private Inscricao inscricao;
	private String nomeCompleto;
	private Boolean isCotista;
	
	public CandidatoRegular(Inscricao inscricao, String nomeCompleto, Boolean isCotista) {
		this.inscricao = inscricao;
		this.nomeCompleto = nomeCompleto;
		this.isCotista = isCotista;
	}
	
	public Inscricao getInscricao() {
		return inscricao;
	}

	public String getNome() {
		return nomeCompleto;
	}
	
	public Boolean isCotista() {
		return isCotista;
	}

}
