package br.com.db1.db1go.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Stock {
	@Id
	private String id;
	private String name;
	private BigDecimal startValue;
	private BigDecimal endValue;
	private LocalDate date;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getStartValue() {
		return startValue;
	}

	public void setStartValue(BigDecimal startValue) {
		this.startValue = startValue;
	}

	public BigDecimal getEndValue() {
		return endValue;
	}

	public void setEndValue(BigDecimal endValue) {
		this.endValue = endValue;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
