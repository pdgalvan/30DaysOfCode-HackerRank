package Day22;

import java.util.*;
import java.io.*;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {

    public static int getHeight(Node root) {
        int leftH = 0;
        int rightH = 0;
        //Write your code here
        //sacar el peso de izq y derecha en caso de que haya un nodo
        //si ya es nulo entonces devolver 0
        //devolver el mayor valor entre el peso de izq y peso de der
        if (root.left != null) {
            leftH += 1 + getHeight(root.left);
        }
        if (root.right != null) {
            rightH += 1 + getHeight(root.right);
        }
        if (leftH > rightH) {
            return leftH;
        } else {
            return rightH;
        }

    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}