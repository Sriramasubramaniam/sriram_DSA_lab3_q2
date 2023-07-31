package NodeSumPair;

import java.util.HashSet;
import java.util.Set;

public class NodeSumPair {
   public static class Node{
        int nodeData;
        Node leftNode;
        Node rightNode;
    }

    static Node newNode(int nodeData){
        Node node = new Node();
        node.nodeData = nodeData;
        node.leftNode = null;
        node.rightNode = null;
        return node;
    }

    public Node insertElement(Node root, int value){
        if(root==null){
            return newNode(value);
        }
        if(value < root.nodeData){
            root.leftNode = insertElement(root.leftNode,value);
        }else{
            root.rightNode = insertElement(root.rightNode,value);
        }
        return root;
    }
     public boolean compareWithSet(Node root, int sum, Set<Integer> set){
       if(root==null){
           return false;
       }
        if(set.contains(sum-root.nodeData)){
            System.out.println("Pair is ("+(sum-root.nodeData)+","+root.nodeData+")");
            return true;
        }else{
            set.add(root.nodeData);
        }
        if(compareWithSet(root.leftNode,sum,set)){
            return true;
        }
        return compareWithSet(root.rightNode,sum,set);
     }

     public void findPair(Node root, int sum){
        Set<Integer> set= new HashSet<>();
        if(!compareWithSet(root,sum,set)){
            System.out.println("Pair is not found");
        }
     }
}
