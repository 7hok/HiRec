package his.rec.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import his.rec.model.Record;
import his.rec.service.RecordService;
import his.rec.utils.GlobalFunction;

@RestController
@RequestMapping("/record")
public class RecordController {
    @Autowired
    private RecordService recordService;
    @GetMapping("")
    public Object findRecord(){
         return new ResponseEntity<>(GlobalFunction.getResponseBody("Data get All successfully", recordService.findAllRecord()),HttpStatus.ACCEPTED);
       
        }

     @PostMapping("")
    public ResponseEntity<Map<String,Object>> saveCategory(@RequestBody Record record){
        return new ResponseEntity<>(GlobalFunction.getResponseBody("Data", recordService.insertRecord(record)),HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String,Object>> findById(@PathVariable Integer id){
        return new ResponseEntity<>(GlobalFunction.getResponseBody("Data is successfuclly",recordService.findById(id)),HttpStatus.ACCEPTED);
        
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>> deleteCategory(@PathVariable Integer id){
        Record record=recordService.deleteRecord(id);
        if(record==null){
            return new ResponseEntity<>(GlobalFunction.getResponseBody("delete fail", record),HttpStatus.NOT_MODIFIED);
        }
        return new ResponseEntity<>(GlobalFunction.getResponseBody("delete successfully", record),HttpStatus.ACCEPTED);
    }
    
}