public class LinkedList{
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }

    public LinkedList(int value){
        Node newnode = new Node(value);
        head=newnode;
        tail=newnode;
        length=1;
    }

    public void printfd(){
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newnode = new Node(value);
        if(length==0){
            head=newnode;
            tail=newnode;
        }else{
            tail.next=newnode;
            tail=newnode;
        }
        length++;
    }

    public Node removelast(){
        Node temp = head;
        Node pre = head;
        if(length==0){
            return null;
        }
        while(temp.next!=null){
            pre = temp;
            temp= temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        return temp;
    }

    public void prepand(int value){
        Node newnode = new Node(value);
        if(length==0){
            head=newnode;
            tail=newnode;
        }
        newnode.next=head;
        head=newnode;
        length++;
    }

    public Node removefirst(){
        Node temp = head;
        if(length==0){
            return null;
        }
        else{
            head=temp.next;
            temp.next=null;
            length--;
        }
        return temp;
    }

    public Node get(int index){
        if(index<0||index>=length){
            return null;
        }
        Node temp= head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        System.out.println(temp);
        return temp;
    }

    public boolean set(int index,int value){
        Node temp = get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean insert(int index,int value){
        if(index<0||index>length){
            return false;
        }
        if(index==0){
            prepand(value);
            return true;
        }
        else if (index==length){
            append(value);
            return true;
        }
        Node newnode = new Node(value);
        Node temp = get(index-1);
        newnode.next=temp.next;
        temp.next=newnode;
        length++;
        return true;
    }

}