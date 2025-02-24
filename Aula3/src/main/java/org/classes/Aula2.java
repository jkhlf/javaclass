/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.classes;

/**
 *
 * @author lab56
 */
public class Aula2 {

    public static void main(String[] args) {
        Aluno a = new Aluno("Luiza", "04382943232",Curso.SI);
        a.showInformation();

        Produto p = new Produto("Monster", 16, Promotion.BF);
        p.showInformation();
    }
}
