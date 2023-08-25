package com.example.unicodejpaopgave.config;

import com.example.unicodejpaopgave.model.Unicode;
import com.example.unicodejpaopgave.repositories.UnicodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner
{
    @Autowired
    UnicodeRepo unicodeRepo;

    @Override
    public void run(String... args) throws Exception
    {
        Set<Character> chars = new HashSet<>();
        for(int i=1; i!=chars.size(); i++)
        {
            char c = (char) i;
            chars.add(c);
            Unicode unicode = new Unicode();
            unicode.setLetter(c);
            unicodeRepo.save(unicode);
        }

    }
}
