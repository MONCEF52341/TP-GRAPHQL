package emsi.moncef.tp_graphql;

import emsi.moncef.tp_graphql.model.Centre;
import emsi.moncef.tp_graphql.model.Etudiant;
import emsi.moncef.tp_graphql.repository.CentreRepository;
import emsi.moncef.tp_graphql.enums.Genre;
import emsi.moncef.tp_graphql.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpGraphQlApplication implements CommandLineRunner {
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    CentreRepository centreRepository;
    public static void main(String[] args) {
        SpringApplication.run(TpGraphQlApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Centre centre1 = Centre.builder()
                .nom("Maarif").adresse("Biranzarane").build();
        centreRepository.save(centre1);
        Centre centre2 = Centre.builder()
                .nom("Oranges").adresse("Oulfa").build();
        centreRepository.save(centre2);
        Etudiant et1 = Etudiant.builder()
                .nom("Adnani").prenom("Brahim").genre(Genre.HOMME)
                .centre(centre1).build();
        etudiantRepository.save(et1);
    }
}
