package structural.flyweight.example.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 플라이웨이트 생성의 복잡성을 캡슐화
 * */
public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
