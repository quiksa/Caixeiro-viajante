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
    double x, y;

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

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Cidade> lerArquivo() {
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
        return listaCidades;
    }
}
