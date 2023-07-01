package br.com.cotiinformatica.dtos;

import java.time.Instant;

import lombok.Data;

@Data
public class CriarContaResponseDto {
	
	
	private String mensagem;
	private Integer idUsuario;
	private String nome;
	private String email;
	private String senha;
	private Instant dataHoraCriacao;

}
