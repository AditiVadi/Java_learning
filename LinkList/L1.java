package LinkList;

public class L1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {// constrater
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFrist(int data) {
        // create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // newNode next=head
        newNode.next = head;
        // head=newNode
        head = newNode;
    }

    public void addLast(int data) {
        // create a node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int idx, int value) {
        if (idx == 0) {
            addFrist(value);
            return;
        }
        Node newNode = new Node(value);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFrist() {
        if (size == 0) {
            System.out.println("empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;// tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void removeNthnodeformEnd(int val) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (val == sz) {
            head = head.next;// remove frist
            return;
        }
        int i = 1;
        int iToFind = sz - val;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;// delete
        return;

    }

    public int itrsearch(int val) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == val) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;

    }

    public int recursivesearch(int val) {
        return helper(head, val);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // slow fast approch
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;// slow is mid
    }

    public boolean chackPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // find mid
        Node mid = findMid(head);

        // reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;// right half head
        Node left = head;
        // check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle() {// Floy's CFA
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;// cycle exists
            }
        }
        return false;

    }

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;// last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
        // removw cycle-> last.next=null

    }

    public Node margeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node fast = head.next;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = margeSort(head);
        Node newRight = margeSort(rightHead);

        // merge
        return marge(newLeft, newRight);
    }

    private Node marge(Node head1, Node head2) {
        Node mergell = new Node(-1);
        Node temp = mergell;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergell.next;
    }

    public Node findMidforR(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;

    }

    public void ZigZagLL() {
        // find mid
        Node mid = findMidforR(head);

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        // alt merge - zig-zag merge
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            // update
            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        L1 ll = new L1();
        // ll.addFrist(2);
        // ll.addFrist(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.add(2, 9);
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeFrist();
        // ll.removeLast();
        // ll.print();

        // System.out.println(ll.itrsearch(5));
        // System.out.println(ll.recursivesearch(3));
        // System.out.println(ll.size);
        // ll.reverse();
        // ll.print();
        // ll.removeNthnodeformEnd(3);
        // ll.print();
        // System.out.println(ll.chackPalindrome());
        // ll.addFrist(1);
        // ll.addFrist(1);
        // System.out.println(ll.chackPalindrome());
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        ll.addFrist(1);
        ll.addFrist(2);
        ll.addFrist(3);
        ll.addFrist(5);
        ll.print();
        ll.head = ll.margeSort(ll.head);// O(NlogN)
        ll.print();
        ll.ZigZagLL();
        ll.print();
    }
}
