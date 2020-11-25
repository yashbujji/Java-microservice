package com.cc.accelerator.entity;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
	@CreationTimestamp
	@Column(nullable = false, updatable = false)
	private Instant createdAt;
	@UpdateTimestamp
	private Instant updatedAt;
	@Column(nullable = true)
	private String createdBy;
	@Column(nullable = true)
	private String updatedBy;
}
