package com.swcamp.userservice.aggregate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_member")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="email", nullable=false, length=50, unique=true)
    private String email;

//    @Column(name="pwd", nullable = false)
//    private String pwd;  비밀번호 평문

    //비밀번호 암호화
    @Column(name="encrypt_pwd", nullable = false)
    private String encryptPwd;


    @Column(name="name", nullable=false, length=50)
    private String name;

    @Column(name="userId", nullable = false, unique=true)
    private String userId; //회원가입시 생성 될 고유번호//중복되지않게 unique=true

}
