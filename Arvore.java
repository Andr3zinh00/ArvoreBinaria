/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

import arvore.Interfaces.Position;
import arvore.Interfaces.Tree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * @author andre
 */
public class Arvore implements Tree {

    private Nodo root;
    private int size = 0;

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Iterable positions() {
        List<Position> list = new ArrayList<>();

        if (!isEmpty()) {
            emOrdem(root(), list);
        }

        return list;
    }

    private void emOrdem(Position root, List<Position> list) {
        if (root.getLeft() != null) {
            emOrdem(root.getLeft(), list);
        }

        list.add(root);

        if (root.getRight() != null) {
            emOrdem(root.getRight(), list);
        }

    }

    @Override
    public Object replace(Position v, Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Position root() {
        return this.root;
    }

    @Override
    public Position parent(Position v) {
        Nodo node = (Nodo) v;
        return node.getParent();
    }

    @Override
    public Iterable children(Position v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isInternal(Position v) {
        int cont = 0;
        Nodo no = (Nodo) v;
        if (no.getLeft() != null) {
            cont++;
        }
        if (no.getRight() != null) {
            cont++;
        }
        return cont > 0;
    }

    @Override
    public boolean isExternal(Position v) {
        int cont = 0;
        Nodo no = (Nodo) v;
        if (no.getLeft() != null) {
            cont++;
        }
        if (no.getRight() != null) {
            cont++;
        }
        return cont == 0;
    }

    @Override
    public boolean isRoot(Position v) {
        return v == root();
    }

    @Override
    public void addRoot(Object e) {
        if (!isEmpty()) {
            throw new IllegalStateException("A arvore já contém uma raíz!");
        }
        this.root = new Nodo(e, null, null, null);
        size++;
    }

    @Override
    public void insertLeft(Position v, Object e) {
        Nodo parent = (Nodo) v;

        if (parent.getLeft() != null) {
            throw new IllegalArgumentException("Ja tem filho na esquerda");
        }
        Nodo n = (Nodo) e;
        Nodo child = new Nodo(n.getElement(), parent, null, null);
        parent.setLeft(child);
        size++;
    }

    @Override
    public void insertRight(Position v, Object e) {
        Nodo parent = (Nodo) v;

        if (parent.getRight() != null) {
            throw new IllegalArgumentException("Ja tem filho na direita");
        }
        Nodo n = (Nodo) e;
        Nodo child = new Nodo(n.getElement(), parent, null, null);
        parent.setRight(child);
        size++;
    }

    @Override
    public void remove(Position v) {
        Nodo no = (Nodo) v;
        if (no.getLeft() != null || no.getRight() != null) {
            throw new IllegalArgumentException("V possui filhos");
        }
        if (parent(no).getLeft() == no) {
            parent(no).setLeft(null);
        }
        parent(no).setRight(null);
        no.setParent(null);
    }

    @Override
    public void attach(Position v, Arvore t1, Arvore t2) {
    }

    @Override
    public Position sibling(Position v) {
        Position parent = parent(v);
        Position no = v;
        if (parent == null) {
            return null;
        }

        if (no == parent.getLeft()) {
            return parent.getRight();
        } else {
            return parent.getLeft();
        }
    }

    @Override
    public String toString() {
        List<Position> list = (List<Position>) positions();
        String retorno = "( ";
        int i = 0;
        for (Iterator<Position> it = list.iterator(); it.hasNext();) {
            Position p = it.next();
            retorno += p.getElement() + " ";
            i++;
        }
        retorno += ")";
        return retorno;
    }

}
