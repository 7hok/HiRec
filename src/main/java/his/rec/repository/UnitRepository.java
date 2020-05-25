package his.rec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import his.rec.model.Unit;

public interface UnitRepository extends JpaRepository<Unit,Integer> {
    
}