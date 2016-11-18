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
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Cidade {

    int cidade;
    double x, y, distancia;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

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

    public LinkedList<Cidade> lerArquivo() {
        LinkedList<Cidade> listaCidades = new LinkedList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Users\\Guilherme\\Documents\\NetBeansProjects\\Caixeiro-viajante\\caixeiro.txt"));
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

    public void calcularDistancia(List<Cidade> lista) {
        LinkedList<Cidade> distancias = new LinkedList<>();
        double dist;
        int x = 0;
        int i = 0;
        boolean aux1 = true;

        while (aux1) {
            boolean aux2 = true;
            i = 0;
            while (aux2) {
                double a = lista.get(i).getX() - lista.get(x).getX();
                double b = lista.get(i).getY() - lista.get(x).getY();
                dist = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

                Cidade c = new Cidade();
                c.setCidade(x);
                c.setX(x);
                c.setY(i);
                c.setDistancia(dist);
                distancias.add(c);
                System.out.println("Distancia cidade:" + x + "<-->" + i + "  |> " + dist);
                int isoma = i + 1;
                i++;
                if (lista.size() == i) {
                    System.out.println("variavel x:" + x);
                    aux2 = false;
                }
            }
            x++;
            if (lista.size() == x) {
                aux1 = false;
            }
        }

        System.out.println(distancias);

    }
}
