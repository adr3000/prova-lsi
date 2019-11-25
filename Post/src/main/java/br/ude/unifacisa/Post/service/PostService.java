package br.ude.unifacisa.Post.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import br.ude.unifacisa.Post.domain.Post;
import br.ude.unifacisa.Post.repository.PostRepository;



@Service
@Validated
public class PostService {

	@Autowired
	private PostRepository repository;

	public Optional<Post> buscarUsuarioPorId(String id) {
		return repository.findById(id);
	}

	public Iterable<Post> listarTodosUsuarios() {
		return repository.findAll();
	}

	@Transactional
	public Post inserirUsuario(Post usuario) {
		return repository.save(usuario);
	}

	public PostRepository getRepository() {
		return repository;
	}

	public void setRepository(PostRepository repository) {
		this.repository = repository;
	}
}
