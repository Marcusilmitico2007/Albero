public class Tree<T extends Comparable<T>> {


    Node<T> root;

    public Tree() {
        this.root = null;
    }

    public void add(T v){
        Node <T> n = new  Node<>(v);

        if (root==null) {
            root = n; return;
        }
        Node <T>tmp=root;
        while (true) {
            
            if (v.compareTo(tmp.getValue())>=0) {
                if (tmp.getRight()==null){
                    tmp.setRight(n); break; 
                }else{
                    tmp = tmp.getRight();
                }
            }else{
                if (tmp.getLeft()==null){
                    tmp.setLeft(n); break;
                }else {
                    tmp = tmp.getLeft();
                }
            }    
        }
            
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        visita(root,sb);
        return sb.toString();
    }
    public void visita(Node<T> n, StringBuilder s){
        if (n==null) return; 
        if (n.getLeft()!=null) visita(n.getLeft(), s); 
        s.append(n.getValue()); 
        if (n.getRight()!=null) visita(n.getRight(), s);{
            
        }
            
            
        
    }

}
    

