package br.ude.unifacisa.Post.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ude.unifacisa.Post.domain.Post;
import br.ude.unifacisa.Post.service.PostService;


@RestController

public class PostController {

	@Autowired
	private PostService postService;
	
	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public ResponseEntity< List<Post> > listarUsuarios() {

		List<Post> listaUsuarios = (List<Post>) postService.listarTodosUsuarios();

		return new ResponseEntity< List<Post> >(listaUsuarios, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/post/{id}", method = RequestMethod.GET)
	public ResponseEntity<Post> obterUsuario(@PathVariable String id) {

		Optional<Post> post = postService.buscarUsuarioPorId(id);

		if (post == null) {
			return new ResponseEntity<Post>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Post>(post.get(), HttpStatus.OK);
		}
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public ResponseEntity<Post> criarUsuario(@RequestBody Post post) {

		try {
			Post usuarioInserido = postService.inserirUsuario(post);
			return new ResponseEntity<Post>(usuarioInserido, HttpStatus.CREATED);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Post>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public PostService getUserService() {
		return postService;
	}

	public void setUserService(PostService postService) {
		this.postService = postService;
	}

}
