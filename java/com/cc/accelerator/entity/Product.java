package com.cc.accelerator.entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product extends BaseEntity {
	@Id
	@GeneratedValue
	private Long id;
	private String productName;
	private BigDecimal productPrice;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private User users;
}