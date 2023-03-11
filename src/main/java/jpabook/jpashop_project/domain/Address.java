package jpabook.jpashop_project.domain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Embeddable
@Getter
@AllArgsConstructor
public class Address {

    protected Address(){}

    private String city;

    private String street;

    private String zipcode;

}
