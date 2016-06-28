package srv;

import edu.ucue.databasequery.db.ConnectionDB;
import edu.ucue.databasequery.db.DBField;
import edu.ucue.databasequery.db.DataBase;
import edu.ucue.databasequery.db.DataBaseURL;
import edu.ucue.databasequery.db.LoginDB;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Map;


/**
 *
 * @author santos
 */
public class QuerySrv {
    private static QuerySrv instance = null;
    private final DataBase database;

    private QuerySrv(String user, String pass) {
        LoginDB login = new LoginDB(DataBaseURL.getOracleURL());
        login.setUser(user);
        login.setPassword(pass);
        
        Connection connection = ConnectionDB.getConnection(login);
        database = new DataBase(connection);
    }
    
    public static void initQuerySrv(String user, String pass) {
        instance = new QuerySrv(user, pass);
    }

    public static QuerySrv getInstance() {
        return instance;
    }
    
    public ArrayList<String> getAllTablesNames() {
        return database.getAllTablesNames();
    }
    
    public void addElement(String tableName, Map<String, String> fields) {
        database.addElement(tableName, fields);
    }
           
    public ArrayList<String> getFields(String tableName) {
        return database.getFields(tableName);
    }
    
    public ArrayList<ArrayList<String>> getAll(String tableName) {
        return database.getAll(tableName);
    }
    
    public void deleteRow(String tableName, ArrayList<DBField> fields) {
        database.delete(tableName, fields);
    }

    public void update(String tableName, ArrayList<DBField> previewRow, ArrayList<DBField> newRow) {
        database.updateElement(tableName, previewRow, newRow);
    }

    public ArrayList<ArrayList<String>> funtionSum(String tableName, String colName) {
        return database.functionSum(tableName, colName);
    }

    public ArrayList<ArrayList<String>> funtionMin(String tableName, String colName) {
        return database.functionMin(tableName, colName);
    }

    public ArrayList<ArrayList<String>> funtionMax(String tableName, String colName) {
        return database.functionMax(tableName, colName);
    }

    public ArrayList<ArrayList<String>> funtionAverage(String tableName, String colName) {
        return database.functionAverage(tableName, colName);
    }

    public ArrayList<ArrayList<String>> funtionCount(String tableName, String colName) {
        return database.functionCount(tableName, colName);
    }
    
    public ArrayList<ArrayList<String>> search(String tableName, String subString) {
        return database.search(tableName, subString);
    }

    public ArrayList<ArrayList<String>> lessThan(String tableName, String colName, String value) {
        return database.lessThan(tableName, colName, value);
    }

    public ArrayList<ArrayList<String>> greaterThan(String tableName, String colName, String value) {
        return database.greaterThan(tableName, colName, value);
    }

    public ArrayList<ArrayList<String>> equalTo(String tableName, String colName, String value) {
        return database.equalTo(tableName, colName, value);
    }

    public ArrayList<ArrayList<String>> unequalTo(String tableName, String colName, String value) {
        return database.unequalTo(tableName, colName, value);
    }
}
