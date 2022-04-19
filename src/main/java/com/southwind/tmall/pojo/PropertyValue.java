package com.southwind.tmall.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
@Data
@Table(name="propertyValue")
@Entity
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class PropertyValue {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name="pid")
    private Product product;
    @ManyToOne
    @JoinColumn(name="ptid")
    private Property property;

    private String value;

    @Override
    public String toString() {
        return "PropertyValue{" +
                "id=" + id +
                ", product=" + product +
                ", property=" + property +
                ", value='" + value + '\'' +
                '}';
    }
}

