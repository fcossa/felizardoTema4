/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Vector;

/**
 *
 * @author Cossa
 */
public class Exercicio1 {

    static int calculaModa(Vector<Integer> vet) {
        int[] cont = new int[vet.size() + 1];
        int vezes = 0;
        int indice = 0;

        for (int i = 0; i < (vet.size()); i++) {
            for (int j = 0; j < (vet.size()); j++) {
                if (Objects.equals(vet.get(i), vet.get(j))) {
                    cont[i] += 1;
                }
            }
        }
        vezes = cont[0];
        for (int i = 0; i < cont.length; i++) {
            if (cont[i] > vezes) {
                vezes = cont[i];
                indice = i;
            }
        }
        return vet.get(indice);
    }

    static double calculaMedia(Vector<Integer> vet) {
        int soma = 0;
        double media = 0;
        for (int i = 0; i < vet.size(); i++) {
        soma+=vet.get(i);
        }
        media=soma/vet.size();
        return media;
    }
    static int calculaMediana(Vector<Integer> vet){
        int posicao=-1;
        posicao =vet.get(vet.size()/2);
        
        return posicao;
    }

    public static void main(String[] args) {
        Vector<Integer> vet = new Vector<Integer>(3, 1);
        vet.addElement(24);
        vet.addElement(24);
        vet.addElement(7);
        vet.addElement(2);
        vet.addElement(2);

        System.out.println(calculaMediana(vet));

    }

}
