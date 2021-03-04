package minhacidademelhor.model;

import java.time.LocalDate;
import java.util.List;

public class Solicitacao {
	
	private int id;
	private LocalDate dataAbertura;
	
	private Usuario usuario;
	private LocalDate dataResposta;
	private LocalDate dataPrevistaSolucao;
	private Status status;
	
	public Solicitacao() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getDataResposta() {
		return dataResposta;
	}

	public void setDataResposta(LocalDate dataResposta) {
		this.dataResposta = dataResposta;
	}

	public LocalDate getDataPrevistaSolucao() {
		return dataPrevistaSolucao;
	}

	public void setDataPrevistaSolucao(LocalDate dataPrevistaSolucao) {
		this.dataPrevistaSolucao = dataPrevistaSolucao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	

}
