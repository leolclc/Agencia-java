/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaapp;

/**
 *
 * @author 119210676
 */
public class Projeto {

    private int codigo, duracao;
    private String titulo, instituicao;
    private double orcamento;
    private AreaConhecimento ac;

    public Projeto(int codigo, int duracao, String titulo, String instituicao, double orcamento, AreaConhecimento ac) {
        this.codigo = codigo;
        this.duracao = duracao;
        this.titulo = titulo;
        this.instituicao = instituicao;
        this.orcamento = orcamento;
        this.ac = ac;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;

    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public AreaConhecimento getAc() {
        return ac;
    }

    public void setAc(AreaConhecimento ac) {
        this.ac = ac;
    }
public String toString(){
return "--------PROJETO-------\n"
      +"Código: " +this.codigo+ "\n"
        +"Título: " +this.titulo+ "\n"
        +"Instituição: " +this.instituicao+ "\n"
        +"Duração: " +this.duracao+ "\n"
        +"Orcamento: " +this.orcamento+ "\n"
        +"Área Conhecimento: " +this.ac.getNome()+ "\n"
        +"--------------------------------";
}
}
