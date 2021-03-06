package julia.schleien.Cookbook.service;

import julia.schleien.Cookbook.model.InformationEntity;
import julia.schleien.Cookbook.repository.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Julia Schleien
 * @version 1.0
 */
@Service
public class InformationSaveService {

    @Autowired
    private InformationRepository informationRepository;

    public InformationEntity save(InformationEntity informationEntity) {
        return this.informationRepository.save(informationEntity);
    }
}

