package br.com.cotiinformatica.dtos;

import java.time.Instant;

import lombok.Data;

@Data
public class RecuperarSenhaResponseDto {

	private String mensagem;
	private Integer idUsuario;
	private String nome;
	private String email;
	private String senha;
	private Instant dataHoraRecuperacaoDeSenha;

}
