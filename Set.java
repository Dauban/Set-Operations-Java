//Author:Or Adar
package set;

/**
 * Interface of set, includes functions such as remove an element, add, a test to check if element exists
 * as well as set size or is the set empty
 * all functions are empty since we're just setting an interface
 * the interface gets a set of type <E></E> which can be any type of class
 * @param <E>
 */
public interface Set <E>{
    void add(E element);
    boolean remove(E element);
    boolean contains(E element);
    int size();
    boolean isEmpty();
}
