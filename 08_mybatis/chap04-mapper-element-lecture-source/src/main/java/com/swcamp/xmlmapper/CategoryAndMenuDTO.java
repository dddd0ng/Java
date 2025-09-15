package com.swcamp.xmlmapper;

import java.util.List;

//실제론 이런식으로는 잘 안함
public class CategoryAndMenuDTO {
    private int categoryCode;
    private String categoryName;
    //    private int refCategoryCode;
    //이렇게 쓰면 안됨, int쓰면안되는이유 -> null이 들어갈수있고 없고!
    //Null값이 들어올 수 있는 필드 Wrapper class 활용 (널 값도 받기 위해)
    private Integer refCategoryCode;
    private List<MenuDTO> menus;

    public CategoryAndMenuDTO() {
    }

    public CategoryAndMenuDTO(int categoryCode, String categoryName, Integer refCategoryCode, List<MenuDTO> menus) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.refCategoryCode = refCategoryCode;
        this.menus = menus;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getRefCategoryCode() {
        return refCategoryCode;
    }

    public void setRefCategoryCode(Integer refCategoryCode) {
        this.refCategoryCode = refCategoryCode;
    }

    public List<MenuDTO> getMenus() {
        return menus;
    }

    public void setMenus(List<MenuDTO> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "CategoryAndMenuDTO{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", refCategoryCode=" + refCategoryCode +
                ", menus=" + menus +
                '}';
    }
}


