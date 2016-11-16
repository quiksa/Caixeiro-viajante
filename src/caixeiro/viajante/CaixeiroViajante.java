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

/**
 *
 * @author Guilherme
 */
public class CaixeiroViajante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Cidade> lista = new ArrayList<>();
        Cidade c = new Cidade();
        lista = c.lerArquivo();
        
        for (Cidade cidade : lista) {
            System.out.println();
        }

    }

}
