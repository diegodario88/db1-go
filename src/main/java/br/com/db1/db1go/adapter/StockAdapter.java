package br.com.db1.db1go.adapter;

import java.util.List;
import java.util.stream.Collectors;

import br.com.db1.db1go.domain.dto.StockDTO;
import br.com.db1.db1go.domain.dto.StockValueDTO;
import br.com.db1.db1go.domain.entity.Stock;

public class StockAdapter {

	public List<StockDTO> toDto(List<Stock> stocks) {

		return stocks.stream().map(s -> {
			StockValueDTO stockValue = new StockValueDTO(s.getStartValue(), s.getEndValue());
			StockDTO stock = new StockDTO(s.getName(), stockValue, s.getDate());
			return stock;

		}).collect(Collectors.toList());
	}

}
