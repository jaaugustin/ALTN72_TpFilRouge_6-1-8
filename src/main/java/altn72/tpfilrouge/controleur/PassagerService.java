package altn72.tpfilrouge.controleur;

import altn72.tpfilrouge.modele.Passager;
import altn72.tpfilrouge.modele.PassagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Rôles principaux de cette classe :
 * a) courroie de transmission entre la couche "V" de la couche "M"
 * b) contiendra le code métier
 *
 * @author Jacques Augustin
 */
@Service
public class PassagerService {

    /**
     * Injection de dépendance
     * Cette façon de faire (appliquer l'annotation directement sur l'attribut)
     * sera modifiée un peu plus loin dans le TP
     * pour respecter les bonnes pratiques liées à l'injection de dépendance
     */
    @Autowired
    private PassagerRepository passagerRepository;

    public List<Passager> getTousLesPassagers(){
        return passagerRepository.findAll();
    }


}
