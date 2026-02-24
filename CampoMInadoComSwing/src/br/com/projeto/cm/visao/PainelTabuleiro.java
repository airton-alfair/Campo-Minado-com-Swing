package br.com.projeto.cm.visao;

import br.com.projeto.cm.modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;

public class PainelTabuleiro extends JPanel { // Jpanel Container

    public PainelTabuleiro(Tabuleiro tabuleiro){

        setLayout(new GridLayout(tabuleiro.getLinhas(),  //Grid seria "Grade"
                tabuleiro.getColunas())); //como os componentes serao organizado, metodo do JPanel

        tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c))); //Adicionar os botoes

        tabuleiro.registrarObservador(e -> {
            // TODO mostrar resultado para o usuário!
        });
    }
}
