package com.hamma.main;


import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class ApplicationForkjoin {
    public static void main(String[] args) {
        int[] tab = IntStream.range(0, 51).toArray();
        Calcul cl = new Calcul(tab, 1, 50);
        ForkJoinPool fjp = new ForkJoinPool();
        Integer valeur = fjp.invoke(cl);
        System.out.println("----- >" + valeur);
    }
}
