package com.nhom12shop.main.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product_images")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductImages implements Serializable {

    private static final long serialVersionUID = -6217012820291392804L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "imgName")
    private String imgName;

    @ManyToOne
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Products product;
}
