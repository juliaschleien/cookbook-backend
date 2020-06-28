package julia.schleien.Cookbook.repository;

import julia.schleien.Cookbook.model.InformationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Julia Schleien
 * @version 1.0
 */
@Repository
public interface InformationRepository extends CrudRepository<InformationEntity, Long> {
}

