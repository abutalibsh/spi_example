package org.example;

import org.algorithm.Algorithm;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {

    private static ServiceLoader<Algorithm> loader = ServiceLoader.load(Algorithm.class);

    public static void main(String[] args) {
        String name = "Ahmad";
        String salutation = "";
        Iterator<Algorithm> iter =loader.iterator();
        System.err.println("Results : " + (loader != null) + " " + (iter!=null));
        while(iter.hasNext()){
            Algorithm alg = iter.next();
            System.err.println("Using algorithm : " + alg.getClass());
            salutation+= alg.decorate(name) + "\n";
        }
        System.out.println("Final results:\n" + salutation);
    }
}
