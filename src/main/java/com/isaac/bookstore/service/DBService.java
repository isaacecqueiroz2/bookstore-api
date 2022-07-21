package com.isaac.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isaac.bookstore.domain.Categoria;
import com.isaac.bookstore.domain.Livro;
import com.isaac.bookstore.repositories.CategoriaRepository;
import com.isaac.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informática", "Livro de TI");
		Categoria cat2 = new Categoria(null, "Ficção Científica", "Livro de Ficção");
		Categoria cat3 = new Categoria(null, "Biografia", "Livro de Bio");

		Livro l1 = new Livro(null, "Clean Code", "Romert Martin", "Lorem ipsum", cat1);
		Livro l2 = new Livro(null, "Engenharia de Software", "Luiz Vaz", "Lorem ipsum", cat1);
		Livro l3 = new Livro(null, "The Time Machine", "João da Silva", "Lorem ipsum", cat2);
		Livro l4 = new Livro(null, "The War of the Worlsds", "XX YY ZZ", "Lorem ipsum", cat1);
		Livro l5 = new Livro(null, "I Robot", "Isaac Asimov", "Lorem ipsum", cat1);

		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));

	}

}
