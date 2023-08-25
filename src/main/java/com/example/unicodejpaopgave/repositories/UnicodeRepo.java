package com.example.unicodejpaopgave.repositories;

import com.example.unicodejpaopgave.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface UnicodeRepo extends JpaRepository<Unicode, Integer>
{

}
