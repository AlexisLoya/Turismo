package mx.edu.utez.model.dao;

import mx.edu.utez.model.Dao;
import mx.edu.utez.model.DaoInterface;
import mx.edu.utez.model.bean.LugarBean;

import java.util.ArrayList;

public class LugarDao extends Dao implements DaoInterface<LugarBean> {
    @Override
    public int add(LugarBean obj) {
        return 0;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(LugarBean obj) {
        return false;
    }

    @Override
    public ArrayList<LugarBean> findAll() {
        return null;
    }

    @Override
    public LugarBean findOne(int id) {
        return null;
    }
}
