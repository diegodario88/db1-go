package br.com.db1.db1go.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import br.com.db1.db1go.domain.dto.StockValueDTO;

@Document(collection = "stock")
public class Stock {
	@Id
	private String id;
	@NotNull(message = "O campo nome é obrigatório")
	private String name;
	@NotNull(message = "O campo valor é obrigatório")
	private BigDecimal startValue;
	@NotNull(message = "O campo valor é obrigatório")
	private BigDecimal endValue;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;

	public Stock() {
		super();
	}

	public Stock(String name, StockValueDTO stockValue, LocalDate date) {

		super();
		this.name = name;
		this.startValue = stockValue.getStart();
		this.endValue = stockValue.getEnd();
		this.date = date;

	}

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
