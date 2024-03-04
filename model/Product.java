package model;

import lombok.*;
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class Product {
    private long id;
    private int pno; //1씩 증가
    private String name;
    private String company;
    private int price;


    @Builder(builderMethodName = "builder")
    public Product(long id, int pno, String name, String company, int price) {
        this.id = id;
        this.pno = pno;
        this.name = name;
        this.company = company;
        this.price = price;
    }
}
