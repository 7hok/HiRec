package his.rec.repository;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import his.rec.model.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record,Integer>{
    // @Query("SELECT * FROM public.record")
    // public List<Record> queryBetweenDate();
    
    
}