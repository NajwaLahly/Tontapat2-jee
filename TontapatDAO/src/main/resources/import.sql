INSERT INTO `espece` (nom) VALUES ('Équidés');
INSERT INTO `espece` (nom) VALUES ('Bovins');
INSERT INTO `espece` (nom) VALUES ('Ovins');
INSERT INTO `espece` (nom) VALUES ('Caprins');

INSERT INTO `race` (nom, espece_id_espece) VALUES ('Arabe', '1');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('Pur-sang', '1');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('Shetland', '1');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('Angus', '2');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('Holstein', '2');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('Hereford', '2');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('Suffolk', '3');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('Texel', '3');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('Vendéen', '3');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('Alpine', '4');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('Saanen', '4');
INSERT INTO `race` (nom, espece_id_espece) VALUES ('Poitevine', '4');

INSERT INTO `type_utilisateur` (nom) VALUES ('Particulier');
INSERT INTO `type_utilisateur` (nom) VALUES ('Entreprise');
INSERT INTO `type_utilisateur` (nom) VALUES ('Collectivité');
INSERT INTO `type_utilisateur` (nom) VALUES ('Association');

INSERT INTO `utilisateur` (adresse_lat, adresse_long , adresse_voie, carte_cvc, carte_expiration, carte_numero, date_inscription, date_naissance, email, mot_de_passe, nom, numero_telephone, paypal_email, prenom, raison_sociale, texte_presentation, virement_bic, virement_iban, typeUtilisateur_id_type_utilisateur) VALUES ('49.19947182095012','2.5200215043945473', '6 Voie Communale Ferme du Courtillet', '871', '2024-08-30','1845364985437619','2021-04-02','1957-03-24','robert.legrand@wanadoo.fr','azerty','Legrand','0375869412','robert.legrand@wanadoo.fr','Robert', 'particulier/berger', 'Vous pouvez me faire confiance','RRSDIFEUF8UEY','FR763000100794123456789018500794', '1');
INSERT INTO `utilisateur` (adresse_lat, adresse_long , adresse_voie, carte_cvc, carte_expiration, carte_numero, date_inscription, date_naissance, email, mot_de_passe, nom, numero_telephone, paypal_email, prenom, raison_sociale, texte_presentation, virement_bic, virement_iban, typeUtilisateur_id_type_utilisateur) VALUES ('49.00796762076816','2.9402485551757973', 'Chemin Rural du Noyer Thomas', '834', '2024-11-05','2584367925483666','2021-05-24','1989-03-07','jean.gaspard@orange.fr','chaussette','Gaspard','0345668791','jean.gaspard@orange.fr','Jean','Les Gros Moutons','moins tu dors, plus tu es fort','GIEZJGUIZEHFUH','FR79485298725972579257927868','2');
INSERT INTO `utilisateur` (adresse_lat, adresse_long , adresse_voie, carte_cvc, carte_expiration, carte_numero, date_inscription, date_naissance, email, mot_de_passe, nom, numero_telephone, paypal_email, prenom, raison_sociale, texte_presentation, virement_bic, virement_iban, typeUtilisateur_id_type_utilisateur) VALUES ('49.50452078654965','1.9339695634765786', 'Bois de Haucourt', '435', '2025-06-27','8432976425558463','2021-06-11','1977-01-21','youri.zapoi@wanadoo.fr','manteau','Zapoi','0333258874','youri.zapoi@wanadoo.fr','Youri','La machine bio','Venez voir mes bêtes','RHGEUFHUEFZZ','FR9629265942984524895242485242','2');
INSERT INTO `utilisateur` (adresse_lat, adresse_long , adresse_voie, carte_cvc, carte_expiration, carte_numero, date_inscription, date_naissance, email, mot_de_passe, nom, numero_telephone, paypal_email, prenom, raison_sociale, texte_presentation, virement_bic, virement_iban, typeUtilisateur_id_type_utilisateur) VALUES ('48.966062064184236','3.0216160478515786', 'Rue Marcel Neyrat', '753', '2025-03-21','5649254254258444','2021-06-15','1971-01-21','jacqueline.treni@gmail.fr','hello','Treni','0375462845','jacqueline.treni@gmail.fr','Jacqueline','particulier/propiétaire terrain','Les espaces verts sont ma vie','UJFHEZUFHEZUY','FR96291751872587579127472','1');
INSERT INTO `utilisateur` (adresse_lat, adresse_long , adresse_voie, carte_cvc, carte_expiration, carte_numero, date_inscription, date_naissance, email, mot_de_passe, nom, numero_telephone, paypal_email, prenom, raison_sociale, texte_presentation, virement_bic, virement_iban, typeUtilisateur_id_type_utilisateur) VALUES ('48.83832616391294','3.0957737626953286', 'Ferme du Charnoy', '154', '2024-03-25','8757286876786448','2021-07-05','1982-01-21','marie.levasseur@gmail.fr','secret','Levasseur','0354285417','marie.levasseur@gmail.fr','Marie','particulier/propiétaire terrain','la plus belle ferme','FIEZJFIZEJFUCE','FR975785781679619785987','1');
INSERT INTO `utilisateur` (adresse_lat, adresse_long , adresse_voie, carte_cvc, carte_expiration, carte_numero, date_inscription, date_naissance, email, mot_de_passe, nom, numero_telephone, paypal_email, prenom, raison_sociale, texte_presentation, virement_bic, virement_iban, typeUtilisateur_id_type_utilisateur) VALUES ('48.74197033276085','3.1297627153320473', '18 Rue de la Chapelle', '526', '2023-01-12','7613175751875478','2021-07-28','1986-07-02','nathalie.renouie@gmail.fr','cadeau','Renouie','0379679584','nathalie.renouie@gmail.fr','Nathalie','Zone verte eco+','espaces vert en besoin !','ZOIEJGEZIDHUEZ','FR73287827846287795452','3');

INSERT INTO `type_vegetation` (nom) VALUES ('Herbacée');
INSERT INTO `type_vegetation` (nom) VALUES ('Arbustive');
INSERT INTO `type_vegetation` (nom) VALUES ('Arborée');
INSERT INTO `type_vegetation` (nom) VALUES ('Broussailles');
INSERT INTO `type_vegetation` (nom) VALUES ('Ronciers');

INSERT INTO `type_intervention` (nom) VALUES ('Clôture endommagée');
INSERT INTO `type_intervention` (nom) VALUES ('Abri endommagé');
INSERT INTO `type_intervention` (nom) VALUES ('Abreuvoir endommagé');
INSERT INTO `type_intervention` (nom) VALUES ('Animal blessé');
INSERT INTO `type_intervention` (nom) VALUES ('Animal mort');
INSERT INTO `type_intervention` (nom) VALUES ('Animal manquant');

INSERT INTO `type_cloture` (nom) VALUES ('Clôture fil grillagé');
INSERT INTO `type_cloture` (nom) VALUES ('Clôture électrique');
INSERT INTO `type_cloture` (nom) VALUES ('Panneau grillage rigide');
INSERT INTO `type_cloture` (nom) VALUES ('Ganivelle');

INSERT INTO `type_abri` (nom) VALUES ('Abri de prairie mobile');
INSERT INTO `type_abri` (nom) VALUES ('Abri en bois');
INSERT INTO `type_abri` (nom) VALUES ('Abri en acier');
INSERT INTO `type_abri` (nom) VALUES ('Abri en béton');

INSERT INTO `type_abreuvoir` (nom) VALUES ('Bac à eau');
INSERT INTO `type_abreuvoir` (nom) VALUES ('Râtelier');
INSERT INTO `type_abreuvoir` (nom) VALUES ('Auge');

INSERT INTO `troupeau` (adresse_lat, adresse_long, adresse_voie, date_ajout, date_disponibilite, description, divisibilite, effectif, nom, race_id_race, utilisateur_id_utilisateur) VALUES ('49.19947182095012','2.5200215043945473', '6 Voie Communale Ferme du Courtillet','2021-04-04','2021-04-04','Là où elles passent, l herbe ne repoussent plus', true, '500','Les chèvres Attila','10','1');
INSERT INTO `troupeau` (adresse_lat, adresse_long, adresse_voie, date_ajout, date_disponibilite, description, divisibilite, effectif, nom, race_id_race, utilisateur_id_utilisateur) VALUES ('49.19947182095012','2.5200215043945473', '6 Voie Communale Ferme du Courtillet','2021-04-08','2021-06-10','Transforme une prairie rayonnant de vie en un désert sans vie', false, '200','Les faiseuses de désert','11','1');
INSERT INTO `troupeau` (adresse_lat, adresse_long, adresse_voie, date_ajout, date_disponibilite, description, divisibilite, effectif, nom, race_id_race, utilisateur_id_utilisateur) VALUES ('49.00796762076816','2.9402485551757973', 'Chemin Rural du Noyer Thomas','2021-05-30','2021-05-30','Ces vaches seront discrète et éfficace', false, '50','Les vaches ninjas','4','2');
INSERT INTO `troupeau` (adresse_lat, adresse_long, adresse_voie, date_ajout, date_disponibilite, description, divisibilite, effectif, nom, race_id_race, utilisateur_id_utilisateur) VALUES ('49.50452078654965','1.9339695634765786', 'Bois de Haucourt','2021-06-11','2021-06-15','Ces juments seront un choix idéal pour prairie de grande envergure', false, '20','Les juments grises','3','3');

INSERT INTO `terrain` (adresse_lat, adresse_long, adresse_voie, date_ajout, description, nom, superficie, utilisateur_id_utilisateur) VALUES ('48.966062064184236','3.0216160478515786', 'Rue Marcel Neyrat','2021-06-15','Vaste terrain avec une majeur partie dans les collines','Les vertes collines', '125', '4');
INSERT INTO `terrain` (adresse_lat, adresse_long, adresse_voie, date_ajout, description, nom, superficie, utilisateur_id_utilisateur) VALUES ('48.83832616391294','3.0957737626953286', 'Ferme du Charnoy','2021-07-06','Terrain à l abandon ayant besoin d ordre','La jungle', '200', '5');
INSERT INTO `terrain` (adresse_lat, adresse_long, adresse_voie, date_ajout, description, nom, superficie, utilisateur_id_utilisateur) VALUES ('48.74197033276085','3.1297627153320473', '18 Rue de la Chapelle','2021-07-29','Petite prairie qui accueillerait avec plaisir un troupeau pour sa gestion','La prairie chatoyante', '50', '6');
INSERT INTO `terrain` (adresse_lat, adresse_long, adresse_voie, date_ajout, description, nom, superficie, utilisateur_id_utilisateur) VALUES ('48.966062064184236','3.0216160478515786', 'Rue Marcel Neyrat','2021-06-15','petit terrain à tondre','Le petit', '25', '4');


INSERT INTO `seuil_tarification` (coef_installation, coef_intervention, nom, prix_bete_jour, prix_km) VALUES ('0.5', '0.5', 'Minimum', '1', '.10');
INSERT INTO `seuil_tarification` (coef_installation, coef_intervention, nom, prix_bete_jour, prix_km) VALUES ('1.5', '1.5', 'Maximum', '10', '1');

INSERT INTO `condition_annulation` (delai_jours, nom, pourcentage_facturation) VALUES ('2', 'Flexibles', '0.20');
INSERT INTO `condition_annulation` (delai_jours, nom, pourcentage_facturation) VALUES ('5', 'Modérées', '0.50');
INSERT INTO `condition_annulation` (delai_jours, nom, pourcentage_facturation) VALUES ('10', 'Strictes', '0.80');

INSERT INTO `motif_annulation` (nom) VALUES ('Non-paiement');
INSERT INTO `motif_annulation` (nom) VALUES ('Rupture amiable');
INSERT INTO `motif_annulation` (nom) VALUES ('Danger/risque pour le troupeau');
INSERT INTO `motif_annulation` (nom) VALUES ('Déménagement');

INSERT INTO `motif_reclamation` (nom) VALUES ('Mauvais traitement des animaux');
INSERT INTO `motif_reclamation` (nom) VALUES ('Non-conformité du terrain');
INSERT INTO `motif_reclamation` (nom) VALUES ('Non-respect des actions de suivi');

INSERT INTO `annonce` (date_ajout, date_debut, date_fin, description, installation_assuree, nom, terrain_id_terrain) VALUES ('2021-06-15', '2021-06-15', '2021-08-15', 'je recherche un troupeau pour une tonte de 2 mois', false,'annonce pour les vertes collines', '1');
INSERT INTO `annonce` (date_ajout, date_debut, date_fin, description, installation_assuree, nom, terrain_id_terrain) VALUES ('2021-07-06', '2021-07-06', '2021-12-06', 'je recherche un troupeau pour une tonte de 5 mois', false,'annonce pour la jungle', '2');
INSERT INTO `annonce` (date_ajout, date_debut, date_fin, description, installation_assuree, nom, terrain_id_terrain) VALUES ('2021-07-29', '2021-07-29', '2021-10-29', 'je recherche un troupeau pour une tonte de 3 mois', true,'annonce pour la prairie chatoyante', '3');
INSERT INTO `annonce` (date_ajout, date_debut, date_fin, description, installation_assuree, nom, terrain_id_terrain) VALUES ('2021-06-15', '2021-06-15', '2021-08-15', 'je recherche un troupeau pour une tonte de 2 mois', false,'annonce pour le petit', '4');


INSERT INTO `offre` (date_ajout, date_debut, date_fin, description, frequence_intervention, installation_assuree, nom, prix_bete_jour, prix_installation, prix_intervention, prix_km, zone_couverture,conditionAnnulation_id_condition_annulation, troupeau_id_troupeau) VALUES ('2021-04-04', '2021-04-04', '2022-10-29', 'je recherche un terrain pour mon troupeau','2', true,'offre pour les chèvre Attila','2','1000','20','.5','60','1', '1');
INSERT INTO `offre` (date_ajout, date_debut, date_fin, description, frequence_intervention, installation_assuree, nom, prix_bete_jour, prix_installation, prix_intervention, prix_km, zone_couverture,conditionAnnulation_id_condition_annulation, troupeau_id_troupeau) VALUES ('2021-04-08', '2021-04-08', '2022-06-10', 'je recherche un terrain pour mon troupeau','2', true,'offre pour les faiseuses de désert','3','800','20','.8','200','1', '2');
INSERT INTO `offre` (date_ajout, date_debut, date_fin, description, frequence_intervention, installation_assuree, nom, prix_bete_jour, prix_installation, prix_intervention, prix_km, zone_couverture,conditionAnnulation_id_condition_annulation, troupeau_id_troupeau) VALUES ('2021-05-30', '2021-05-30', '2022-05-30', 'je recherche un terrain pour mon troupeau','3', false,'offre pour les vaches ninjas','4','1500','30','.4','300','1', '3');

INSERT INTO `prestation` (date_apport_troupeau, date_debut, date_debut_desinstallation,date_debut_installation, date_fin, date_fin_desinstallation, date_fin_installation,date_recuperation_troupeau, date_reservation, date_validation, frequence_intervention,num_reservation, prix_convenu, type_installation, conditionAnnulation_id_condition_annulation, offre_id_offre, terrain_id_terrain, troupeau_id_troupeau) VALUES ('2021-07-05', '2021-06-30', '2021-08-30', '2021-06-30','2021-09-05','2021-09-02', '2021-07-02', '2021-08-25','2021-06-20','2021-06-21','2','858487','8500',true,'1','1','1','1');

INSERT INTO `morphologie` (nom) VALUES ('Pente');
INSERT INTO `morphologie` (nom) VALUES ('Vallonnement');
INSERT INTO `morphologie` (nom) VALUES ('Ligne de crête');
INSERT INTO `morphologie` (nom) VALUES ('Plat');


INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('1','2');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('1','4');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('2','4');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('2','4');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('3','1');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('3','2');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('3','4');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('1','1');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('4','1');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('4','2');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('4','3');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('4','4');

INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('1','1');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('1','2');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('1','3');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('1','4');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('2','1');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('2','2');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('2','4');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('3','1');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('3','4');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('3','5');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('4','1');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('4','2');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('4','4');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('4','5');

INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie) VALUES ('1','1');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie) VALUES ('1','2');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie) VALUES ('1','3');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie) VALUES ('1','4');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie) VALUES ('2','1');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie) VALUES ('2','2');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie) VALUES ('2','3');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie) VALUES ('2','4');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie) VALUES ('3','1');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie) VALUES ('3','2');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie) VALUES ('3','3');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie) VALUES ('3','4');

INSERT INTO `motif_refus_reservation` (nom) VALUES ('Mauvaise note');
INSERT INTO `motif_refus_reservation` (nom) VALUES ('Terrain/troupeau inadapté');

INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('1','1');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('1','2');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('1','3');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('1','4');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('1','5');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('2','1');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('2','2');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('2','3');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('2','4');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('2','5');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('3','1');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('3','2');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('3','3');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('3','4');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('3','5');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('4','1');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('4','2');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('4','3');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('4','4');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation) VALUES ('4','5');

INSERT INTO `terrain_type_abreuvoir` (id_terrain, id_type_abreuvoir) VALUES ('1','1');

INSERT INTO `terrain_type_cloture` (id_terrain, id_type_cloture) VALUES ('1','4');

INSERT INTO `terrain_type_abri` (id_terrain, id_type_abri) VALUES ('1','4');