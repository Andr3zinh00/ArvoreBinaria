/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

import java.util.List;

/**
 * @author andre
 */
public class Main {

    public static void main(String[] args) {
        Arvore t = new Arvore();
        t.addRoot("Luziânia");
        
        //LADO ESQUERDO
        t.insertLeft(t.getRoot(), new Nodo("dados"));
        t.insertRight(t.getRoot().getLeft(), new Nodo("Campus"));//
        t.insertLeft(t.getRoot().getLeft(), new Nodo("de"));//
        t.insertLeft(t.getRoot().getLeft().getLeft(), new Nodo("Estrutura"));
        
        //LADO DIREITO
        t.insertRight(t.getRoot(), new Nodo("Sistemas"));
        t.insertLeft(t.getRoot().getRight(), new Nodo("2019"));
        t.insertRight(t.getRoot().getRight(), new Nodo("Informação"));
        t.insertLeft(t.getRoot().getRight().getRight(), new Nodo("de"));
        System.out.println(t);
        t.remove(t.getRoot().getRight().getRight().getLeft());
        t.remove(t.getRoot().getLeft().getLeft().getLeft());
        System.out.println(t);
//(Luziânia(dados(de(Estrutura()) campus()) sistemas(2019()informação(de())))
    }
}
