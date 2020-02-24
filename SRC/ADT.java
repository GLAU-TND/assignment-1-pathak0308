public interface ADT<Person> {
        boolean add(Person details);

        boolean delete(int index);

        void search(String person);

        void viewAllDetails();
}
