package com.revature.dao;

import com.revature.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonDao extends JpaRepository<Pokemon, Integer> {
    public List<Pokemon> getPokemonByType1(String type1);

}
