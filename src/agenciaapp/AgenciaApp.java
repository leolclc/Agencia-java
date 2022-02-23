/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaapp;

import agenciaapp.Agencia;
import agenciaapp.AreaConhecimento;
import agenciaapp.Projeto;
import javax.swing.JOptionPane;

/**
 *
 * @author 119210676
 */
public class AgenciaApp {

    static Agencia agencia = new Agencia();

    public static void main(String[] args) {
        executarMenu();
    }

    public static String exibeMenu() {
        String texto = "Escolha a opção desejada: \n "
                + "[1] Inserir um novo projeto \n "
                + "[2] Listar todos os projetos \n "
                + "[3] Listar projeto pelo código \n "
                + "[4] Atualizar projeto \n "
                + "[5] Excluir projeto \n "
                + "[S] Sair \n";
        return JOptionPane.showInputDialog(texto);
    }

    public static void executarMenu() {
        String opcao = "";
        int codigo;
        agencia.cadastrarGrandeArea();
        while (!opcao.equalsIgnoreCase("s")) {
            opcao = exibeMenu();
            switch (opcao) {
                case "1":
                    Projeto p = cadastraProjeto();
                    agencia.inserirProjeto(p);
                    break;
                case "2":
                    agencia.listarProjeto();
                    break;
                case "3":
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o código do projeto"));
                    agencia.listaProjetoID(codigo);
                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "s":
                case "S":
                    JOptionPane.showMessageDialog(null, "Até logo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Digite outra opção: ");
            }
        }
    }

    public static Projeto cadastraProjeto() {
        int codigo, duracao, codac;
        String titulo, instituicao;
        double orcamento;
        AreaConhecimento ac;
        codigo = agencia.ultimoCodigoProjeto() != 0 ? agencia.ultimoCodigoProjeto() + 1 : 1;
        titulo = JOptionPane.showInputDialog("Informe o título");
        instituicao = JOptionPane.showInputDialog("Informe a instuição");
        duracao = Integer.parseInt(JOptionPane.showInputDialog("Informe a duração"));
        orcamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o orçamento"));
        String s = "";
        for (GrandeAreaConhecimento gac : agencia.getListaGac()) {
            s += gac.toString();
        }
        JOptionPane.showMessageDialog(null,s);
        codac = Integer.parseInt(JOptionPane.showInputDialog("Informe o cod ac"));
        ac = new AreaConhecimento(codac, s, codac);
        return new Projeto(codigo, duracao, titulo, instituicao, orcamento, ac);

    }
}
