package mx.edu.utez.model.dao;

import mx.edu.utez.model.DaoInterface;
import mx.edu.utez.model.Dao;
import java.util.ArrayList;

public class DaoLugar extends Dao implements DaoInterface<DaoLugar> {
    @Override
    public int add(DaoLugar obj) {
        return 0;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(DaoLugar obj) {
        return false;
    }

    @Override
    public ArrayList<DaoLugar> findAll() {
        return null;
    }

    @Override
    public DaoLugar findOne(int id) {
        return null;
    }
}
