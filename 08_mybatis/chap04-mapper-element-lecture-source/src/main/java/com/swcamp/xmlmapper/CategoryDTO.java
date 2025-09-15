package com.swcamp.xmlmapper;

public class CategoryDTO {
    private int categoryCode;
    private String categoryName;
//    private int refCategoryCode;
    //이렇게 쓰면 안됨, int쓰면안되는이유 -> null이 들어갈수있고 없고!
    //Null값이 들어올 수 있는 필드 Wrapper class 활용 (널 값도 받기 위해)
    private Integer refCategoryCode;
//DTO에setter는 지금 상관없지만..~~
    public CategoryDTO() {
    }

    public CategoryDTO(int categoryCode, String categoryName, Integer refCategoryCode) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.refCategoryCode = refCategoryCode;
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

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", refCategoryCode=" + refCategoryCode +
                '}';
    }
}
