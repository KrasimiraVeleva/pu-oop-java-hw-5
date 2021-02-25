package game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameTile extends JFrame {

    public static final int TILE_SIZE = 10;
    private Color color;
    private int row;
    private int col;

    public GameTile(int row, int col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    void render(Graphics g) {
        for (int x = 0; x < 640; x++) {
            for (int y = 0; y < 640; y++) {
                boardGrid(g);
                BurnedPixel(g);
                AboutToBurnedPixel(g);
                SturdyPixel(g);
            }
        }
    }

    void boardGrid(Graphics g) {
        g.setColor(Color.BLACK);
        for (int i = 0; i <= 640; i += 10) {
            for (int j = 50; j <= 640; j += 10) {
                g.drawRect(i, j, 100, 100);
            }
        }
    }
    public int randomPixels() {
        Random random = new Random();
        int randPixels = random.nextInt(8);
        while(randPixels == 2) {
            randPixels = random.nextInt(8);
        }
        return randPixels;
    }

    public void BurnedPixel(Graphics g) {
        g.setColor(Color.RED);
    }

    public void AboutToBurnedPixel(Graphics g) {
        g.setColor(Color.GREEN);
    }
    public void SturdyPixel(Graphics g) {
        g.setColor(Color.BLUE);


    }
}
