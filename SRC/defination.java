import java.util.ArrayList;
public class defination<Person> implements ADT<Person> {
    int counter=0;
    private ArrayList<String> Name = new ArrayList<>();
    private ArrayList<String> FirstName = new ArrayList<>();
    private Node<Person> head = null;
    private int size = 0;

    public Node<Person> getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    private void addFirst(Person details) {
        head = new Node<Person>(head, details);
        size++;

    }

    @Override
    public boolean add(Person details) {
        return false;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public void search(String person) {

    }

    @Override
    public void viewAllDetails() {

    }

    private static class Node<Person> {
                private Node next = null;
                private Person data = null;

                public Node(Person data) {
                    this.data = data;

                    this.next = null;
        }

        public Node(Node next, Person data) {
            this.next = next;
            this.data = data;

        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Person getData() {
            return data;
        }

        public void setData(Person data) {
            this.data = data;
        }
    }

}



