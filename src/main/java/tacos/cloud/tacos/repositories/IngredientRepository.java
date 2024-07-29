package tacos.cloud.tacos.repositories;
 
import java.util.Optional;
 
import tacos.cloud.tacos.domain.Ingredient;
 
public interface IngredientRepository {
 
  Iterable<Ingredient> findAll();
  
  Optional<Ingredient> findById(String id);
  
  Ingredient save(Ingredient ingredient);
  
}