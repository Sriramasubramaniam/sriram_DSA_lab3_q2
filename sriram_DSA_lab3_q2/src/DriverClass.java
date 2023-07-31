
import NodeSumPair.NodeSumPair;
import NodeSumPair.NodeSumPair.Node;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Node root=null;
        NodeSumPair pair = new NodeSumPair();
        root = pair.insertElement(root, 40);
        root = pair.insertElement(root, 20);
        root = pair.insertElement(root, 60);
        root = pair.insertElement(root, 10);
        root = pair.insertElement(root, 30);
        root = pair.insertElement(root, 50);
        root = pair.insertElement(root, 70);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum to be searched:");
        int sum = sc.nextInt();
        pair.findPair(root,sum);
    }
}
