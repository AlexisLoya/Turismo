package mx.edu.utez.model.dao;

import mx.edu.utez.model.Dao;
import mx.edu.utez.model.DaoInterface;
import java.util.ArrayList;

public class CiudadDao extends Dao implements DaoInterface<CiudadDao> {
    @Override
    public int add(CiudadDao obj) {
        return 0;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(CiudadDao obj) {
        return false;
    }

    @Override
    public ArrayList<CiudadDao> findAll() {
        return null;
    }

    @Override
    public CiudadDao findOne(int id) {
        return null;
    }
}
