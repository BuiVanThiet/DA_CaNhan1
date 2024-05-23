package com.example.ass2_beta_mark2.entity.sumMoney;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
public class TotalAmount {
    private Integer id;
    private BigDecimal tongTien;
    public TotalAmount(Integer id, BigDecimal tongTien) {
        this.id = id;
        this.tongTien = tongTien;
    }
}
