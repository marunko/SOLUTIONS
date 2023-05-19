import java.util.Deque;
import java.util.LinkedList;

public class BinaryTreeR {
    
}
class Tree<T>{
    Node<T> root;

    public static class Node<T>{
        Node<T> left, right;
        int levelN; // set level *optional 
        T data;
        Node(T data){
            this.data= data;
        }
    }

    public void levelSearchBFS(){
        Deque<Node<T>> deque = new LinkedList<>(null);
        root.levelN = 1;
        deque.add(root); // add first root
        // then we add in the end of DEQUE left and right 
        // elements: root=>L|R, L=>L2|R2, R=>L2|R2 
        // if you need figure out what level it is 
        // = set levelN property by parent Level + 1
        while(deque.isEmpty()){
            Node<T> current = deque.pop();
            System.out.println(current.data);
            if(current.left!=null){
                current.left.levelN+=1;
                deque.add(current.left);
            }
            if(current.right != null){
                current.right.levelN+=1;
                deque.add(current.right);
            }
        }
    }

}