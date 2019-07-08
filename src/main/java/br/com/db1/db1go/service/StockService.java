package br.com.db1.db1go.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.db1go.adapter.StockAdapter;
import br.com.db1.db1go.domain.dto.StockDTO;
import br.com.db1.db1go.domain.entity.Stock;
import br.com.db1.db1go.repository.StockRepository;

@Service
public class StockService {

	@Autowired
	private StockRepository stockRepository;

	//Get com CRUD findAll
	public List<StockDTO> getAll() {
		List<Stock> stocks = stockRepository.findAll();
		List<StockDTO> stocksDTO = new StockAdapter().toDto(stocks);
		return stocksDTO;

	}
	//Get com CRUD count
	public long countStock() {
		return stockRepository.count();
	}

	//Post com CRUD save
	public void save(List<StockDTO> stockDto) {

		List<Stock> stocksDTO = new StockAdapter().toStock(stockDto);

		stockRepository.saveAll(stocksDTO);

	}
}
