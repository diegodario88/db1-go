package br.com.db1.db1go.domain.dto;

import java.math.BigDecimal;

public class StockValueDTO {

	private BigDecimal start;
	private BigDecimal end;

	// Constructor
	public StockValueDTO() {
		super();
	}

	public StockValueDTO(BigDecimal start, BigDecimal end) {
		super();
		this.start = start;
		this.end = end;
	}

	public BigDecimal getStart() {
		return start;
	}

	public BigDecimal getEnd() {
		return end;
	}
}
