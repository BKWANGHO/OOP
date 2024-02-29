package model;

import java.util.function.Predicate;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductDTO {
    private int pno; //1씩 증가
    private String name;
    private String company;
    private int price;


}
