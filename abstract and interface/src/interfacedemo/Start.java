package interfacedemo;

public class Start {
    public static void main(String[] args) {
        Dao dao = new StudentDaoImpl();
        dao.getAllStudent();

    }
}
