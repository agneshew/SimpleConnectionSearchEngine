package com.agnes.ConnectionSearchEngine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int routeId;
    @Temporal(TemporalType.DATE)
    private Date date;
    @OneToOne
    private Bus bus;
    private String busStopsOnRoute;
}
