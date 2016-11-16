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
        ArrayList<Cidade> listaCidades = new ArrayList<>();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Users\\Guilherme\\Documents\\NetBeansProjects\\Caixeiro-viajante\\caxeiro.txt"));
            while (br.ready()) {
                Cidade c = new Cidade();
                String linha = br.readLine();
                c.setCidade(Integer.parseInt(linha.split("\\ ")[0]));
                c.setX(Double.valueOf(linha.split("\\ ")[1]));
                c.setY(Double.valueOf(linha.split("\\ ")[2]));
                listaCidades.add(c);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for (Cidade cidade : listaCidades) {
            System.out.println();
        }

    }

}
