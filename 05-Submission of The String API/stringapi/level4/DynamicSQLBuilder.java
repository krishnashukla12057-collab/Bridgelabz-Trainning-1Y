package stringapi.level4;
import java.util.ArrayList;

public class DynamicSQLBuilder {

    static class SQLQueryBuilder {
        private String tableName;
        private ArrayList<String> selectColumns = new ArrayList<>();
        private ArrayList<String> whereConditions = new ArrayList<>();
        private ArrayList<String> joins = new ArrayList<>();
        private ArrayList<String> orderBy = new ArrayList<>();
        private int limit = -1;

        public SQLQueryBuilder(String table) {
            this.tableName = table;
        }

        public void addSelectColumn(String column) {
            selectColumns.add(column);
        }

        public void addWhereCondition(String condition, String operator) {
            if (whereConditions.isEmpty()) {
                whereConditions.add(condition);
            } else {
                whereConditions.add(operator + " " + condition);
            }
        }

        public void addJoin(String table, String condition) {
            joins.add("JOIN " + table + " ON " + condition);
        }

        public void addOrderBy(String column, String direction) {
            orderBy.add(column + " " + direction);
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public String build() {
            StringBuilder query = new StringBuilder();

            // SELECT
            query.append("SELECT ");
            if (selectColumns.isEmpty()) {
                query.append("*");
            } else {
                query.append(String.join(", ", selectColumns));
            }
            query.append("\n");

            // FROM
            query.append("FROM ").append(tableName).append("\n");

            // JOIN
            for (String j : joins) {
                query.append(j).append("\n");
            }

            // WHERE
            if (!whereConditions.isEmpty()) {
                query.append("WHERE ");
                for (String cond : whereConditions) {
                    query.append(cond).append(" ");
                }
                query.append("\n");
            }

            // ORDER BY
            if (!orderBy.isEmpty()) {
                query.append("ORDER BY ").append(String.join(", ", orderBy)).append("\n");
            }

            // LIMIT
            if (limit > 0) {
                query.append("LIMIT ").append(limit).append("\n");
            }

            return query.toString().trim();
        }
    }

    public static void main(String[] args) {

        SQLQueryBuilder builder = new SQLQueryBuilder("employees");

        builder.addSelectColumn("id");
        builder.addSelectColumn("name");
        builder.addSelectColumn("department");
        builder.addSelectColumn("salary");
        builder.addSelectColumn("joining_date");

        builder.addJoin("departments d", "employees.department = d.id");

        builder.addWhereCondition("salary > 50000", "AND");
        builder.addWhereCondition("department = 'IT'", "AND");
        builder.addWhereCondition("status = 'active'", "OR");

        builder.addOrderBy("salary", "DESC");
        builder.addOrderBy("joining_date", "ASC");

        builder.setLimit(100);

        String query = builder.build();
        System.out.println("Generated SQL Query:");
        System.out.println(query);
        System.out.println("\nQuery Length: " + query.length());
    }
}
