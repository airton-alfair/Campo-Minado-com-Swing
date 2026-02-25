package br.com.projeto.cm.visao;

import br.com.projeto.cm.modelo.Campo;
import br.com.projeto.cm.modelo.CampoEvento;
import br.com.projeto.cm.modelo.CampoObservador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BotaoCampo extends JButton implements CampoObservador, MouseListener{

    private final Color BG_PADRAO = new Color(184,184,184);//cinza
    private final Color BG_MARCAR = new Color(8,179,247);
    private final Color BG_EXPLOSAO = new Color(189,66,68);
    private final Color TEXTO_VERDE = new Color(0,100,0);//verde

    private Campo campo;

    public BotaoCampo(Campo campo){
        this.campo = campo;
        setBackground(BG_PADRAO);
        setOpaque(true);// aplicar ao botao tod
        setBorder(BorderFactory.createBevelBorder(0));

        addMouseListener(this);
        campo.registrarObservador(this); // chamar o metodo

    }

    @Override
    public void eventoOcorreu(Campo campo, CampoEvento evento) {
        switch(evento){
            case ABRIR:
                aplicarEstiloAbrir();
                break;
            case MARCAR:
                aplicarEstiloMarcar();
                break;
            case EXPLODIR:
                aplicarEstiloExplodir();
                break;
            default:
                aplicarEstiloPadrao();
                // O metodo REINICIAR ira cair no aplicar padrao,
                // ñ precisando criar uma case especifica para ele
        }
        //Ñ precisaria usar este metodo, mas para garantir que reinicie
        SwingUtilities.invokeLater(() -> {
            repaint();
            validate();
        });

    }

    private void aplicarEstiloPadrao() {
        setBackground(BG_PADRAO);
        setBorder(BorderFactory.createBevelBorder(0));
        setText(""); //Limpar texto
    }

    private void aplicarEstiloExplodir() {
        setBackground(BG_EXPLOSAO);
        setForeground(Color.white); // Cor do X
        setText("X");
    }
    
    private void aplicarEstiloMarcar() {
        setBackground(BG_MARCAR);
        setForeground(Color.BLACK); // Cor do M
        setText("M");
    }
    
    private void aplicarEstiloAbrir() {
        setBorder(BorderFactory.createLineBorder(Color.GRAY));

        if(campo.isMinado()){
            setBackground(BG_EXPLOSAO);
            return;
        }

        setBackground(BG_PADRAO);

        switch (campo.minasNaVizinhanca()){
            case 1:
                setForeground(TEXTO_VERDE);
                break;
            case 2:
                setForeground(Color.BLUE);
                break;
            case 3:
                setForeground(Color.YELLOW);
                break;
            case 4:
            case 5:
            case 6:
                setForeground(Color.RED);
                break;
            default:
                setForeground(Color.PINK);
        }

        String valor = !campo.vizinhancaSegura() ?
                campo.minasNaVizinhanca() + "" : "" ;

        setText(valor); // mostra quantos vizinhos tem proxiimo ao campo
    }

    //Inteface dos eventos do mouse
    public void mousePressed(MouseEvent e) {
        if(e.getButton() == 1){
            campo.abrir();
        }else{
            campo.alternarMarcacao();
        }
    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}

