package com.swcamp.section02.javaconfig;

public class Template {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/menudb";
    private static String user = "swcamp";
    private static String password = "swcamp";

    private static SqlSessionFactory sqlSessionFactory;

    /* 설명. Lazy Singleton 방식으로 작성 */
    public static SqlSession getSqlSession() {
        if(sqlSessionFactory == null) {
            Environment environment =
                    new Environment("dev"
                            , new JdbcTransactionFactory()
                            , new PooledDataSource(driver, url, user, password));
            Configuration configuration = new Configuration(environment);

            /* 설명. Mapper용 인터페이스(feat. 쿼리 포함 인터페이스) 추가 */
            configuration.addMapper(MenuMapper.class);

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        }

        return sqlSessionFactory.openSession(false);
    }
}
