package io.github.marcosjunior.libraryapi.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.marcosjunior.libraryapi.entity.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, UUID> {

    List<Autor> findByNomeAndNacionalidade(String nome, String nacionalidade);

    List<Autor> findByNacionalidade(String nacionalidade);

    List<Autor> findByNome(String nome);

}
