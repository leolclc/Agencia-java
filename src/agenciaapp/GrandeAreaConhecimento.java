/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaapp;

import java.util.ArrayList;

/**
 *
 * @author 119210676
 */
public class GrandeAreaConhecimento {

    private int codigo;
    private String nome;
    private ArrayList<AreaConhecimento> listaArea;

    public GrandeAreaConhecimento(int codigo, String nome, ArrayList listaArea) {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<AreaConhecimento> getListaArea() {
        return listaArea;
    }

    public void setListaArea(ArrayList<AreaConhecimento> listaArea) {
        this.listaArea = listaArea;
    }

    public String toString() {
        String s = "";
        for (AreaConhecimento area : listaArea) {
            s += "-" + area + "\n";
        }
        return "Grande Área:\n" + "[" + this.codigo + "]" + this.nome + "\n" + s;
    }
}
