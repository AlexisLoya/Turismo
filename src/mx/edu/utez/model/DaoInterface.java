package mx.edu.utez.model;
import java.util.ArrayList;

    public interface DaoInterface <T>{
        int add(T obj);
        boolean delete(int id);
        boolean update(T obj);
        ArrayList<T> findAll();
        T findOne(int id);
    }

