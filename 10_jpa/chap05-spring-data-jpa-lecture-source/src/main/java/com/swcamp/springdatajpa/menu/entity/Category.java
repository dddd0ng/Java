package com.swcamp.springdatajpa.menu.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="tbl_category")
public class Category {
    @Id
    @Column(name="category_code")
    private int categoryCode;

    @Column(name="category_name")
    private String categoryName;


    @Column(name="ref=category_code")
    private Integer refCategoryCode;

}
