package design.patterns.creational.objectPool;

public class Client {
    public static void main(String[] args){
        DBConnectionPool dbConnectionPool=new DBConnectionPool(5);
        try {
            for(int i=0; i<10; i++){
                DBConnection dbConnection=dbConnectionPool.getConnection();
                dbConnection.setProperties("property:"+i);
                System.out.println(dbConnection.name);
                System.out.println(dbConnection.properties);

                //returning the connection so that it can be used later, commenting this line would create only objects available in thread pool
                dbConnectionPool.returnConnection(dbConnection);

            }
        }catch (Exception e){
            System.out.println(e+":"+e.getMessage());
        }

    }
}
