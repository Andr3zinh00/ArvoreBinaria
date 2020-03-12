/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

import arvore.Interfaces.Position;

/**
 *
 * @author 20181080080032
 * @param <E>
 */
public class Nodo<E> implements Position<E> {

    private E element;
    private Nodo<E> parent;
    private Nodo<E> leftChild;
    private Nodo<E> rightChild;

    public Nodo(E element, Nodo<E> parent, Nodo<E> left, Nodo<E> right) {
        this.element = element;
        this.parent = parent;
        this.leftChild = left;
        this.rightChild = right;
    }

    Nodo(E element) {
        this.element=element;
    }

    @Override
    public Position<E> getLeft() {
        return this.leftChild;
    }

    @Override
    public Position<E> getRight() {
        return this.rightChild;
    }

    @Override
    public Position<E> getParent() {
        return this.parent;
    }

    @Override
    public void setLeft(Position<E> v) {
        this.leftChild = (Nodo) v;
    }

    @Override
    public void setRight(Position<E> v) {
        this.rightChild = (Nodo) v;
    }

    @Override
    public void setParent(Position<E> v) {
        this.parent = (Nodo) v;
    }

    @Override
    public E getElement() {
        return this.element;
    }

    @Override
    public void setElement(E element) {
        this.element = element;
    }

}
