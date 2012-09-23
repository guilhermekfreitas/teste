package com.guilhermekfreitas.uemanalytics.model;

public class Inscricao {
	private String inscricao;
	
	public Inscricao(String inscricao) {
		this.inscricao = inscricao;
	}
	
	@Override
	public String toString() {
		return inscricao;
	}
	
	public static Inscricao valueOf(String inscricao){
		checkInscricao(inscricao);
		return new Inscricao(inscricao);
	}

	private static void checkInscricao(String inscricao2) {
		// to-do
	}
}
