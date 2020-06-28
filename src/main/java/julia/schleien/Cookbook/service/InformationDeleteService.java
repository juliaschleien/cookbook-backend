package julia.schleien.Cookbook.service;

import julia.schleien.Cookbook.repository.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Julia Schleien
 * @version 1.0
 */
@Service
public class InformationDeleteService {

    @Autowired
    private InformationRepository informationRepository;

    public void delete(long id) {
        this.informationRepository.deleteById(id);
    }
}
