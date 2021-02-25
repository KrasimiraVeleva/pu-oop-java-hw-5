package game;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {

    public static final int TILE_SIDE_COUNT = 64;
    private GameTile[][] tiles = new GameTile[64][54];
    private GameTile chosenTile;

    public GameBoard() {

        this.setVisible(true);
        this.setSize(660, 660);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * @autor Красимира Велева
     * Метод визуализиращ полетата на игралната дъска
     * @param g Graphics object
     */
    public void paint(Graphics g) {
        super.paint(g);
        for(int row = 0; row < 64; row++) {
            for(int col = 0; col < 64; col++) {
                GameTile tiles = new GameTile(row, col);
                tiles.boardGrid(g);
                tiles.render(g);
                tiles.BurnedPixel(g);
                tiles.AboutToBurnedPixel(g);
                tiles.SturdyPixel(g);

            }
        }
    }
}
