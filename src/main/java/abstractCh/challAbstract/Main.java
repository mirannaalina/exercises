package abstractCh.challAbstract;

public class Main {

    public static void main(String[] args) {


        MyLinkList list =new MyLinkList(null);
        list.traverse(list.getRoot());


        String stringData = " A ssss gggg lll";

        String [] data =  stringData.split(" ");
        for(String s : data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());

    }
}
