package com.guilhermekfreitas.uemanalytics.model;

import java.util.HashMap;
import java.util.Map;

public enum TipoPeriodo {
	MATUTINO("Matutino"),
	VESPERTINO("Vespertino"),
	NOTURNO("Noturno"),
	INTEGRAL("Integral");

	private static Map<String,TipoPeriodo> stringToEnum = new HashMap<String,TipoPeriodo>();
	private String descricao;

	static {
		for (TipoPeriodo op: TipoPeriodo.values()){
			stringToEnum.put(op.toString(), op);
		}
	}

	private TipoPeriodo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}

	// Return TipoPeriodo for string, or null if string is invalid
	public static TipoPeriodo fromString(String symbol){
		return stringToEnum.get(symbol);
	}
}
