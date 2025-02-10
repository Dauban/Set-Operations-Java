//Assignment:4
//Author:Or Adar, ID:305468506
package set;

import java.util.Arrays;

/**
 * Simple set class that implements the Set interface of type E (can be anything)
 * has the fields elements which is essentially an array with a size of capacity which is intself another field
 * and lastly the para size which refers to it's actual size
 * we have 1 getter of elements since none of the others currently require setters or getters but if they were needed
 * we would've added them in a blink
 * the constructor recieves capacity,which builds a new array at capacity size,
 * size is set to 0 (number of actual items in the set)
 * there is an additonal default constructer which receives nothing, sets capacity at 5 and size at 0 and creates a new
 * array with capacity as it;s size
 * we have functions such as add, remove,contains, size, is the set empty all of those are detailed below.
 * @param <E>
 */
public class SimpleSet<E> implements Set<E> {
    private E[] elements;
    private int size;
    private int capacity;

    /**
     * 3 paramaters of the function as well as a getter we only need for this exercise
     */
    public E[] getElements() {
        return elements;
    }

    public SimpleSet(int capacity){
        elements=(E[])new Object [capacity];
        size=0;
        this.capacity=capacity;
    }
    public SimpleSet(){
        this.capacity=5;
        size=0;
        elements=(E[])new Object[capacity];
    }

    /**
     * 2 constructors for this class, one recevies capacity the other is default
     * @param element
     */
    @Override
    public void add(E element) {
        if(contains(element))
            return;
        if(size==capacity){
            capacity=capacity+5;
            elements= Arrays.copyOf(elements,capacity);
        }
        elements[size]=element;
        size++;
    }

    /**
     * Add method, checks if the array elements contains the E type(any) element, if it does it doesn't add it
     * also checks if the array is currently at the max size of capacity, i.e if there are 5 elements in cap 5
     * it adds 5 to the max cap then creates a copy of all the elements it has in the array and submits this new
     * larger array with all its data to a new array
     * then if we can safely add an element without deleting or causing an error we add an element to size place
     * which is the last open slot, and add a counter to the size (index if you will)
     * @param element
     * @return
     */
    @Override
    public boolean remove(E element) {
        if(contains(element)){
            for(int i=0;i<size;i++){
               if (elements[i].equals(element))
                   for(int j=i;j<size;j++)
                       elements[j]=elements[j+1];
                   elements[size-1]=null;
                   size--;
                   return true;
            }

        }
        return false;
    }

    /**
     * remove method that scans the elements array using the help of contains method below
     * if the array doesn't contain the element we have nothing to remove and returns false
     * if the element exists we start a new for loop that runs from the index we found that element
     * we move all the other elements to the "left" and the element we wish to remove is then "moved"
     * to the end of the array and we set it to null then reduce the size (not capacity) of the array.
     * @param element
     * @return
     */
    @Override
    public boolean contains(E element) {
        for(int i=0;i< size;i++){
            if(elements[i].equals(element))
                return true;
        }
        return false;
    }

    /**
     * this method checks of an element is contained in the array, runs a loop that uses the equals function
     * if the element is present it returns true, else false
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * method returns the size (actual elements in the array)
     * @return
     */
    @Override
    public boolean isEmpty() {
        if (size==0)
            return true;
        return false;
    }

    /**
     * method checks if size=0, if it does return true, else return false
     * @return
     */
    @Override
    public String toString() {
        E[] elenents2 = (E[]) new Object[size];
        for(int i=0; i < this.size; i++)
        {
            elenents2[i] = this.elements[i];
        }
        return Arrays.toString(elenents2);
    }
    /**
     * tostring that prints the elements.
     */
}
