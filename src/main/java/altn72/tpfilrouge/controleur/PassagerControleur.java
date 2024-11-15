package altn72.tpfilrouge.controleur;

import altn72.tpfilrouge.modele.Passager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Classe responsable de l'aiguillage
 * C'est notre tour de contrôle
 *
 * @author Jacques Augustin
 */
@RestController
public class PassagerControleur {

    @Autowired  // Injection de dépendance
    private PassagerService passagerService;

    @GetMapping("/passagers")
    // La méthode ci-dessous est ce que l'on appelle un endpoint car elle peut être appelée
    // en ajoutant /passagers à l'url de base de l'application
    public List<Passager> afficherInfosPassagers(){

//        return List.of(
//                new Passager_V0(1,"ACHVAR", "Didier","RF101010"),
//                new Passager_V0(2,"AUGUSTIN","Jacques","RF123456"));

        return passagerService.getTousLesPassagers();
    }
}
