//Author:Or Adar
package set;

/**
 * Utilities for set interface,includes union of sets, intersection of sets, difference and symmetric difference
 */
public class SetUtils {
    public static <E> SimpleSet<E> union(SimpleSet<E> A, SimpleSet<E> B){
        SimpleSet<E> C=new SimpleSet<>(A.size()+B.size());
        for(int i=0;i<A.size();i++){
            C.add(A.getElements()[i]);
        }
        for (int i=0;i<B.size();i++)
            C.add(B.getElements()[i]);
        return C;
    }

    /**
     * method gets 2 sets of the same Any type, set A and B
     * creates a new set C of the same type as A and B,the capacity is the actual size of A and B
     * it then runs 2 for loops to add all the elements to C array(set)
     * @param A
     * @param B
     * @return
     * @param <E>
     */
    public static <E> SimpleSet<E> intersection(SimpleSet<E> A,SimpleSet<E> B){
        SimpleSet<E> C=new SimpleSet<>();
        for(int i=0;i<A.size();i++){
            E element=A.getElements()[i];
            if(B.contains(element))
                C.add(element);
        }
        return C;
    }

    /**
     * method that gets 2 sets (arrays) of E (any) type that then creatues a new C set
     * it checks if the A set has any of the B set elements, if it does (both has same ele) it adds that ele to C
     * @param A
     * @param B
     * @return
     * @param <E>
     */
    public static <E> SimpleSet<E> difference(SimpleSet<E> A,SimpleSet<E> B){
        SimpleSet<E> C=new SimpleSet<>();
        for(int i=0;i<A.size();i++){
            E element=A.getElements()[i];
            if(!B.contains(element))
                C.add(element);
        }
        return C;
    }

    /**
     * a method that gets 2 sets A n B, creates a C set that only contains elements that are in A but not in B
     * @param A
     * @param B
     * @return
     * @param <E>
     */
    public static <E> SimpleSet<E> symmetricDifference(SimpleSet<E> A,SimpleSet<E> B){
        SimpleSet<E> U=SetUtils.union(A,B);
        SimpleSet<E> I=SetUtils.intersection(A,B);
        return SetUtils.difference(U,I);
    }
    /**
     * a method that creates a new set that is all the elements that are in A and B but not in both
     */
}
