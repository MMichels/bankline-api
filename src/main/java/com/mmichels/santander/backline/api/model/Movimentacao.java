package com.mmichels.santander.backline.api.model;

import java.time.LocalDateTime;

public class Movimentacao {
	private Integer Id;
	private LocalDateTime dataHora;
	private String descricao;
	private Double valor;
	private MovimentacaoTipo tipo;
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public MovimentacaoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}	
	
}
