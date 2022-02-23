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
public class AreaConhecimento {

    private int codigo, codigoGAC;
    private String nome;

    public AreaConhecimento(int codigo, String nome, int codigGAC) {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoGAC() {
        return codigoGAC;
    }

    public void setCodigoGAC(int codigoGAC) {
        this.codigoGAC = codigoGAC;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "[" + this.codigo + "]" + this.nome;

    }
}
