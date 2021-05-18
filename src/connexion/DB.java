package connexion;
import characters.Character;
import java.sql.*;

public class DB {
    String url = "jdbc:mysql://localhost:3306/bdd_javaproject";
    String userName = "java";
    String pass = "linux";


    public void dbSaveGame(Character hero) {


        try {
            Connection con = DriverManager.getConnection(url, userName, pass);
            Statement statement = con.createStatement();
            //ResultSet result = statement.executeQuery("INSERT INTO Hero(type, name, health, strength, weapon, spell) VALUE ('type', 'name', 'health', 'strength', 'weapon', 'spell')");
            String query = "INSERT INTO Hero(type, name, health, strength)" + " VALUE (?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, hero.getType());
            preparedStmt.setString(2, hero.getName());
            preparedStmt.setInt(3, hero.getHealth());
            preparedStmt.setInt(4, hero.getStrength());
            preparedStmt.execute();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

