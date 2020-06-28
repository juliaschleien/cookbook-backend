package julia.schleien.Cookbook.service;

import julia.schleien.Cookbook.model.InformationEntity;
import julia.schleien.Cookbook.repository.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Julia Schleien
 * @version 1.0
 */
@Service
public class InformationFindAllService {

    @Autowired
    private InformationRepository informationRepository;

    public List<InformationEntity> findAll() {
        return (List<InformationEntity>) this.informationRepository.findAll();
    }
}
