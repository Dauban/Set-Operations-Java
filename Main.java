//Assignment:4
//Author:Or Adar, ID:305468506
package set;

public class Main {
    public static void main(String[] args) {
        SimpleSet<Integer> a= new SimpleSet<>(5);
        a.add(1); a.add(2); a.add(3); a.add(4);a.add(6);
        a.add(4);a.remove(6);
        SimpleSet<Integer> b= new SimpleSet<>(5);
        b.add(3); b.add(4); b.add(5); b.add(6);
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("union(a,b): "+ SetUtils.union(a,b));
        System.out.println("intersection(a,b): "+ SetUtils.intersection(a,b));
        System.out.println("difference(a,b): "+ SetUtils.difference(a,b));
        System.out.println("difference(b,a): "+ SetUtils.difference(b,a));
        System.out.println("symmetricDifference(a,b): "+ SetUtils.symmetricDifference(a,b));
    }
}