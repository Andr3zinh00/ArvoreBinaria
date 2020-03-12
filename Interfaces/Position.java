package arvore.Interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public interface Position<E> {
    /** Retorna o elemento armazenado nessa posiÃ§Ã£o **/
    E getElement();
    void setElement(E element);
    Position<E> getLeft();
    Position<E> getRight();
    Position<E> getParent();
    void setLeft(Position<E> v);
    void setRight(Position<E> v);
    void setParent(Position<E> v);
}