package emsi.moncef.tp_graphql.repository;

import emsi.moncef.tp_graphql.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
