package com.swcamp.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor // 생성자
@Setter // 나중엔 세터 잘 안쓴다함
@Getter
@ToString
//@Data // 이거 하나면 위에 다 오버라이딩 가능, 생성자는 ALlArgs~해야함
//나중엔 필요한것만 쓰는걸 권장
public class MemberDTO {
    private int sequence; //회원번호
    private String id;
    private String pwd;
    private String name;
    //롬복 라이브러리 -> 어노테이션으로 게터세터 toString가능, 단축키써서 생성자같은거 생성 안해두됨
}
