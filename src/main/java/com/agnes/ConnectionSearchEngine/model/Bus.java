package com.agnes.ConnectionSearchEngine.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int busId;
    private String nameOfBus;

}
