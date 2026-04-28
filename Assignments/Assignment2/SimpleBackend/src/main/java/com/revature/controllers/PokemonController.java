package com.revature.controllers;

import com.revature.dao.PokemonDao;
import com.revature.models.Pokemon;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonDao pokemonDao;

    public PokemonController(PokemonDao pokemonDao) {
        this.pokemonDao = pokemonDao;
    }

    @GetMapping
    public List<Pokemon> getAllPokemon() {
        return pokemonDao.findAll();
    }

    @GetMapping("/{type1}")
    public List<Pokemon> getPokemonById(@PathVariable String type1) {
        return pokemonDao.getPokemonByType1(type1);
    }

    @PostMapping
    public Pokemon createPokemon(@RequestBody Pokemon pokemon) {
        return pokemonDao.save(pokemon);
    }
}
