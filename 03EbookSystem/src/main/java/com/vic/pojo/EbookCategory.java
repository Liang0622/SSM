package com.vic.pojo;

public class EbookCategory {
    private Integer id;//分类编号
    private String name;//分类名称

    public EbookCategory(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public EbookCategory() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EbookCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
