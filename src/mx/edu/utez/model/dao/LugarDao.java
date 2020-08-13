package mx.edu.utez.model.dao;

import mx.edu.utez.model.Dao;
import mx.edu.utez.model.DaoInterface;
import mx.edu.utez.model.bean.LugarBean;

import java.sql.SQLException;
import java.util.ArrayList;

public class LugarDao extends Dao implements DaoInterface<LugarBean> {
    private final  String REPOSITORY = "SQLRepository";

    @Override
    public int add(LugarBean obj) {
        mySQLRepository(REPOSITORY,"lugarAdd");
        try {
            preparedStatement.setString(1,obj.getNombre());
            preparedStatement.setInt(2,obj.getCiudad().getId());
            preparedStatement.setInt(3,obj.getCategoria().getId());
            preparedStatement.setString(4,obj.getDescripcion());
            preparedStatement.setInt(5,obj.getCosto());
            preparedStatement.setString(6,obj.getImagen());
            preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if(resultSet.next()){
                return resultSet.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAllConnections();
        }
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
     mySQLRepository(REPOSITORY,"lugarFindAll");
        ArrayList<LugarBean> list = new ArrayList<>();
        try {
            resultSet = preparedStatement.executeQuery();
            LugarDao lugarDao = new LugarDao();
            while (resultSet.next()){
                list.add(lugarDao.findOne(resultSet.getInt("idlugar")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAllConnections();
        }
        return list;
    }

    @Override
    public LugarBean findOne(int id) {
      mySQLRepository(REPOSITORY, "lugarFindOne");
      LugarBean lugarBean = null;
        try {
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                lugarBean = new LugarBean(
                        resultSet.getInt("idlugar"),
                        resultSet.getString("nombre"),
                        new CiudadDao().findOne(resultSet.getInt("ciudad_idciudad")),
                        new CategoriaDao().findOne(resultSet.getInt("categoria_idcategoria")),
                        resultSet.getString("descripcion"),
                        resultSet.getInt("costo"),
                        resultSet.getString("imagen"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAllConnections();
        }
        return  lugarBean;
    }

    public static void main(String[] args) {

    }
}
