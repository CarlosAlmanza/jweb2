package br.com.fabricadeprogramador.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fabricadeprogramador.model.Cliente;

//diz para o Junit operar com o spring , avisa que o spring esta na area .
@RunWith(SpringRunner.class)
//Esta notacao nao deixa salvar no banco pois é so um teste 
@DataJpaTest
public class TesteClienteRepository {
	
	//o spring que vai instanciar as nossas variaveis objetos pois elas sao regenciadas pelo Repository 
	@Autowired
	ClienteRepository repository;
	
	//Teste da org Junit
	@Test
	public void testeSalvar(){
		Cliente cliente = new Cliente();
		cliente.setNome("Jão");
		cliente.setEmail("jao@gmail.com");
		cliente.setCpf("999999999");
		//esse metodo save na foi criado , o spring o criou ,ele é da clase que o 
		//ClienteRepository extendeu 
		repository.save(cliente);
	}
	
}
