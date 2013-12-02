package com.blocojava.aula1.domain;

public enum VariacaoConta
{
  VARIACAO_CONTA_CORRENTE("00"),
  VARIACAO_POUPANCA("01"),
  VARIACAO_INVESTIMENTO("91");
  
  private final String variacao;
  
  private VariacaoConta(String variacao) {
    this.variacao = variacao;
  }
  
  public String getVariacao() {
    return this.variacao;
  }
}