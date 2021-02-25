package pixels;

import game.GameTile;

import java.awt.*;

public class BurnedPixel extends GameTile {
    public BurnedPixel(int row, int col) {
        super(row, col, Color.RED);
    }
}
