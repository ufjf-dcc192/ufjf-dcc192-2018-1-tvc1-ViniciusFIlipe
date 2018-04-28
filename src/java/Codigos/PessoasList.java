/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public class PessoasList {

    private static List<Pessoa> pessoas;

    public static List<Pessoa> getInstance() {
        if (pessoas == null) {
            pessoas = new ArrayList<>();
            pessoas.add(new Pessoa("Vinicius", "32998855", 2, 0, false));
            pessoas.add(new Pessoa("Victor", "38445555", 0, 2, true));
            pessoas.add(new Pessoa("Luiz", "32998855", 4, 0, false));
            pessoas.add(new Pessoa("Felipe", "38445555", 0, 4, true));

        }

        return pessoas;
    }
}
