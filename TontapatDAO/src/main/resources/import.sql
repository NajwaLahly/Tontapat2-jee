INSERT INTO `espece` VALUES (1,'Ovins');
INSERT INTO `espece` VALUES (2,'Caprins');
INSERT INTO `espece` VALUES (3,'Bovins');
INSERT INTO `espece` VALUES (4,'Équidés');

INSERT INTO `race` VALUES (1,'Mouton d''Ouessant',1);
INSERT INTO `race` VALUES (2,'Solognot',1);
INSERT INTO `race` VALUES (3,'Landes de Bretagne',1);
INSERT INTO `race` VALUES (4,'Chèvre des Fossés',2);
INSERT INTO `race` VALUES (5,'Poitevine',2);
INSERT INTO `race` VALUES (6,'Chèvre de Lorraine',2);
INSERT INTO `race` VALUES (7,'Chèvre naine',2);
INSERT INTO `race` VALUES (8,'Bretonne Pie Noir',3);
INSERT INTO `race` VALUES (9,'Nantaise',3);
INSERT INTO `race` VALUES (10,'Highland Cattle',3);
INSERT INTO `race` VALUES (11,'Âne du Cotentin',4);
INSERT INTO `race` VALUES (12,'Grand Noir du Berry',4);
INSERT INTO `race` VALUES (13,'Camargue',4);
INSERT INTO `race` VALUES (14,'Landais',4);
INSERT INTO `race` VALUES (15,'Trait Poitevin',4);
INSERT INTO `race` VALUES (16,'Arabe',4);
INSERT INTO `race` VALUES (17,'Pur-sang',4);
INSERT INTO `race` VALUES (18,'Shetland',4);
INSERT INTO `race` VALUES (19,'Angus',3);
INSERT INTO `race` VALUES (20,'Holstein',3);
INSERT INTO `race` VALUES (21,'Hereford',3);
INSERT INTO `race` VALUES (22,'Suffolk',1);
INSERT INTO `race` VALUES (23,'Texel',1);
INSERT INTO `race` VALUES (24,'Vendéen',1);
INSERT INTO `race` VALUES (25,'Alpine',2);
INSERT INTO `race` VALUES (26,'Saanen',2);
INSERT INTO `race` VALUES (27,'Poitevine',2);

INSERT INTO `type_utilisateur` (nom) VALUES ('Particulier');
INSERT INTO `type_utilisateur` (nom) VALUES ('Entreprise');
INSERT INTO `type_utilisateur` (nom) VALUES ('Collectivité');
INSERT INTO `type_utilisateur` (nom) VALUES ('Association');

INSERT INTO `utilisateur` VALUES (1,49.1995,2.52002,'6 Voie Communale Ferme du Courtillet','871','2024-08-30','1845364985437619',NULL,'2021-04-02',NULL,'1957-03-24','robert.legrand@wanadoo.fr','azerty','Legrand','0375869412','robert.legrand@wanadoo.fr',NULL,'Robert','Particulier/berger','Vous pouvez me faire confiance','RRSDIFEUF8UEY','FR763000100794123456789018500794',1);
INSERT INTO `utilisateur` VALUES (2,49.008,2.94025,'Chemin Rural du Noyer Thomas','834','2024-11-05','2584367925483666',NULL,'2021-05-24',NULL,'1989-03-07','jean.gaspard@orange.fr','chaussette','Gaspard','0345668791','jean.gaspard@orange.fr',NULL,'Jean','Les Gros Moutons','moins tu dors, plus tu es fort','GIEZJGUIZEHFUH','FR79485298725972579257927868',2);
INSERT INTO `utilisateur` VALUES (3,49.5045,1.93397,'Bois de Haucourt','435','2025-06-27','8432976425558463',NULL,'2021-06-11',NULL,'1977-01-21','youri.zapoi@wanadoo.fr','manteau','Zapoi','0333258874','youri.zapoi@wanadoo.fr',NULL,'Youri','La machine bio','Venez voir mes bêtes','RHGEUFHUEFZZ','FR9629265942984524895242485242',2);
INSERT INTO `utilisateur` VALUES (4,48.9661,3.02162,'Rue Marcel Neyrat','753','2025-03-21','5649254254258444',NULL,'2021-06-15',NULL,'1971-01-21','jacqueline.treni@gmail.fr','hello','Treni','0375462845','jacqueline.treni@gmail.fr',NULL,'Jacqueline','Particulier/propiétaire terrain','Les espaces verts sont ma vie','UJFHEZUFHEZUY','FR96291751872587579127472',1);
INSERT INTO `utilisateur` VALUES (5,48.8383,3.09577,'Ferme du Charnoy','154','2024-03-25','8757286876786448',NULL,'2021-07-05',NULL,'1982-01-21','marie.levasseur@gmail.fr','secret','Levasseur','0354285417','marie.levasseur@gmail.fr',NULL,'Marie','Particulier/propiétaire terrain','La plus belle ferme','FIEZJFIZEJFUCE','FR975785781679619785987',1);
INSERT INTO `utilisateur` VALUES (6,48.742,3.12976,'18 Rue de la Chapelle','526','2023-01-12','7613175751875478',NULL,'2021-07-28',NULL,'1986-07-02','nathalie.renouie@gmail.fr','cadeau','Renouie','0379679584','nathalie.renouie@gmail.fr',NULL,'Nathalie','Zone verte éco+','Espaces vert en besoin !','ZOIEJGEZIDHUEZ','FR73287827846287795452',3);
INSERT INTO `utilisateur` VALUES (7,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1986-04-01','charlypichon@yahoo.fr','hello','Pichon','0354285417','charlypichon@yahoo.fr',NULL,'Charles-Henri',NULL,'Nous sommes une jeune pousse qui propose des idées de concepts à ses partenaires afin de rejoindre avec nous la formidable aventure de la startup nation ! \"Fake it until you make it !\"','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (8,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1935-08-01','rmaillette@wanadoo.fr','hello','Maillette','0354285417','rmaillette@wanadoo.fr',NULL,'Robert',NULL,'Présente dans notre beau petit village de Marliens depuis des générations, notre famille s''est spécialisée dans l''élevage de bétail. Nous avons absorbé notre dernier concurrent en lui faisant une offre qu''il na pas pu refuser.','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (9,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1951-09-15','gbouchard@wanadoo.fr','hello','Bouchard','0354285417','gbouchard@wanadoo.fr',NULL,'Gérard',NULL,'Gérard de mon prénom, les chèvres, c''est ma grande passion.','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (10,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1955-02-20','aposteur@wanadoo.fr','hello','Posteur','0354285417','aposteur@wanadoo.fr',NULL,'Alain',NULL,'Bonjour moi c''est Alain, j''aime lélevage, le jardinage, le kung-fu et ma collection de figurine My Little Poney. N''hésitez pas à me contacter pour une prestation ou pour discuter MLP.','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (11,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1964-12-05','jjrenard@wanadoo.fr','hello','Renard','0354285417','jjrenard@wanadoo.fr',NULL,'Jean-Jacques',NULL,'Appelez-moi JJ ou Renard, pour un éleveur de chèvres qui vit rue du Poulailler c''est une drôle de coïncidence non ? On va bien s''amuser.','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (12,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1992-03-29','srabiot@wanadoo.fr','hello','Rabiot','0354285417','srabiot@wanadoo.fr',NULL,'Stacy',NULL,'Salut les loulous, bienvenue sur ma Tontapage ! Je possède des moutons et des chèvres que j''envoie en paturages chez mes clients partout en Bourgogne !','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (13,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1993-06-02','bgiscard@wanadoo.fr','hello','Giscard','0354285417','bgiscard@wanadoo.fr',NULL,'Brandon',NULL,'bonjour moi cest brandon giscard éleveur collectionneur ami de la nature et des animaux envoyez-moi des propositions sil vous plait jaccepte tout tant que vous dites bonjour sil vous plait merci merci','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (14,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1963-01-21','hdupre@wanadoo.fr','hello','Dupré','0354285417','hdupre@wanadoo.fr',NULL,'Homère',NULL,'Je n''ai pas choisi la vie de la campagne, c''est la vie de la campagne qui m''a choisi.','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (15,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1976-05-29','bpicatchou@wanadoo.fr','hello','Picattes-Choux','0354285417','bpicatchou@wanadoo.fr',NULL,'Bartholomé',NULL,'Bien le bonjour, je m''inscris sur ce réseau social sur conseil d''un cousin l''autre fois on discutait et il me dit écoute Bartho je connais ce site internet où tu peux mettre ton troupeau pour l''envoyer chez les citadins et gagner de l''argent','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (16,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1995-11-05','mbigard@wanadoo.fr','hello','Bigard','0354285417','mbigard@wanadoo.fr',NULL,'Matthéo',NULL,'Amis de la verdure et des grandes étendues dégagées, mes salutations ! J''ai tout ce qu''il vous faut : des chèvres, des vaches, des moutons... Mes bêtes ne veulent qu''une seule chose : votre herbe !','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (17,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1983-01-18','jgrosjean@wanadoo.fr','hello','Grosjean','0354285417','jgrosjean@wanadoo.fr',NULL,'Jean',NULL,'Vous aimez les chèvres ? Vous n''aimez pas tondre la pelouse ? Vous allez m''adorer.','ZOIEJGEZIDHUEZ','FR73287827846287795452',3);
INSERT INTO `utilisateur` VALUES (18,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1967-11-01','josianelabute@impots.gouv.fr','hello','Labute','0354285417','josianelabute@impots.gouv.fr',NULL,'Josiane','Centre des impôts','(Voix monocorde) Bonjour, je représente le centre communal de traitement des demandes d''imposition de Châtillon-sur-Seine. Hubert étant parti à la retraite le chef m''a chargée de trouver un prestataire. Où est mon agrapheuse ?','ZOIEJGEZIDHUEZ','FR73287827846287795452',4);
INSERT INTO `utilisateur` VALUES (19,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1991-10-01','acab@voila.fr','hello','Brigand','0354285417','acab@voila.fr',NULL,'Gilbert','Amicale des Collectionneurs d''Allumettes Bicéphales','Créée en 1991, notre association regroupe les passionnés d''allumettes à deux têtes de Langres mais aussi de Perrancey-les-Vieux-Moulins, Celles-en-Bassigny, certains membres viennent même de Champigny-sous-Varennes.','ZOIEJGEZIDHUEZ','FR73287827846287795452',3);
INSERT INTO `utilisateur` VALUES (20,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1970-01-01','mairieterrefondree@wanadoo.fr','hello','Barratier','0354285417','mairieterrefondree@wanadoo.fr',NULL,'Gilles','Mairie de Terrefondrée','Commune dynamique de 61 habitants, Terrefondrée souhaite doter les jardins de sa prestigieuse mairie d''un troupeau. Le troupeau ainsi que son propriétaire pourra remporter un séjour d''une semaine dans la chambre d''hôtes de ma belle-soeur','ZOIEJGEZIDHUEZ','FR73287827846287795452',2);
INSERT INTO `utilisateur` VALUES (21,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'2019-01-01','ecopaturing@megasoft.com','hello','Guetz','0354285417','ecopaturing@megasoft.com',NULL,'Jean-Billou',NULL,'Megasoft, la petite boite d''informatique qui va détrôner les petits joueurs de la Silicon Valley, souhaite déjà impressionner ses voisins de Chanceaux avec de fiers moutons pour se délecter de nos verts pâturages.','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (22,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'2019-01-01','beberfontaine@voila.fr','hello','Fontaine','0354285417','beberfontaine@voila.fr',NULL,'Bernard',NULL,'eul''tondeuse l''est cassée et vu l''prix du gasole j''vais po la réparer donc ramène-moi tes bébêtes sur l''jardin d''moué qu''ça raccourcisse eul''plouse !','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (23,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1990-01-10','willi@williberger.fr','hello','Johnson','0354285417','willi@williberger.fr',NULL,'Willy',NULL,'Salut moi c''est Willi mais vous pouvez m''appeler Wil !','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (24,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1985-04-14','laura@msn.com','hello','Croft','0354285417','laura@msn.com',NULL,'Laura',NULL,'Rien à voir avec les jeux vidéo mais je m''y connais très bien en ce qui concerne les animaux.','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (25,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1991-03-24','tommy@outlook.fr','hello','Jerry','0354285417','tommy@outlook.fr',NULL,'Tomé',NULL,'Fils de berger élevé à la ferme, je peux vous dire que votre terrain va être tout neuf à coup sûr.','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (26,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1995-02-02','bartolome@simpson.fr','hello','Simpson','0354285417','barnaby@simpson.fr',NULL,'Barnabé',NULL,'J''ai pas grand chose à dire mis à part que vous pouvez nous faire totalement confiance.','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);
INSERT INTO `utilisateur` VALUES (27,49.1995,2.52002,NULL,'526','2024-08-30','7613175751875478',NULL,'2020-09-11',NULL,'1994-10-20','hstark@imissine.com','hello','Stark','0354285417','hstark@imissine.com',NULL,'Harissa',NULL,'C''est parti pour l''aventure en terrain étranger !','ZOIEJGEZIDHUEZ','FR73287827846287795452',1);

INSERT INTO `type_vegetation` VALUES (1,'Herbacée');
INSERT INTO `type_vegetation` VALUES (2,'Arbustive');
INSERT INTO `type_vegetation` VALUES (3,'Arborée');
INSERT INTO `type_vegetation` VALUES (4,'Broussailles');
INSERT INTO `type_vegetation` VALUES (5,'Ronciers');
INSERT INTO `type_vegetation` VALUES (6,'Grande ciguë');
INSERT INTO `type_vegetation` VALUES (7,'Colchique d''automne');
INSERT INTO `type_vegetation` VALUES (8,'Digitale pourpre');
INSERT INTO `type_vegetation` VALUES (9,'Euphorbes épurge et characias');
INSERT INTO `type_vegetation` VALUES (10,'Galéga officinal');
INSERT INTO `type_vegetation` VALUES (11,'Gui');
INSERT INTO `type_vegetation` VALUES (12,'Houx');
INSERT INTO `type_vegetation` VALUES (13,'Lauriers');
INSERT INTO `type_vegetation` VALUES (14,'Mercuriale annuelle');
INSERT INTO `type_vegetation` VALUES (15,'Milopertuis');
INSERT INTO `type_vegetation` VALUES (16,'Morelle noire');
INSERT INTO `type_vegetation` VALUES (17,'Moutarde noire');
INSERT INTO `type_vegetation` VALUES (18,'Nielle des blés');
INSERT INTO `type_vegetation` VALUES (19,'Prêle des champs');
INSERT INTO `type_vegetation` VALUES (20,'Renoncules');
INSERT INTO `type_vegetation` VALUES (21,'Séneçon jacobée');
INSERT INTO `type_vegetation` VALUES (22,'Thuyas');

INSERT INTO `type_intervention` (nom) VALUES ('Clôture endommagée');
INSERT INTO `type_intervention` (nom) VALUES ('Abri endommagé');
INSERT INTO `type_intervention` (nom) VALUES ('Abreuvoir endommagé');
INSERT INTO `type_intervention` (nom) VALUES ('Animal blessé');
INSERT INTO `type_intervention` (nom) VALUES ('Animal mort');
INSERT INTO `type_intervention` (nom) VALUES ('Animal manquant');

INSERT INTO `type_cloture` VALUES (1,'Clôture complète');
INSERT INTO `type_cloture` VALUES (2,'Clôture ovine');
INSERT INTO `type_cloture` VALUES (3,'Clôture bovine');
INSERT INTO `type_cloture` VALUES (4,'Clôture caprine');
INSERT INTO `type_cloture` VALUES (5,'Clôture équestre');

INSERT INTO `type_abri` (nom) VALUES ('Abri de prairie mobile');
INSERT INTO `type_abri` (nom) VALUES ('Abri en bois');
INSERT INTO `type_abri` (nom) VALUES ('Abri en acier');
INSERT INTO `type_abri` (nom) VALUES ('Abri en béton');

INSERT INTO `type_abreuvoir` (nom) VALUES ('Bac à eau');
INSERT INTO `type_abreuvoir` (nom) VALUES ('Râtelier');
INSERT INTO `type_abreuvoir` (nom) VALUES ('Auge');

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

INSERT INTO `terrain` (adresse_lat, adresse_long, adresse_voie, date_ajout, description, nom, superficie, utilisateur_id_utilisateur) VALUES ('47.31599472245832','4.973904249086494', 'Chemin de la Combe à la Serpent 21000 Dijon','2021-06-15','Vaste terrain avec une majeure partie dans les collines','Les vertes collines', '.250', '4');
INSERT INTO `terrain` (adresse_lat, adresse_long, adresse_voie, date_ajout, description, nom, superficie, utilisateur_id_utilisateur) VALUES ('47.16673788371554','5.247437695570869', 'Les Petites Broisses 21170 Montot','2021-07-06','Terrain à l abandon ayant besoin d ordre','La jungle', '.12', '5');
INSERT INTO `terrain` (adresse_lat, adresse_long, adresse_voie, date_ajout, description, nom, superficie, utilisateur_id_utilisateur) VALUES ('47.36337393454189','4.896973895438594', 'Parc n°2, Stand, 21370 Prenois','2021-07-29','Petite prairie qui accueillerait avec plaisir un troupeau pour sa gestion','La prairie chatoyante', '1.5', '6');
INSERT INTO `terrain` (adresse_lat, adresse_long, adresse_voie, date_ajout, description, nom, superficie, utilisateur_id_utilisateur) VALUES ('47.40019634206459','5.0382444830708595', 'Les Epoisses 21380 Messigny-et-Vantoux','2021-06-15','Petit terrain à tondre','Le petit terrain mimi', '.028', '4');
INSERT INTO `terrain` (adresse_lat, adresse_long, adresse_voie, date_ajout, description, nom, superficie, utilisateur_id_utilisateur) VALUES ('47.42280506271984','5.369239131958916', '1 Route de Champagne 21310 Oisilly','2021-06-15','Sur les bons conseils de Papa, Maman m''a également chargé de mettre son jardin aux poires en pâture. ','Le Jardin de maman', '1.6', '4');

INSERT INTO `annonce` (date_ajout, date_debut, date_fin, description, installation_assuree, nom, terrain_id_terrain) VALUES ('2021-06-15', '2021-06-15', '2021-08-15', 'je recherche un troupeau pour une tonte de 2 mois', false,'annonce pour les vertes collines', '1');
INSERT INTO `annonce` (date_ajout, date_debut, date_fin, description, installation_assuree, nom, terrain_id_terrain) VALUES ('2021-07-06', '2021-07-06', '2021-12-06', 'je recherche un troupeau pour une tonte de 5 mois', false,'annonce pour la jungle', '2');
INSERT INTO `annonce` (date_ajout, date_debut, date_fin, description, installation_assuree, nom, terrain_id_terrain) VALUES ('2021-07-29', '2021-07-29', '2021-10-29', 'je recherche un troupeau pour une tonte de 3 mois', true,'annonce pour la prairie chatoyante', '3');
INSERT INTO `annonce` (date_ajout, date_debut, date_fin, description, installation_assuree, nom, terrain_id_terrain) VALUES ('2021-06-15', '2021-06-15', '2021-08-15', 'je recherche un troupeau pour une tonte de 2 mois', false,'annonce pour le petit', '4');

INSERT INTO `troupeau` (adresse_lat, adresse_long, adresse_voie, date_ajout, date_disponibilite, description, divisibilite, effectif, nom, race_id_race, utilisateur_id_utilisateur) VALUES ('47.334619288733755','5.035309610716516', '16 Rue Antoine Le Moiturier 21000 Dijon','2021-04-04','2021-04-04','Là où elles passent, l''herbe ne repousse plus', true, '500','Les chèvres d''Attila','25','1');
INSERT INTO `troupeau` (adresse_lat, adresse_long, adresse_voie, date_ajout, date_disponibilite, description, divisibilite, effectif, nom, race_id_race, utilisateur_id_utilisateur) VALUES ('47.32312960943047','5.004427569017', '152 Quai Nicolas Rolin 21000 Dijon','2021-04-08','2021-06-10','Transforme une prairie rayonnante de vie en un désert aride', false, '200','Les faiseuses de désert','26','1');
INSERT INTO `troupeau` (adresse_lat, adresse_long, adresse_voie, date_ajout, date_disponibilite, description, divisibilite, effectif, nom, race_id_race, utilisateur_id_utilisateur) VALUES ('47.12003459733698','4.9922804930886455', 'Rue de Citeaux 21700 Agencourt','2021-05-30','2021-05-30','Ces vaches seront discrètes et efficaces', false, '50','Les vaches ninjas','19','2');
INSERT INTO `troupeau` (adresse_lat, adresse_long, adresse_voie, date_ajout, date_disponibilite, description, divisibilite, effectif, nom, race_id_race, utilisateur_id_utilisateur) VALUES ('47.21619857417899','5.183992388256473', 'Rue Saint-Éloi 21110 Marliens','2021-06-11','2021-06-15','Ces juments seront un choix idéal pour prairies de grande envergure', false, '20','Les juments grises','16','3');

INSERT INTO `troupeau` VALUES (5,'47.0459016992357','4.796569278383358','La Grande Chatelaine 21200 Beaune','2020-11-10','2020-11-25',NULL,NULL,'Les moumoutes à Robert, c''est 40 bêtes avec un coeur gros comme ça, prêtes à manger l''herbe de vos terrains pour votre plus grand paisir.',true,40,'Les moumoutes à Robert',1,8);
INSERT INTO `troupeau` VALUES (6,'47.09267004470055','4.742186987692221','Route de Crépey 21360 Bessey-en-Chaume','2020-11-10','2021-01-10',NULL,NULL,'Mes biquettes, mes fiertés, mes bébés ! Faites pas attention à la petite grise elle fait des tours de tête complets et marche sur ses deux pattes arrières mais c''est ma meilleure gagneuse.',true,15,'Mes biquettes',4,9);
INSERT INTO `troupeau` VALUES (7,'47.29174692441612','5.374024460414608','Le Bief aux Renards 21760 Lamarche-sur-Saône','2020-11-10','2021-01-10',NULL,NULL,'Mes bretonnes Pie Noir sont les plus heureuses du monde, et comme on dit chez moi, vache qui rit, vache à moitié dans... non.',true,8,'Mes vachettes',8,10);
INSERT INTO `troupeau` VALUES (8,'47.2605339445224','5.248780554482897','3 Chemin de la Corvée 21110 Labergement-Foigney','2020-11-10','2021-01-10',NULL,NULL,'\"Maman regarde les zolis sevaux !\" Ca fait toujours son petit effet.',false,4,'Mes quatre chevaux',12,11);
INSERT INTO `troupeau` VALUES (9,'47.417694515742085','5.588141753377154','En la Friche 70100 Gray','2020-11-10','2021-01-10',NULL,NULL,'Ils sont frais mes Solognot !',true,16,'16 moutons bien roulés',2,12);
INSERT INTO `troupeau` VALUES (10,'47.38702081598773','5.79743150532408','Les Ormoy Montants, 70700 Gy','2020-11-10','2021-01-10',NULL,NULL,'Mes chèvres  sont nommées comme dans le film de Pixar : Prof, Grincheuse, Atchoum, Dormeuse, Timide, Simplette et Joyeuse. Ce sont mes meilleures amies',false,7,'Grande Chèvres-Naine',7,13);
INSERT INTO `troupeau` VALUES (11,'47.66151642069371','5.126716307403281','Chemin du Bas d Orbeine 52160 Chalancey','2020-11-10','2021-01-10',NULL,NULL,'12 belles Nantaises bien gaulées et affamées dherbe, qui dit meuh ?',true,12,'Les meuh-meuh dHomère',9,14);
INSERT INTO `troupeau` VALUES (12,'47.76885650919161','4.951178302066812','2 Grande Rue 52160 Colmier-le-Bas','2020-11-10','2021-01-10',NULL,NULL,'Des chèvres un peu capricieuses ahahah vous me suivez. Mais niveau tonte on reconnait bien le rigorisme stakhanoviste populairement attribué à nos voisins doutre-Rhin.',true,17,'Vous les aurez mes lorraines',6,15);
INSERT INTO `troupeau` VALUES (13,'46.858019970110824','4.061653813508599','Le Grand Vernat 58170 Poil','2020-11-10','2021-06-01',NULL,NULL,'Magnifiques moutons comme vous en avez jamais vu.',true,33,'Les landes de Bretagne',3,16);
INSERT INTO `troupeau` VALUES (14,'47.33294828932997','5.349252274421303','La Savolle 21270 Saint-Léger-Triey','2020-11-10','2021-01-10',NULL,NULL,'La mule poitevine est un type de grande mule reconnu par les haras nationaux français. Elle naît du croisement entre une jument de trait Poitevin mulassier et un baudet du Poitou.',true,25,'Les Poitevines',5,17);
INSERT INTO `troupeau` VALUES (15,'47.68606890424283','4.858126971345889','Chemin Rural des Praulon 21290 Saint-Broing-les-Moines','2020-11-10','2021-01-10',NULL,NULL,'Croyez-moi vous allez être surpris davoir de telles bêtes dans votre domaine !',true,15,'Hightland Cattle',10,23);
INSERT INTO `troupeau` VALUES (16,'47.87017011080593','5.436335834759443','La Voie du Montier 52360 Lecey','2020-11-10','2021-01-10',NULL,NULL,'Lâne du Cotentin est une race dâne originaire de louest de la France et plus précisément du département de la Manche. ',false,9,'Les Ânes du Cotentin',11,24);
INSERT INTO `troupeau` VALUES (17,'47.45860455625466','4.9858967169105695','Bois de Dame Claude 21380 Saussy','2020-11-10','2021-01-10',NULL,NULL,'Le Camargue est une race de petits chevaux de selle rustiques à la robe grise, originaire de la région du même nom, dans le Sud de la France dans le delta du Rhône, sur les départements du Gard et des Bouches-du-Rhône.',true,10,'Les Camargues',13,25);
INSERT INTO `troupeau` VALUES (18,'47.464724216987634','4.5564967802042045','Pertuis Gilbert, 21150 La Roche-Vanneau','2020-11-10','2021-01-10',NULL,NULL,'Landais est une race de poneys originaire du département des Landes',true,12,'Les Landais',14,26);
INSERT INTO `troupeau` VALUES (19,'47.02016161637006','4.823760507547958','34 Rue des Écureuils 21200 Beaune','2020-11-10','2021-01-10',NULL,NULL,'Son élégance naturelle et sa docilité font du trait poitevin un cheval très apprécié pour la selle ou pour l''attelage.',false,8,'Les Traits Poitevins',15,27);

INSERT INTO `offre` (date_ajout, date_debut, date_fin, description, frequence_intervention, installation_assuree, nom, prix_bete_jour, prix_installation, prix_intervention, prix_km, zone_couverture,conditionAnnulation_id_condition_annulation, troupeau_id_troupeau) VALUES ('2021-04-04', '2021-04-04', '2022-10-29', 'Je recherche Hun nouveau challenge pour mes biquettes','2', true,'Chèvres d''Attila cherchent prairies à raser','2','1.3','1.4','.5','60','1', '1');
INSERT INTO `offre` (date_ajout, date_debut, date_fin, description, frequence_intervention, installation_assuree, nom, prix_bete_jour, prix_installation, prix_intervention, prix_km, zone_couverture,conditionAnnulation_id_condition_annulation, troupeau_id_troupeau) VALUES ('2021-04-08', '2021-04-08', '2022-06-10', 'je recherche un terrain pour mon troupeau, j''imagine que c''est pour ça qu''on est là ?','2', true,'Nouveau défi pour mes faiseuses de désert','3','2.1','1.3','.8','200','1', '2');
INSERT INTO `offre` (date_ajout, date_debut, date_fin, description, frequence_intervention, installation_assuree, nom, prix_bete_jour, prix_installation, prix_intervention, prix_km, zone_couverture,conditionAnnulation_id_condition_annulation, troupeau_id_troupeau) VALUES ('2021-05-30', '2021-05-30', '2022-05-30', 'Ca va pulser à l''asiat'' avec mon troupeau de vachettes !! Elles ont reçu l''enseignement le plus strict dans un temple bouddhiste des hautes montagnes du Jura','3', false,'Mes vaches ninjas vont swinguer ta tonte !','4','1.5','1.2','.4','300','1', '3');

INSERT INTO `offre` (date_ajout, date_debut, date_fin, description, frequence_intervention, installation_assuree, nom, prix_bete_jour, prix_installation, prix_intervention, prix_km, zone_couverture,conditionAnnulation_id_condition_annulation, troupeau_id_troupeau) VALUES ('2020-11-30', '2020-12-01', '2021-12-31', 'Mes moutons n''attendent plus que votre herbe pour trouver le bonheur.', '3',true,'Fiers moutons cherchent vertes étendues','3','1','1','1','9','3','5');
INSERT INTO `offre` VALUES (5,'2020-12-01 00:00:00','2020-12-02 00:00:00','2022-12-31 00:00:00',NULL,'Laissez-vous tenter par cette offre réalisée sur mesure chez vous par ces splendides chèvres des Fossés dont 1 sataniste. Peu importe le rythme de tonte, le terrain, rien n''est trop dur pour mes biquettes.',2,true,'Je lâche les biquettes',2,1.25,1.2,0.25,50,2,6);
INSERT INTO `offre` VALUES (6,'2020-12-02 00:00:00','2020-12-03 00:00:00','2022-12-31 00:00:00',NULL,'Si grand-mère sait faire du bon café, moi mon truc c''est le lait, et pour ça mes vaches ont besoin de VOTRE herbe ! Conditions flex, tonte ajustable, vaches tout-terrain... Qu''est-ce que vous attendez quoi ?',2,true,'Oh les vaches !',2.5,1.4,1.9,0.46,120,1,7);
INSERT INTO `offre` VALUES (7,'2020-12-03 00:00:00','2020-12-04 00:00:00','2022-12-31 00:00:00',NULL,'Quatre, nombre magique, nombre d''angles dans un carré, nombre de filles du docteur March, nombre de saisons dans l''opéra de Vivendi... Et nombre de chevaux que vous aurez sur votre terrain !',1,false,'Quatre amis en cavale',3.1,1.33,1.1,0.21,150,3,8);
INSERT INTO `offre` VALUES (8,'2020-12-04 00:00:00','2020-12-05 00:00:00','2022-12-31 00:00:00',NULL,'Derrière ce nom audacieux se cache une offre que vous ne pourrez refuser. 15 biquettes prêtes à en découdre avec vos herbes. Vous appelez ça de la mauvaise herbe, elles n''en voient que les bons côtés.',3,true,'Une offre qui vous rendra chèvre',4,1.28,1.4,0.9,90,3,10);
INSERT INTO `offre` VALUES (9,'2020-12-05 00:00:00','2020-12-06 00:00:00','2022-12-31 00:00:00',NULL,'La meilleure laine du pays sur votre terrain et vivante !',4,true,'Les Solognots à Stacy ',2,1.6,1.6,0.7,75,1,9);
--INSERT INTO `offre` VALUES (10,'2020-12-06 00:00:00','2020-12-07 00:00:00','2022-12-31 00:00:00',NULL,'Elles sont grandes, elles sont naines, ce sont les meilleures des Chèvres-Naines qui n''attendent qu''à manger votre herbe.',3,true,'Les grandes Chèvres-Naines',3,1.4,1.5,0.45,80,2,10);
INSERT INTO `offre` VALUES (11,'2020-12-07 00:00:00','2020-12-08 00:00:00','2022-12-31 00:00:00',NULL,'Interville voulait mes vachettes, quel bougre accepterait une telle proposition? Leurs place est clairement sur votre terrain.',3,false,'L''équipe officielle des Nantaises',2.5,1.6,1.3,0.5,90,3,11);
INSERT INTO `offre` VALUES (12,'2020-12-08 00:00:00','2020-12-09 00:00:00','2022-12-31 00:00:00',NULL,'Je vous propose mes Lorraines, n''hésitez pas à me contacter pour plus d''information !',2,false,'Les Lorraines ',2.3,1.5,1.45,0.42,75,2,12);
INSERT INTO `offre` VALUES (13,'2020-12-09 00:00:00','2020-12-10 00:00:00','2022-12-31 00:00:00',NULL,'Je mets à disposition des Landes de Bretagne pour l''éco-paturage. En plus d''entretenir votre terrains, ces bêtes sont superbes et vont attirer le public !',3,true,'Les Landes débarquent !',4,1.4,1.82,0.7,50,2,13);
INSERT INTO `offre` VALUES (14,'2020-12-10 00:00:00','2020-12-11 00:00:00','2022-12-31 00:00:00',NULL,'La mûle Poitevine est une espèce qu''on ne voit pas souvent dans notre pays et nous vous proposons de l''avoir dans votre champ ou jardin alors profitez-en !',2,true,'À vous les Poitevines ',2.5,1.6,1.6,0.23,120,1,14);
INSERT INTO `offre` VALUES (15,'2020-12-11 00:00:00','2020-12-12 00:00:00','2022-12-31 00:00:00',NULL,'Impressionnez votre entourage et toute la ville en ayant ces magnifiques bêtes sur votre terrain. Qualité au rendez-vous !',2,true,'Highlander 15',3,1.75,1.3,0.6,100,1,15);
INSERT INTO `offre` VALUES (16,'2020-12-12 00:00:00','2020-12-13 00:00:00','2022-12-31 00:00:00',NULL,'Changeons la vision que les gens ont de l''âne ! Ces petites bêtes aux grandes oreilles vont entretenir la verdure de votre terrain et épater tous ceux qui les verront.',2,false,'Les Ânes du Cotentin !',2.25,1.55,1.4,0.18,95,1,16);
INSERT INTO `offre` VALUES (17,'2020-12-13 00:00:00','2020-12-14 00:00:00','2022-12-31 00:00:00',NULL,'Ne vous contentez pas d''admirer ces magnifiques chevaux sur votre télévision, nous vous proposons dès à présent de les installer dans votre domaine et éblouir le paysage tout en entretenant votre végétation.',3,true,'Les canassons au Gandalf',2,1.45,1.6,0.35,90,3,17);
INSERT INTO `offre` VALUES (18,'2020-12-14 00:00:00','2020-12-15 00:00:00','2022-12-31 00:00:00',NULL,'Des poneys adorables et super chouettes chez vous c''est possible ! En plus nous sommes ouverts à la négociation donc n''hésitez pas !',2,true,'My Little Pony',4,1.76,1.3,0.55,85,2,18);
INSERT INTO `offre` VALUES (19,'2020-12-15 00:00:00','2020-12-16 00:00:00','2022-12-31 00:00:00',NULL,'Nous vous proposons ces élégants Traits poitevins pour prendre soin de votre terrain. Vous verrez à quel point ces bêtes sont superbes et dociles !',3,true,'Des Poitevins coquins dans ta région !',3.2,1.28,1.5,0.6,90,3,19);


INSERT INTO `prestation` (date_apport_troupeau, date_debut, date_debut_desinstallation,date_debut_installation, date_fin, date_fin_desinstallation, date_fin_installation,date_recuperation_troupeau, date_reservation, date_validation, frequence_intervention,num_reservation, nombre_betes, frais_installation, frais_intervention, frais_betail, frais_service, tva, prix_total, type_installation, conditionAnnulation_id_condition_annulation, offre_id_offre, terrain_id_terrain, troupeau_id_troupeau) VALUES ('2021-07-05', '2021-06-30', '2021-08-30', '2021-06-30','2021-09-05','2021-09-02', '2021-07-02', '2021-08-25','2021-06-20','2021-06-21','2','858487','16','850','665','1200','271.5','597.3','3583.8',true,'1','1','1','1');


INSERT INTO `morphologie` (nom) VALUES ('Pente');
INSERT INTO `morphologie` (nom) VALUES ('Vallonnement');
INSERT INTO `morphologie` (nom) VALUES ('Ligne de crête');
INSERT INTO `morphologie` (nom) VALUES ('Plat');

INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('1','2');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('1','4');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('2','4');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('3','1');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('3','2');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('3','4');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('1','1');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('4','1');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('4','2');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('4','3');
INSERT INTO `espece_morphologie` (id_espece, id_morphologie) VALUES ('4','4');



INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('1','2');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('1','3');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('1','4');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('2','4');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('3','4');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('3','5');
INSERT INTO `espece_type_vegetation` (id_espece, id_type_vegetation) VALUES ('4','5');

INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('1','1','25');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('1','2','25');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('1','3','25');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('1','4','25');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('2','1','50');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('2','2','20');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('2','3','10');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('2','4','20');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('3','1','10');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('3','2','40');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('3','3','40');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('3','4','10');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('4','1','15');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('4','2','35');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('4','3','45');
INSERT INTO `terrain_morphologie` (id_terrain, id_morphologie, pourcentage) VALUES ('4','4','5');

INSERT INTO `espece_type_vegetation` VALUES ('1','1');
INSERT INTO `espece_type_vegetation` VALUES ('2','1');
INSERT INTO `espece_type_vegetation` VALUES ('3','1');
INSERT INTO `espece_type_vegetation` VALUES ('4','1');
INSERT INTO `espece_type_vegetation` VALUES ('3','2');
INSERT INTO `espece_type_vegetation` VALUES ('4','2');
INSERT INTO `espece_type_vegetation` VALUES ('3','3');
INSERT INTO `espece_type_vegetation` VALUES ('4','3');
INSERT INTO `espece_type_vegetation` VALUES ('4','4');
INSERT INTO `espece_type_vegetation` VALUES ('1','5');
INSERT INTO `espece_type_vegetation` VALUES ('2','5');
INSERT INTO `espece_type_vegetation` VALUES ('1','6');
INSERT INTO `espece_type_vegetation` VALUES ('3','6');
INSERT INTO `espece_type_vegetation` VALUES ('4','6');
INSERT INTO `espece_type_vegetation` VALUES ('1','7');
INSERT INTO `espece_type_vegetation` VALUES ('2','7');
INSERT INTO `espece_type_vegetation` VALUES ('3','7');
INSERT INTO `espece_type_vegetation` VALUES ('4','7');
INSERT INTO `espece_type_vegetation` VALUES ('1','8');
INSERT INTO `espece_type_vegetation` VALUES ('2','8');
INSERT INTO `espece_type_vegetation` VALUES ('3','8');
INSERT INTO `espece_type_vegetation` VALUES ('4','8');
INSERT INTO `espece_type_vegetation` VALUES ('1','9');
INSERT INTO `espece_type_vegetation` VALUES ('2','9');
INSERT INTO `espece_type_vegetation` VALUES ('3','9');
INSERT INTO `espece_type_vegetation` VALUES ('4','9');
INSERT INTO `espece_type_vegetation` VALUES ('1','10');
INSERT INTO `espece_type_vegetation` VALUES ('2','10');
INSERT INTO `espece_type_vegetation` VALUES ('3','10');
INSERT INTO `espece_type_vegetation` VALUES ('4','10');
INSERT INTO `espece_type_vegetation` VALUES ('1','11');
INSERT INTO `espece_type_vegetation` VALUES ('3','11');
INSERT INTO `espece_type_vegetation` VALUES ('4','11');
INSERT INTO `espece_type_vegetation` VALUES ('1','12');
INSERT INTO `espece_type_vegetation` VALUES ('2','12');
INSERT INTO `espece_type_vegetation` VALUES ('3','12');
INSERT INTO `espece_type_vegetation` VALUES ('4','12');
INSERT INTO `espece_type_vegetation` VALUES ('1','13');
INSERT INTO `espece_type_vegetation` VALUES ('2','13');
INSERT INTO `espece_type_vegetation` VALUES ('3','13');
INSERT INTO `espece_type_vegetation` VALUES ('4','13');
INSERT INTO `espece_type_vegetation` VALUES ('3','14');
INSERT INTO `espece_type_vegetation` VALUES ('4','14');
INSERT INTO `espece_type_vegetation` VALUES ('3','15');
INSERT INTO `espece_type_vegetation` VALUES ('4','15');
INSERT INTO `espece_type_vegetation` VALUES ('1','16');
INSERT INTO `espece_type_vegetation` VALUES ('2','16');
INSERT INTO `espece_type_vegetation` VALUES ('3','16');
INSERT INTO `espece_type_vegetation` VALUES ('4','16');
INSERT INTO `espece_type_vegetation` VALUES ('3','17');
INSERT INTO `espece_type_vegetation` VALUES ('4','17');
INSERT INTO `espece_type_vegetation` VALUES ('1','18');
INSERT INTO `espece_type_vegetation` VALUES ('2','18');
INSERT INTO `espece_type_vegetation` VALUES ('3','18');
INSERT INTO `espece_type_vegetation` VALUES ('4','18');

INSERT INTO `motif_refus_reservation` (nom) VALUES ('Mauvaise note');
INSERT INTO `motif_refus_reservation` (nom) VALUES ('Terrain/troupeau inadapté');

INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('1','1','20');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('1','2','20');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('1','3','20');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('1','4','20');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('1','5','20');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('2','1','10');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('2','2','10');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('2','3','10');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('2','4','20');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('2','5','60');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('3','1','55');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('3','2','25');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('3','3','5');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('3','4','10');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('3','5','5');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('4','1','30');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('4','2','10');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('4','3','30');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('4','4','10');
INSERT INTO `terrain_type_vegetation` (id_terrain, id_type_vegetation, pourcentage) VALUES ('4','5','20');

INSERT INTO `terrain_type_abreuvoir` (id_terrain, id_type_abreuvoir) VALUES ('1','1');

INSERT INTO `terrain_type_cloture` (id_terrain, id_type_cloture) VALUES ('1','4');

INSERT INTO `terrain_type_abri` (id_terrain, id_type_abri) VALUES ('1','4');




