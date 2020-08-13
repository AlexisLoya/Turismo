package mx.edu.utez.model.dao;

import mx.edu.utez.model.Dao;
import mx.edu.utez.model.DaoInterface;
import mx.edu.utez.model.bean.CiudadBean;

import java.sql.SQLException;
import java.util.ArrayList;

public class CiudadDao extends Dao implements DaoInterface<CiudadBean> {
    private final String REPOSITORY="SQLRepository";
    @Override
    public int add(CiudadBean obj) {
        mySQLRepository(REPOSITORY,"ciudadAdd");
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
      mySQLRepository(REPOSITORY,"ciudadDelete");
        try {
            preparedStatement.setInt(1,id);
            status = preparedStatement.executeUpdate() == 1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            status = false;
        } finally {
            closeAllConnections();
        }
        return status;
    }

    @Override
    public boolean update(CiudadBean obj) {
        mySQLRepository(REPOSITORY,"ciudadUpdate");
        try {
            preparedStatement.setString(1,obj.getNombre());
            status = preparedStatement.executeUpdate() == 1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            status = false;
        } finally {
            closeAllConnections();
        }
        return status;
    }

    @Override
    public ArrayList<CiudadBean> findAll() {
      mySQLRepository(REPOSITORY,"ciudadFindAll");
      ArrayList<CiudadBean> list = new ArrayList<>();
        try {
            resultSet= preparedStatement.executeQuery();
            if (resultSet.next()){
                list.add(new CiudadDao().findOne(resultSet.getInt("idciudad")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAllConnections();
        }
        return  list;
    }

    @Override
    public CiudadBean findOne(int id) {
        mySQLRepository(REPOSITORY,"cuidadFindOne");
        CiudadBean ciudadBean = null;
        try {
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                ciudadBean = new CiudadBean(
                        resultSet.getInt("idciudad"),
                        resultSet.getString("nombre")
                );
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAllConnections();
        }
        return  ciudadBean;
    }

    public static void main(String[] args) {
        
    }
}
