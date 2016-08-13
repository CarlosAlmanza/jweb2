package br.com.fabricadeprogramador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fabricadeprogramador.model.Cliente;

//em extends preeencher o tipo da classe e o tipo da chave primaria .

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
}
