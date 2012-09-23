package com.guilhermekfreitas.uemanalytics;

import java.util.regex.Pattern;

public class Regex {

	private static final String CURSO_PRECEEDING_CHARS = "[^\\d]+";
	private static final String CURSO_NUMERO = "\\d+";
	private static final String CURSO_SEPARATOR = " - ";
	private static final String CURSO_NOME = "[^\\(]+";
	private static final String CURSO_INICIO_PARENTESES = " \\(";
	private static final String CURSO_TIPO_PERIODO = "[^\\s]+";
	private static final String HIFEN = "-";
	private static final String CURSO_CAMPUS = "[^\\s]+";
	private static final String CURSO_FIM_PARENTESES = "\\)";
	private static final String WHITESPACES = "\\s*";
	private static final String CURSO_VAGAS_STR = "VAGAS:";
	private static final String CURSO_NUM_VAGAS = "\\d+";
	  
//	  Pattern p = Pattern.compile("([^\\d]+)(\\d+)( - )([^\\s]+) \\(([^\\s]+)-([^\\s]+)\\)");
	private static final String CURSO_PATTERN_STRING = 
			  "(" +															// $1 total match
				"(" + CURSO_PRECEEDING_CHARS + ")" +						// $2 Preceeding chars
				"(" + CURSO_NUMERO + ")" +									// $3 Código do Curso
				"(" + CURSO_SEPARATOR + ")" +								// $4 Hifen
				"(" + CURSO_NOME + ")" +									// $5 Nome do curso
				CURSO_INICIO_PARENTESES + 									//    Antes do período
				"(" + CURSO_TIPO_PERIODO + ")" +							// $6 Tipo do Período
				HIFEN +														//    Hifen
				"(" + CURSO_CAMPUS + ")" +									// $7 Campus do Curso
				CURSO_FIM_PARENTESES +										//    Parênteses direito
				WHITESPACES +
				CURSO_VAGAS_STR + 
				WHITESPACES +
				"(" + CURSO_NUM_VAGAS + ")" +								// $8 Número de vagas
				WHITESPACES + 
			  ")";
				

	  public static final Pattern CURSO = Pattern.compile(CURSO_PATTERN_STRING);
	  public static final int CURSO_GROUP_ALL = 1;
	  public static final int CURSO_GROUP_CODIGO_CURSO = 3;
	  public static final int CURSO_GROUP_NOME = 5;
	  public static final int CURSO_GROUP_PERIODO = 6;
	  public static final int CURSO_GROUP_CAMPUS = 7;
	  public static final int CURSO_GROUP_VAGAS = 8;
	  
	private static final String CANDIDATO_INSCRICAO = "\\d+-\\d";
	private static final String CANDIDATO_NOME = "[^\\s{2}]+"; // até encontrar dois espaços
	private static final String CANDIDATO_IS_COTISTA = "[(SIM)(NÃO)]";
	private static final String CANDIDATO_NOTA = "[^\\w]+"; // qualquer coisa menos espaços 
	private static final String CANDIDATO_TOTAL_PARCIAL = "[^\\w]+"; // qualquer coisa menos espaços;
//	private static final String CANDIDATO_TOTAL = null;
//	private static final String CANDIDATO_TOTAL = null;
	private static final String CANDIDATO_ESCORE_FINAL = "[^\\w]+"; // qualquer coisa menos espaços;;
	private static final String CANDIDATO_CLASSIFICACAO = "[^\\w]+"; // qualquer coisa menos espaços;;
	private static final String CANDIDATO_SITUACAO = "[^\\w]+"; // qualquer coisa menos espaços;;
	
	  
	  private static final String CANDIDATO_PATTERN_STRING =
			  "(" +															
				"(" + CANDIDATO_INSCRICAO + ")" +						// $1 Número de inscrição
				WHITESPACES +
				"(" + CANDIDATO_NOME + ")" +							// $2 Nome do candidato
				WHITESPACES  +									
				"(" + CANDIDATO_IS_COTISTA + ")" +						// $3 Se candidato é cotista
				WHITESPACES +														
				"(" + CANDIDATO_NOTA + ")" +							// $4 Nota (Conhecimentos Gerais)
				WHITESPACES +										
				"(" + CANDIDATO_TOTAL_PARCIAL + ")" +						// $5 Nota Total P1
				WHITESPACES +
				"(" + CANDIDATO_NOTA + ")" +							// $6 Nota (Redação)
				WHITESPACES + 
				"(" + CANDIDATO_NOTA + ")" +							// $7 Nota (Português)
				WHITESPACES + 
				"(" + CANDIDATO_NOTA + ")" +							// $8 Nota (Lingua Estrangeira)
				WHITESPACES + 
				"(" + CANDIDATO_TOTAL_PARCIAL + ")" +						// $9 Nota Total P2
				WHITESPACES +
				"(" + CANDIDATO_NOTA + ")" +							// $10 Nota (Especifica 1)
				WHITESPACES + 
				"(" + CANDIDATO_NOTA + ")" +							// $10 Nota (Especifica 2)
				WHITESPACES + 	
				"(" + CANDIDATO_TOTAL_PARCIAL + ")" +						// $10 Nota Total P3
				WHITESPACES +
				"(" + CANDIDATO_ESCORE_FINAL + ")" +					// $10 Nota (Escore Final)
				WHITESPACES +
				"(" + CANDIDATO_CLASSIFICACAO + ")" +					// $11 Classificação (no curso)
				WHITESPACES +
				"(" + CANDIDATO_SITUACAO + ")" + 						// $12 Situação do Candidato
			  ")";
	  	  
	  
//	  15482-4  ALANA CAROLINA GOMES               SIM     59,0   59,0    90 45,0  6,0I 141,0   29,0  35,0  64,0   264,0   43 AP-COTAS
//	  36538-3  ALEX YUTAKA SARKHEIL               NÃO     36,5   36,5    NA 31,5  0,0I   --    30,0  14,5  44,5     --    -- RP      
	  
	  public static final Pattern CANDIDATO = Pattern.compile(CANDIDATO_PATTERN_STRING);
	  public static final int CANDIDATO_GROUP_ALL = 1;
	  public static final int CANDIDATO_GROUP_INSCRICAO = 2;
	  public static final int CANDIDATO_GROUP_NOME = 3;
	  public static final int CANDIDATO_GROUP_COTAS = 4;
	  public static final int CANDIDATO_GROUP_CONH_GERAIS = 5;
	  public static final int CANDIDATO_GROUP_TOTAL_P1 = 6;
	  public static final int CANDIDATO_GROUP_RED = 7;
	  public static final int CANDIDATO_GROUP_PORT = 8;
	  public static final int CANDIDATO_GROUP_LE = 9;
	  public static final int CANDIDATO_GROUP_TOTAL_P2 = 10;
	  public static final int CANDIDATO_GROUP_ESPECIFICA_1 = 11;
	  public static final int CANDIDATO_GROUP_ESPECIFICA_2 = 12;
	  public static final int CANDIDATO_GROUP_TOTAL_P3 = 13;
	  public static final int CANDIDATO_GROUP_ESCORE_FINAL = 14;
	  public static final int CANDIDATO_GROUP_CLASSIFICACAO = 15;
	  public static final int CANDIDATO_GROUP_SITUACAO = 16;
	  
	  
	  
	  
	  
	  
	  
	  
}
