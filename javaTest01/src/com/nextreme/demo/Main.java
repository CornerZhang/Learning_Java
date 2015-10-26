package com.nextreme.demo;
import com.nextreme.lib.*;

import java.util.*;

public class Main {
    static void testMoreClass() {
        More more = new More();

        if( more instanceof More ) {
            System.out.println("object type is More");
        }

        more.printName();
    }

    public static void testMethodBenchmark(String[] args) {
        int count = Integer.parseInt(args[0]);

        long time = new MethodBenchmark().repeat(count);
        System.out.println(count + " methods in " + time + " nanoseconds");
    }

    public static void testCollections() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("dafasfasf");
        al.add("other");

        System.out.println(al);

        HashSet<String> hs = new HashSet<String>();
        hs.add("fdaa");

        System.out.println(hs);

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("LinkedList has ssdfsaf");
        System.out.println(ll);

        PriorityQueue<String> pq = new PriorityQueue<String>();

        LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
        hm.put("age","34");
        System.out.println(hm);
    }

    public static void main(String[] args) {
        Body mercury;
        Body.nextID = 34;

        Body b = new Body("zhang", null);

        System.out.println("Hello world");

        testMoreClass();
        testMethodBenchmark(args);
        testCollections();;

        int aas = 45;
        Number n = aas;
        Object obj = n;

        Cell<String> strCell = new Cell<String>("Hello");
        Cell<ConsoleVerbose> conCell = new Cell<ConsoleVerbose>(new ConsoleVerbose());
        assert strCell.getNext()==null; // assert

        List<String> l = new ArrayList<String>();
    }
}
