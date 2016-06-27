package srv;

/**
 *
 * @author santos
 */
public class Query {
    private final String action;
    private final String table;
    private final String condition;
    private final String values;

    public Query(String action, String values, String table, String condition) {
        this.action = action;
        this.values = values;
        this.table = table;
        this.condition = condition;
    }

    public String getQuery() {
        String query;
        if (action.equalsIgnoreCase("insert")) {
            query = action + " " + "INTO" + " " + table + " " + values;
            return query;
        } else {
            query = action + " " + values + " " + "FROM" + " " + table;
            if (condition != null && !condition.isEmpty())
                query += " " + "WHERE" + " " + condition;
            return query;
        }
    }
    
}
