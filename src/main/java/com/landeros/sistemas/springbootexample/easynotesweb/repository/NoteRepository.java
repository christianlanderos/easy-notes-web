package com.landeros.sistemas.springbootexample.easynotesweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.landeros.sistemas.springbootexample.easynotesweb.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
