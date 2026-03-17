package tests.base;

import framework.service.PokemonService;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {
    protected PokemonService pokemonService;

    @BeforeEach
    void setup() {
        pokemonService = new PokemonService();
    }
}
