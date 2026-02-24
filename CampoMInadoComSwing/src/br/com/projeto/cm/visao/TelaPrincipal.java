package br.com.projeto.cm.visao;

import br.com.projeto.cm.modelo.Tabuleiro;

import javax.swing.*;

public class TelaPrincipal extends JFrame {
    public TelaPrincipal(){
        Tabuleiro tabuleiro = new Tabuleiro(16, 30 , 50); // definindo o tabuleiro

        add(new PainelTabuleiro(tabuleiro));

        setTitle("Campo Minado");// Titulo
        setSize(690, 438); // Tamanho
        setLocationRelativeTo(null); // Local que ele abrira
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Assim que fechar ele, o sistema para
        setVisible(true);// Mostrar ele
    }
    public static void main(String[] args) {
        new TelaPrincipal();

    }
}
