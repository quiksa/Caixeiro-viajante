/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixeiro.viajante;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Cidade {

    int cidade;
    double x,y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public ArrayList<String> getLinhasArquivo( File file ) throws FileNotFoundException, IOException{
    ArrayList<String> linhas;
        
    try (BufferedReader leitor = new BufferedReader( new FileReader(file) )) {
       linhas = new ArrayList<>();
       String linha = "";
            
       while( (linha = leitor.readLine()) != null ){
          if( linha.length() > 0 )
              linhas.add(linha);
       }
    }
    return linhas;
}

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

}
