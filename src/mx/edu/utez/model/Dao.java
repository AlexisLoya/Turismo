package mx.edu.utez.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import mx.edu.utez.utilities.MySQLConnection;

public abstract class Dao {
    protected ResourceBundle sqlSentences;
    protected Connection connection;
    protected ResultSet resultSet;
    protected PreparedStatement preparedStatement;
    protected boolean status;

    protected Dao() {
        this.status = false;
    }

    /**
     * Inicia los recursos necesarios para realizar una consulta a la base de datos
     * @param databaseActivity sentencia sql guardada en el archivo MySQLRepository.properties
     * @param repository nombre del achivo .properties
     */
    protected void mySQLRepository(String repository, String databaseActivity) {
        try {
            this.connection = MySQLConnection.getConnection();
            sqlSentences = ResourceBundle.getBundle(repository);
            this.preparedStatement = this.connection.prepareStatement(sqlSentences.getString(databaseActivity),Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException e) {
            System.err.println("No se pudieron iniciar los recursos: " + e.getMessage());
        }
    }
    /**
     * Cierra todas las conexiones abiertas
     */
    protected void closeAllConnections() {
        try {
            if (this.connection != null) {
                this.connection.close();
            }
            if (this.resultSet != null) {
                this.resultSet.close();
            }
            if (this.preparedStatement != null) {
                this.preparedStatement.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar conexiones: " + e.getMessage());
        }
    }

}
