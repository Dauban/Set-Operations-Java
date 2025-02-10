// Author: Or Adar
package set;

/**
 * The Main class demonstrates the functionality of the SimpleSet and SetUtils classes.
 * It creates two sets, performs various set operations (union, intersection, difference, symmetric difference),
 * and prints the results to the console.
 */
public class Main {
    public static void main(String[] args) {
        // Create the first set with a capacity of 5 and add elements
        SimpleSet<Integer> a = new SimpleSet<>(5);
        a.add(1); 
        a.add(2); 
        a.add(3); 
        a.add(4);
        a.add(6);
        a.add(4); // Duplicate entry, should not be added
        a.remove(6); // Remove element 6

        // Create the second set with a capacity of 5 and add elements
        SimpleSet<Integer> b = new SimpleSet<>(5);
        b.add(3); 
        b.add(4); 
        b.add(5); 
        b.add(6);

        // Print the initial sets
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Perform and print set operations
        System.out.println("union(a,b): " + SetUtils.union(a, b)); // Combine both sets
        System.out.println("intersection(a,b): " + SetUtils.intersection(a, b)); // Common elements
        System.out.println("difference(a,b): " + SetUtils.difference(a, b)); // Elements in a but not in b
        System.out.println("difference(b,a): " + SetUtils.difference(b, a)); // Elements in b but not in a
        System.out.println("symmetricDifference(a,b): " + SetUtils.symmetricDifference(a, b)); // Elements in either set but not both
    }
}

