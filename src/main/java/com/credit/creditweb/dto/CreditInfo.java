package com.credit.creditweb.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreditInfo {

    @Id
    private String creditNo;

    @Column
    private String name;

    @Column
    private Long gendoGaku;

    @Column
    private Long siyoGaku;

}
