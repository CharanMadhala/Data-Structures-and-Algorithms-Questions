public class LinkedList {
    //Node
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //Head
    public static Node head = null;
    //Tail
    public static Node tail = null;
    //Size
    public static int size = 0;
    //isEmpty()
    public static boolean isEmpty(){
        return size == 0;
    }
    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }
    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }
    //add in middle of LinkedList
    //Insert in particular index
    public void add(int index, int data){
        if(index==0){
            addFirst(data);
            size++;
            return;
        }
        Node newNode = new Node(data);
        
        Node prev = head;
        int i=0;
        while(i<index-1){
            i++;
            prev = prev.next;
        }

        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    //printLL()
    public void printLL(){
        if(isEmpty()){
            System.out.println("LL is empty");
            return;
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }System.out.println("null");
    }
    
    //removeFirst
    public int removeFirst(){
        if(isEmpty()){
            System.out.println("LL is empty");
            return -1;
        }else if(size==1){
            int data = head.data;
            head=tail=null;
            size--;
            return data;
        }
        int data = head.data;

        head = head.next;
        size--;
        return data;
    }
    //removeLast
    public int removeLast(){
        if(isEmpty()){
            System.out.println("LL is empty");
            return -1;
        }
        else if(size==1){
            int data = head.data;
            head=tail=null;
            size--;
            return data;
        }
        
        int data = tail.data;
        int count =1;
        Node curr = head;
        while(count<size-1){
            curr = curr.next;
            count++;
        }
        tail = curr;
        size--;
        tail.next = null;
        return data;
    }
    //iterative search
    public static int itrSearch(int data){
        Node curr = head;
        int i=0;
        while(curr!=null){
            if(curr.data==data){
                return i;
            }
            i++;
            curr = curr.next;
           
        }
        //key not found
        return -1;
    }
    //recursiveSearch
    public static int recursiveSearch(Node curr, int data){
        if(curr==null){
            return -1;
        }
        if(curr.data == data){
            return 0;
        }
        return recursiveSearch(curr.next, data)+1;
    }
    //reverse a LL
    public void reverseLL(){
        Node prev,curr,next;
        curr=tail=head;
        prev = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void removeNthFromEnd(int n){
        int toRemove = size-n;
        Node prev = head;
        int i=1;
        while(i<toRemove){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

    }
    
    public boolean isPalindrome(){
        //find mid
        Node slow, fast;
        slow = fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        Node rightTail;
        rightTail = slow;
        
        
        //reverse right LL
        Node prev,curr,next;
        prev = null;curr=rightTail;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        Node rightHead = prev;
        Node leftHead = head;
        //loop through both
        while(rightHead!=null){
            if(leftHead.data!=rightHead.data){
                return false;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;

        }
        return true;
    }

    //detect cycle/loop in LL
    public boolean containsCycle(){
        Node slow, fast;
        slow=fast = head;
        
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }

        }
        return false;
    }
    //remove cycle/loop in LL
    public void removeCycle(){
        //check if cycle exist?
        Node slow, fast;
        slow = fast = head;
        boolean cycleExist = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cycleExist = true;
                break;
            }
        }
        if(cycleExist == false){
            return;
        }
        //if exist slow == fast
        //slow = head
        //then incrmnt slow+1,fast+1
        //while(slow.next!=fast.next)
        slow = head;
        while(slow.next!=head.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
        
    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        ll.head.next.next=new Node(3);
        ll.head.next.next=new Node(4);
        // ll.head.next.next.next = head.next.next;
        System.out.println(ll.containsCycle());
        ll.removeCycle();
        System.out.println(ll.containsCycle());
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addFirst(3);
       
        // ll.head = new Node(1);U
        // ll.head.next = new Node(2);
        // ll.printLL();
        // ll.add(1, 5);
        // ll.printLL();
        // System.out.println(ll.isPalindrome());
        // System.out.println(ll.containsCycle());
        // ll.printLL();
        // ll.removeNthFromEnd(2);

        // ll.reverseLL();
        // ll.printLL();
        // System.out.println(ll.itrSearch(2));
        // System.out.println(ll.recursiveSearch(head, 1));
        // System.out.println(size);
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.printLL();
        // ll.addLast(5);
        // ll.printLL();
        // // System.out.println(head.data);
        // // System.out.println(tail.data);
        // ll.removeFirst();
        // ll.printLL();
        // ll.removeLast();
        // ll.printLL();
    }
}
