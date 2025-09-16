package com.swcamp.transactional.section01.annotation;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

//매퍼로 등록하겠다 + Bean이 됨 (컴포넌트 계열)
//해당 인터페이스가 객체로되어 스프링이 관리된다.(싱글톤 객체)
// (sql세션 팩토리 매퍼이자 sql세션
@Mapper
public interface MenuMapper {
    List<Menu> selectMenuByMenuCodes(Map<String, List<Integer>> map);
}
