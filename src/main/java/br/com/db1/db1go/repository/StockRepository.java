package br.com.db1.db1go.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.db1.db1go.domain.entity.Stock;

@Repository
public interface StockRepository extends MongoRepository<Stock, String> {

	
	

}
