package decola.tech.desafio_cardapio.controller;

import decola.tech.desafio_cardapio.Food;
import decola.tech.desafio_cardapio.food.FoodRepository;
import decola.tech.desafio_cardapio.food.FoodRequestDTO;
import decola.tech.desafio_cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;
    @CrossOrigin(origins = "*" , allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }
    @GetMapping
    public List<FoodResponseDTO> getAll (){

    List<FoodResponseDTO> foodList;
        foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;

    }
}
