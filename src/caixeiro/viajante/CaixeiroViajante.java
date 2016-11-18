/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixeiro.viajante;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Guilherme
 */
public class CaixeiroViajante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<Cidade> lista = new LinkedList<>();
        Cidade c = new Cidade();
        lista = c.lerArquivo();
        c.calcularDistancia(lista);
//        for (Cidade cidade : lista) {
//            System.out.println(cidade.getX());
//        }
    }

}
