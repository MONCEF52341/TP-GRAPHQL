package emsi.moncef.tp_graphql.dto;

import emsi.moncef.tp_graphql.enums.Genre;

public record EtudiantDTO (String nom,
                           String prenom,
                           Genre genre,
                           Long centreId) {

}
