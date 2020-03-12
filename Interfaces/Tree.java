/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore.Interfaces;

import arvore.Arvore;

/**
 *
 * @author Lucas
 * @param <E>
 */
public interface Tree<E> {

    /**
     * Retorna a quantidade de nodos da Ã¡rvore
     *
     * @return *
     */
    public int size();

    /**
     * Retorna se a Ã¡rvore estÃ¡ vazia
     *
     * @return *
     */
    public boolean isEmpty();

    /**
     * Retorna um iterador sobre os elementos armazenados na Ã¡rvore
     *
     * @return *
     */
    public Iterable<Position<E>> positions();

    /**
     * Substitui o elemento armazenado em um dado nodo
     *
     * @param v
     * @param e
     * @return *
     */
    public E replace(Position<E> v, E e);

    /**
     * throws InvalidPositionException;*
     */
    /**
     * Retorna a raÃ­z de uma Ã¡rvore
     *
     * @return *
     */
    public Position<E> root();

    /**
     * throws EmptyTreeException;*
     */
    /**
     * Retorna o pai de um dado nodo
     *
     * @param v
     * @return *
     */
    public Position<E> parent(Position<E> v);

    /**
     * throws InvalidPositionException, BoundaryViolationException;*
     */
    /**
     * Retorna os filhos de um dado nodo
     *
     * @param v
     * @return
     *
     */
    public Iterable<Position<E>> children(Position<E> v);

    /**
     * throws InvalidPositionException;*
     */
    /**
     * Retorna se um dado nodo Ã© interno
     *
     * @param v
     * @return
     *
     */
    public boolean isInternal(Position<E> v);

    /**
     * Retorna se um dado nodo Ã© externo
     *
     * @param v
     * @return *
     */
    public boolean isExternal(Position<E> v);

    /**
     * Retorna se um dado nodo Ã© a raÃ­z da Ã¡rvore
     *
     * @param v
     * @return *
     */
    public boolean isRoot(Position<E> v);

    /**
     * Insere um Elemento na arvore
     *
     * @param e
     *
     */
    void addRoot(E e);

    /**
     * Insere um Elemento a esquerda em uma determinada posição v
     *
     * @param e
     * @param v
     *
     */
    void insertLeft(Position<E> v, E e);

    /**
     * Insere um Elemento a direita em uma determinada posição v
     *
     * @param e
     * @param v
     *
     */
    void insertRight(Position<E> v, E e);

    /**
     * Remove um elemento da arvore
     *
     * @param v
     */
    void remove(Position<E> v);

    /**
     * Conecta os elementos de uma arvore
     *
     * @param v
     * @param t1
     * @param t2
     */
    void attach(Position<E> v, Arvore t1, Arvore t2);

    /**
     * Retorna os irmãos de v
     *
     * @param v
     * @return 
     */
    public Position<E> sibling(Position<E> v);
}
