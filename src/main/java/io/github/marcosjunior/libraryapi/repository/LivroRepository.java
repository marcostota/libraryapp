package io.github.marcosjunior.libraryapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.marcosjunior.libraryapi.entity.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, UUID> {

}
