package guru.springframework.controllers;

import guru.springframework.RecipeRepository.CategoryRepository;
import guru.springframework.RecipeRepository.UnitOfMeasureRepository;
import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

    private CategoryRepository cr;
    private UnitOfMeasureRepository ur;

    public IndexController(CategoryRepository cr,
        UnitOfMeasureRepository ur) {
        this.cr = cr;
        this.ur = ur;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Category> categoryOptional = cr.findByDescription("Italian");
        Optional<UnitOfMeasure> unitOfMeasureOptional = ur.findByDescription("Teaspoon");


        System.out.println("Cat optional :"+categoryOptional);
        System.out.println("Cat optionalGet :"+categoryOptional.get());
        System.out.println("Cat id is :"+categoryOptional.get().getId());
        System.out.println("UOM id is :"+unitOfMeasureOptional.get().getId());

        return "index";

    }
}
