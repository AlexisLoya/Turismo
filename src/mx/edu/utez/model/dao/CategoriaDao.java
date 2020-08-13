package mx.edu.utez.model.dao;

import mx.edu.utez.model.Dao;
import mx.edu.utez.model.DaoInterface;
import mx.edu.utez.model.bean.CategoriaBean;

import java.sql.SQLException;
import java.util.ArrayList;

public class CategoriaDao extends Dao  implements DaoInterface<CategoriaBean> {
    private final String REPOSITORY = "SQLRepository";
    @Override
    public int add(CategoriaBean obj) {
        mySQLRepository(REPOSITORY,"categoriaAdd");
        try {
            preparedStatement.setString(1,obj.getNombre());
            preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()){
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
    public boolean update(CategoriaBean obj) {
        return false;
    }

    @Override
    public ArrayList<CategoriaBean> findAll() {
        mySQLRepository(REPOSITORY,"categoriaFindALl");
        ArrayList<CategoriaBean> list = new ArrayList<>();
        try {
            resultSet = preparedStatement.executeQuery();
            CategoriaDao categoriaDao = new CategoriaDao();
            if (resultSet.next()){
                list.add(categoriaDao.findOne(resultSet.getInt("idcategoria")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAllConnections();
        }
        return list;
    }

    @Override
    public CategoriaBean findOne(int id) {
      mySQLRepository(REPOSITORY, "categoriaFindOne");
      CategoriaBean categoriaBean = null;
        try {
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                categoriaBean = new CategoriaBean(
                        resultSet.getInt("idcategoria"),
                        resultSet.getString("nombre"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAllConnections();
        }
        return categoriaBean;
    }

    public static void main(String[] args) {

    }
}
