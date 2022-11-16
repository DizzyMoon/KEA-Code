package com.example.pokedexpogchamp.repository;


import com.example.pokedexpogchamp.pokemon.Pokemon;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

@Repository
public class PokedexRepository {

    public List<Pokemon> pokemonList = new LinkedList<Pokemon>();

    public List<Pokemon> getAll() {
        try {

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pokedex",
                    "root", "root"
            );

            PreparedStatement psts = conn.prepareStatement("SELECT * FROM pokemon");
            ResultSet resultSet = psts.executeQuery();

            while(resultSet.next()){
                int pokedexNumber = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int speed = resultSet.getInt(3);
                int specialDefence = resultSet.getInt(4);
                int specialAttack = resultSet.getInt(5);
                int defence = resultSet.getInt(6);
                int attack = resultSet.getInt(7);
                int hp = resultSet.getInt(8);
                String primaryType = resultSet.getString(9);
                String secondaryType = resultSet.getString(10);
                pokemonList.add(new Pokemon(pokedexNumber, name, speed, specialDefence, specialAttack, defence, attack, hp, primaryType, secondaryType));
                System.out.println(pokedexNumber + name + speed + specialDefence + specialAttack + defence + attack + hp + primaryType + secondaryType);
            }

            return pokemonList;

        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
            return null;

        }
    }
}
