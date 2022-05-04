package com.hamma.main;

import java.util.concurrent.RecursiveTask;

public class Calcul extends RecursiveTask<Integer> {
    private int[] tab;
    private int debut;
    private int fin;

    public Calcul(int[] tab, int debut, int fin) {
        this.tab = tab;
        this.debut = debut;
        this.fin = fin;
    }


    @Override
    protected Integer compute() {
        Integer resultat = 0;
        int milieu = (fin - debut) / 2;
        if (milieu > 10) {
            Calcul p1 = new Calcul(tab, debut, debut + milieu - 1);
            p1.fork();
            Calcul p2 = new Calcul(tab, debut + milieu +1, fin);
            resultat=p2.compute()+p1.join();
        } else {
            for (int i = debut; i <= fin; i++) {
                resultat += tab[i];
            }
        }
        return resultat;
    }
}
