package br.edu.ifrn.projetolista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.edu.ifrn.projetolista.domain.usuario.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long>{

  UserDetails findByLogin(String username);
  
}