package his.rec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import his.rec.model.Record;
import his.rec.repository.RecordRepository;

@Service
public class RecordService {
    @Autowired
    private RecordRepository recordRepository;

    public Record insertRecord(Record record){
        return recordRepository.save(record);
    }

    public List<Record> findAllRecord(){
        return recordRepository.findAll();
    }

    public Optional<Record> findById(Integer id){
        return recordRepository.findById(id);
    }

    public Record deleteRecord(Integer id){
        Record record= recordRepository.getOne(id);
        if(record==null){
            return null;
        }
        else{
            record.setStatus(0);
            return recordRepository.save(record);
        }
         
     }
    
}