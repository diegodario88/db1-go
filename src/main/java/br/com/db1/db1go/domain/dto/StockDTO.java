package br.com.db1.db1go.domain.dto;

import java.time.LocalDate;

public class StockDTO {

	private String name;
	private StockValueDTO value;
	private LocalDate date;

	//Constructor
	public StockDTO() {
		super();
	}
	public StockDTO(String name, StockValueDTO value, LocalDate date) {
		super();
		this.name = name;
		this.value = value;
		this.date = date;
	}

	
	public String getName() {
		return name;
	}

	public StockValueDTO getValue() {
		return value;
	}

	public LocalDate getDate() {
		return date;
	}

}
