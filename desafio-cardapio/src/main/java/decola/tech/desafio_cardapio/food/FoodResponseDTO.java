package decola.tech.desafio_cardapio.food;

import decola.tech.desafio_cardapio.Food;

public record FoodResponseDTO (Long id, String title, String image, Integer price) {
    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }

}