package decola.tech.desafio_cardapio.food;

import decola.tech.desafio_cardapio.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Long> {
}
