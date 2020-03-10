package list;

public class Linkedlist {
    private Node head;
    private int size;

    public Linkedlist(){
        this.head = null;
        this.size = 0;
    }

    public void setHead(Node head){
        this.head = head;
        this.incSize();
    }

    public void incSize(){
        this.size++;
    }
    
    public void decSize(){
        this.size--;
    }

    public int Size(){
        return this.size;
    }

    public Node getHead(){
        return this.head;
    }

    public Node searchData(String editor){
        Node current = this.getHead();

        while(current != null){
            if(current.getData().getNama().equals(editor)){
                return current;
            }
            if(current.getNext() == null){
                break;
            }
            current = current.getNext();
        }
        return null;
    }

    public String fetchData(String editor){
        Node isFound = this.searchData(editor);

        if(isFound != null){
            return isFound.getData().getNama() + " ditemukan dengan total artikel yang di edit adalah " + isFound.getData().getFreq() + " buah.";
        }else{
            return "Data " + editor + " tidak ditemukan.";
        }
    }

    public void add(String editor){
        Node isFound = this.searchData(editor);

        if(isFound == null){
            this.setHead(new Node(new Data(editor), this.getHead()));
        }else{
            isFound.getData().addFreq();
        }
            
    }

    public void display(){
        Node current = this.getHead();

        while(current != null){
            System.out.println(current.getData().getNama() + " = " + current.getData().getFreq() + " artikel");
            if(current.getNext() == null){
                break;
            }
            current = current.getNext();
        }
    }
}