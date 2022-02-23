/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 119210676
 */
public class Agencia {

    private ArrayList<Projeto> listaProjetos;
    private ArrayList<GrandeAreaConhecimento> listaGac;

    public Agencia() {
        this.listaProjetos = new ArrayList();
        this.listaGac = new ArrayList();
    }

    public ArrayList<Projeto> getListaProjetos() {
        return listaProjetos;
    }

    public void setListaProjetos(ArrayList<Projeto> listaProjetos) {
        this.listaProjetos = listaProjetos;
    }

    public ArrayList<GrandeAreaConhecimento> getListaGac() {
        return listaGac;
    }

    public void setListaGac(ArrayList<GrandeAreaConhecimento> listaGac) {
        this.listaGac = listaGac;
    }

    public void inserirProjeto(Projeto p) {
        this.listaProjetos.add(p);
    }

    public void listarProjeto() {
        String s = "";
        for (Projeto p : listaProjetos) {
            s += p.toString();
        }
        JOptionPane.showMessageDialog(null, s);

    }

    public void listaProjetoID(int codigo) {
        JOptionPane.showMessageDialog(null, this.buscarCodigo(codigo));
    }

    public Projeto buscarCodigo(int codigo) {
        for (Projeto p : listaProjetos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    public boolean excluirProjeto(int codigo) {
        Projeto p = buscarCodigo(codigo);
        if (p != null) {
            listaProjetos.remove(p);
            return true;
        } else {
            return false;
        }
    }

    public void atualizarProjeto(Projeto p) {
        if (excluirProjeto(p.getCodigo())) {
            inserirProjeto(p);
        }
    }

    public int ultimoCodigoProjeto() {
        return listaProjetos.size() > 0 ? listaProjetos.get(listaProjetos.size() - 1).getCodigo() : 0;

    }

    public int ultimoCodigoGrandeArea() {
        return listaGac.size() > 0 ? listaGac.get(listaGac.size() - 1).getCodigo() : 0;

    }

    public void cadastrarGrandeArea() {
        ArrayList<AreaConhecimento> ac = new ArrayList();
        int codigo = ultimoCodigoGrandeArea() != 0 ? ultimoCodigoGrandeArea() + 1 : 1;

        ac.add(new AreaConhecimento(1, "Computação", codigo));
        ac.add(new AreaConhecimento(2, "Matemática", codigo));
        ac.add(new AreaConhecimento(3, "Física", codigo));
        GrandeAreaConhecimento ga = new GrandeAreaConhecimento(codigo, "Ciências Exatas", ac);
        listaGac.add(ga);
    }
}
