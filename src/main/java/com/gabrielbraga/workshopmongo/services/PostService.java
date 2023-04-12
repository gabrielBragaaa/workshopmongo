package com.gabrielbraga.workshopmongo.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielbraga.workshopmongo.domain.Post;
import com.gabrielbraga.workshopmongo.repository.PostRepository;
import com.gabrielbraga.workshopmongo.services.exception.ObjectNotFoundRException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundRException("Objeto não encontrado"));
	
	}
	
	public List<Post> findByTitle(String text){
		return repo.searchTitle(text);
	}
	
	public List<Post> fullSearch(String text,java.util.Date min,java.util.Date max) {
		max = new Date(max.getTime() + 24 * 60 * 60 * 1000);
		return repo.fullSearch(text, min, max);
	}

}