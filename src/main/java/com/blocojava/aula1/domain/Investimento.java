package com.blocojava.aula1.domain;

public class Investimento
{

  private Double value;
  private TipoInvestimento tipo;
  
  public Investimento() {
    variacao = VariacaoConta.VARIACAO_INVESTIMENTO;
  }
    /**
   * @return the tipo
   */
  public TipoInvestimento getTipo()
  {
     return tipo;
  }
    /**
   * @param tipo the tipo to set
   */
  public void setTipo(TipoInvestimento tipo)
  {
     this.tipo = tipo;
  }
    /**
   * @return the value
   */
  public Double getValue()
  {
     return value;
  }
    /**
   * @param value the value to set
   */
  public void setValue(Double value)
  {
     this.value = value;
  }
}