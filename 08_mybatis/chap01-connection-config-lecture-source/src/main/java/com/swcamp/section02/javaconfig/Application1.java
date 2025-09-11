package com.swcamp.section02.javaconfig;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

//xml,java,remix(xml,java섞인방식(혼용))/리믹스를 제일 많이 씀
//자바 담을 쿼리는 인터페이스로!
public class Application1 {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/menudb";
    private static String username = "root";
    private static String password = "1221";

    /* JdbcTransactionFactory : 수동 커밋
    * ManagedTransactionFactory : 자동 커밋
    * ------------------------------------
    * PooledDataSource : ConnectionPool 활용 (db랑 연결할때마다 풀에서 꺼내는거라 빠름, 일반적으로 씀)
    * UnPooledDataSource : ConnectionPool 활용 X (리소스가 너무 부족하다 하면 안쓸수있음)
    *
    * */



    public static void main(String[] args) {
        Environment environment = new Environment(
                "dev",
                new JdbcTransactionFactory(),
                new PooledDataSource(driver,url,username,password)
        );

        Configuration configuration = new Configuration(environment);//environment를 인지한 configuration([설정]객체를 만들어줌)
        //매퍼도 인지 시켜야함(등록)
        configuration.addMapper(Mapper.class); //타입만 넘기면 됨. Mapper클래스 타입만 뜯어서 (리플렉션 활용해서)
        //매개변수가 클래스타입.


        /* SqlSessionFactory : SqlSession 객체를 생성하기 위한 팩토리 역할의 인터페이스
        * SqlSessionFactoryBuilder : SqlSessionFactory 인터페이스 타입의
        *                           하위 구현 객체를 생성하기 위한 빌더 역할
        * build() : 설정에 대한 정보를 담고 있는 Configuration 타입의
        *           객체 (java방식) 혹은 외부 설정 파일과 연결된 stream을
        *            매개변수로 전달(xml방식)하면 SqlSessionFactory
        *            타입의 객체를 반환하는 메소드
        * */
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        //Stream만들 필요 없이 configuration을 던져줌(객체를 만들어서)
        SqlSession session = sqlSessionFactory.openSession(false); // 수동 커밋을 위해 false사용

        Mapper mapper = session.getMapper(Mapper.class); //Mapper의 하위 구현체 생성

        java.util.Date nowDate = mapper.selectNow();
        System.out.println("nowDate(자바 방식) = " + nowDate);

        session.close(); //session 닫아줘야함
    }
}
