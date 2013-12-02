package com.blocojava.aula1.domain;

public abstract class Conta
{

   protected String numero;
   protected VariacaoConta variacao;
   
   /**
    * @return the numero
    */
   public String getNumero()
   {
      return numero;
   }

   /**
    * @param numero the numero to set
    */
   public void setNumero(String numero)
   {
      this.numero = numero;
   }

   /**
    * @return the variacao
    */
   public VariacaoConta getVariacao()
   {
      return variacao;
   }

   /**
    * @param variacao the variacao to set
    */
   public void setVariacao(VariacaoConta variacao)
   {
      this.variacao = variacao;
   }
}