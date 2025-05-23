public class Tree<T extends Comparable<T>> {


    Node<T> root;

    public Tree() {
        this.root = null;
    }

    public void add(T v){
        Node <T> n = new  Node<>(v);

        if (root==null) {root = n; return;}

        while (true) {
            Node <T>tmp=root;
            if (v.compareTo(tmp.getValue())>=0) {
                if (tmp.getRight()==null){tmp.setRight(tmp); break; }{
                    tmp = tmp.getRight();
                }else{
                    if (tmp.getLeft()==null){tmp.setLeft(n); break;} {
                        tmp = tmp.getLeft();
                    }
                }
            }    
        }
            
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        visita(root,sb);
        return sb;
    }
    public void visita(Node<T> n, StringBuilder s){
        if (n==null) return; 
        if (n.getLeft()!=null) visita(n.getLeft(), s); 
        s.append(n.getValue()); 
        if (n.getRight()!=null) visita(n.getRight(), s);{
            
        }
            
            
        
    }

}
    

