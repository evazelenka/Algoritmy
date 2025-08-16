package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    Node root;

    public boolean exists(int value){
        if (root == null) return false;
        return find(root, value) != null;
    }

    /**
     * Метод, реализующий обход в ширину по дереву и поиск узла с заданным значением
     * @param value заданное значение
     * @return возвращает узел, который содержит заданное значение или null
     */
    private Node find(int value){
        List<Node> line = new ArrayList<>();
        line.add(root);
        while (!line.isEmpty()){
            List<Node> nextLine = new ArrayList<>();
            for (Node node : line) {
                if (node.value == value){
                    return node;
                }
                nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;
    }

    /**
     * Метод, реализующий рекурсивный обход в глубину по дереву и поиск узла с заданным значением
     * @param node начальный узел, лучшего всего рутовый
     * @param value заданное значение
     * @return возвращает узел, который содержит заданное значение или null
     */
    private Node find(Node node, int value){
        if (node.value == value){
            return node;
        } else {
            for (Node child : node.children) {
                Node result = find(child, value);
                if (result != null){
                    return result;
                }
            }
        }
        return null;
    }

    class Node{
        int value;
        List<Node> children;
    }
}
