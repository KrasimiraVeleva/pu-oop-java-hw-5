package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameBoard extends JFrame implements MouseListener {

    public static final int TILE_SIDE_COUNT = 64;
    private GameTile[][] tiles = new GameTile[64][54];
    private GameTile chosenTile;

    public GameBoard() {
        this.setSize(660, 660);
        this.setVisible(true);
        this.addMouseListener(this);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        for(int row = 0; row < 64; row++) {
            for(int col = 0; col < 64; col++) {
                GameTile tiles = new GameTile(row, col, Color.BLACK);
                tiles.boardGrid(g);
            }

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
