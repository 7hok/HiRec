package his.rec.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import his.rec.model.Category;
import his.rec.service.CategoryService;
import his.rec.utils.GlobalFunction;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("")
    public List<Category> findAll(){
        return categoryService.findAll();
    }
    @PostMapping("")
    public ResponseEntity<Map<String,Object>> saveCategory(@RequestBody Category category){
        return new ResponseEntity<>(GlobalFunction.getResponseBody("Data", categoryService.saveCategory(category)),HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String,Object>> findById(@PathVariable Integer id){
        return new ResponseEntity<>(GlobalFunction.getResponseBody("Data is successfuclly", categoryService.findById(id)),HttpStatus.ACCEPTED);
        
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>> deleteCategory(@PathVariable Integer id){
        Category category=categoryService.delecCategory(id);
        if(category==null){
            return new ResponseEntity<>(GlobalFunction.getResponseBody("delete fail", category),HttpStatus.NOT_MODIFIED);
        }
        return new ResponseEntity<>(GlobalFunction.getResponseBody("delete successfully", category),HttpStatus.ACCEPTED);
    }
    
}