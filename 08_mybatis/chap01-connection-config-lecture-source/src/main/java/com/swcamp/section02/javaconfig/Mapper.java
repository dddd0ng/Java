package com.swcamp.section02.javaconfig;

import org.apache.ibatis.annotations.Select;
//쿼리는 xml이 강점
//자바 담을 쿼리는 인터페이스로!
public interface Mapper {
    @Select("SELECT NOW()")
    java.util.Date selectNow();
}
