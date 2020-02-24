import java.util.ArrayList;
public class defination<Person> implements ADT<Person> {
    int counter = 0;

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
    }
}
