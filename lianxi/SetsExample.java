package lianxi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SetsExample {
	 public static void main(String args [])
	    {
	        System.out.print("0. The arguments in the command line are:\n   ");
	        for (int i = 0; i < args.length; i++)
		    System.out.print(args[i] + " ");
	        System.out.println("\n");
	        // The following line does the following:
		// 
		//    (1) Creates a collection of strings named c.
	        //    (2) It choses to implement it as a "set".
	        //    (3) This set is represented internally as Tree.
	        //    (4) This set is initially empty.
	        //        (Empty is not the same thing as null.)
		Collection<String> c = new TreeSet<String> ();
	        // lhs is abstract     rhs is concrete
	        // lhs can be concrete rhs cannot be abstract
	        // Add the arguments (passed in the command line)
	        // to the collection s, one by one. 
		for (int i = 0; i < args.length; i++)
		    c.add(args[i]);
		// For each string s in the collection c, print s.
		System.out.print("1. Using TreeSet:\n   ");
	        for (String s : c)
	            System.out.print(s + " ");
	        System.out.println("\n");
		// Notice, when you run this, that duplicates have been eliminated.
		// Why is that? Because sets, by definition, don't have duplicates.
	        // If we want duplicates, we can use different implementations
	        // of collections. For example:
	        
		Collection<String> d = new ArrayList<String> ();
		for (int i = 0; i < args.length; i++)
		    d.add(args[i]);
		System.out.print("2. Using ArrayList:\n   ");
	        for (String s : d)
	            System.out.print(s + " ");
	        System.out.println("\n");
	        // But this is not the only possible option:
		Collection<String> e = new LinkedList<String> ();
		for (int i = 0; i < args.length; i++)
		    e.add(args[i]);
		System.out.print("3. Using LinkedList:\n   ");
	        for (String s : e)
	            System.out.print(s + " ");
	        System.out.println("\n");
	        // And here is another way of working with sets
		Collection<String> f = new HashSet<String> ();
		for (int i = 0; i < args.length; i++)
		    f.add(args[i]);
		System.out.print("4. Using HashSet:\n   ");
	        for (String s : f)
	            System.out.print(s + " ");
	        System.out.println("\n");
	        
	        // And here is another way of working with sets
		Collection<String> g = new LinkedHashSet<String> ();
		for (int i = 0; i < args.length; i++)
		    g.add(args[i]);
		System.out.print("5. Using LinkedHashSet:\n   ");
	        for (String s : g)
	            System.out.print(s + " ");
	        System.out.println("\n");
	 	// Which implementation do we choose, then?
	 	// Take a data structures course, and learn about:
	 	//
	 	//   (1) Properties they have (repetition, order, etc.).
	 	//   (2) Run-time behaviour they have.
	        // Learning exercise: run, from the command line:
	        //
	        //  $ java SetsExample banana orange lemon apple grape lemon banana 
	        //
	        // Study the lack or presence of order and repetition you
	        // observe in the output.
	        // Now we use iterators:
		Collection<String> h = new TreeSet<String> ();
	        // Add the arguments (passed in the command line)
	        // to the collection s, one by one. 
		for (String s : args) // Simplified for-loop syntax
		    h.add(s);
		// For each string s in the collection c, print s.
		System.out.print("6. Using TreeSet with iterators:\n   ");
	        for (Iterator it = h.iterator(); it.hasNext();)
	            System.out.print(it.next() + " ");
	        System.out.println("\n");
	    }
}
