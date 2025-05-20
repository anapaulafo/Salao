package com.projeto.salao.service;

import com.projeto.salao.model.Usuario;
import com.projeto.salao.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario atualizar(Long id, Usuario novoUsuario) {
        return usuarioRepository.findById(id).map(usuario -> {
            usuario.setNome(novoUsuario.getNome());
            usuario.setCpf(novoUsuario.getCpf());
            usuario.setEndereco(novoUsuario.getEndereco());
            return usuarioRepository.save(usuario);
        }).orElse(null);
    }

    public boolean deletar(Long id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
