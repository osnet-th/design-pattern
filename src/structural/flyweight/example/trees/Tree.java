package structural.flyweight.example.trees;

import java.awt.*;

/**
 * 각 트리에 대해 고유한 상태를 포함
 * */
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
