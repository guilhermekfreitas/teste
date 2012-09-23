package com.guilhermekfreitas.uemanalytics.model;

import java.util.HashMap;
import java.util.Map;

public enum Campus {
	MARINGA("Maring�"),
	CIANORTE("Cianorte"),
	GOIOERE("Goioer�"),
	ARENITO("Arenito"),
	DIAMANTE_DO_NORTE("Diamante do Norte"),
	UMUARAMA("Umuarama"),
	IVAIPOR�("Ivaipor�");

	private static Map<String,Campus> stringToEnum = new HashMap<String,Campus>();
	private String nome;

	static {
		for (Campus op: Campus.values()){
			stringToEnum.put(op.toString(), op);
		}
	}

	private Campus(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return nome;
	}

	// Return Campus for string, or null if string is invalid
	public static Campus fromString(String symbol){
		return stringToEnum.get(symbol);
	}
}
