package julia.schleien.Cookbook.service;

import julia.schleien.Cookbook.model.InformationEntity;
import julia.schleien.Cookbook.repository.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @autor Julia Schleien
 * @version 1.0
 */
@Service
public class InformationFindByIdService {

    @Autowired
    private InformationRepository informationRepository;

    public InformationEntity findById(long id) {
        return this.informationRepository.findById(id).get();
    }
}
