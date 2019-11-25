package br.ude.unifacisa.Post.repository;

import org.springframework.data.repository.CrudRepository;

import br.ude.unifacisa.Post.domain.Post;

public interface PostRepository extends CrudRepository<Post, String> {

}
