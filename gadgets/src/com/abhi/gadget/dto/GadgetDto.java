package com.abhi.gadget.dto;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GadgetDto {
    private int productId;
    private String productName;
    private double price;
    private int quantity;
    private String category;
}
