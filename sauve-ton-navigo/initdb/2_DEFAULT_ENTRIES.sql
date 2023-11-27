INSERT INTO users (id, first_name, last_name, email, mdp, admin) VALUES (1, 'Arno', 'Bruno', 'arno.bruno@epfedu.fr', 'ab', true);
INSERT INTO users (id, first_name, last_name, email, mdp, admin) VALUES (2, 'Juliette', 'Crespo', 'juliette.crespo@epfedu.fr','jc', true);
INSERT INTO users (id, first_name, last_name, email, mdp, admin) VALUES (3, 'Aurélien', 'Bourliatoux', 'aurelien.bourliatoux@epfedu.fr','ab', true);
INSERT INTO users (id, first_name, last_name, email, mdp, admin) VALUES (4, 'Laura', 'Zablit', 'laura.zablit@epfedu.fr', 'lz', false);
INSERT INTO users (id, first_name, last_name, email, mdp, admin) VALUES (5, 'Marion', 'Chineaud', 'marion.chineaud@epfedu.fr','mc',false);
INSERT INTO users (id, first_name, last_name, email, mdp, admin) VALUES (6, 'Pierre-Louis', 'Bertrand', 'plbertrand@takima.fr', 'plb', false);
INSERT INTO users (id, first_name, last_name, email, mdp, admin) VALUES (7, 'Laurine', 'LeNet', 'llenet@takima.fr','ll',true);

-- Ligne 1
INSERT INTO station (id, numero_ligne, nom, nbr_controlleurs, nbr_sortie) VALUES
                                                                              (1, 1, 'La Défense', 2, 4),
                                                                              (2, 1, 'Pont de Neuilly', 3, 5),
                                                                              (3, 1, 'Les Sablons', 2, 3),
                                                                              (4, 1, 'Porte Maillot', 2, 4),
                                                                              (5, 1, 'Charles de Gaulle-Etoile', 3, 5),
                                                                              (6, 1, 'Argentine', 2, 4),
                                                                              (7, 1, 'George V', 3, 5),
                                                                              (8, 1, 'Champs-Élysées', 2, 3),
                                                                              (9, 1, 'Concorde', 2, 4),
                                                                              (10, 1, 'Tuileries', 2, 4),
                                                                              (11, 1, 'Palais Royal - Musée du Louvre', 3, 5),
                                                                              (12, 1, 'Châtelet', 2, 8),
                                                                              (13, 1, 'Hôtel de Ville', 2, 4),
                                                                              (14, 1, 'Saint-Paul', 3, 5),
                                                                              (15, 1, 'Bastille', 2, 4),
                                                                              (16, 1, 'Gare de Lyon', 3, 5),
                                                                              (17, 1, 'Nation', 2, 3),
                                                                              (18, 1, 'Porte de Vincennes', 2, 4),
                                                                              (19, 1, 'Bérault', 3, 5),
                                                                              (20, 1, 'Château de Vincennes', 3, 5);
-- Ligne 2
INSERT INTO station (id, numero_ligne, nom, nbr_controlleurs, nbr_sortie) VALUES
                                                                              (21, 2, 'Porte Dauphine', 2, 4),
                                                                              (22, 2, 'Victor Hugoy', 3, 5),
                                                                              (23, 2, 'Charles de Gaulle-Etoile', 2, 3),
                                                                              (24, 2, 'Ternes', 2, 4),
                                                                              (25, 2, 'Courcelles', 3, 5),
                                                                              (26, 2, 'Monceau', 2, 4),
                                                                              (27, 2, 'Villiers', 3, 5),
                                                                              (28, 2, 'Rome', 2, 3),
                                                                              (29, 2, 'Place de Clichy', 2, 4),
                                                                              (30, 2, 'Blanche', 2, 4),
                                                                              (31, 2, 'Pigalle', 3, 5),
                                                                              (32, 2, 'Anvers (Sacré-Cœur)', 2, 8),
                                                                              (33, 2, 'La Chapelle', 2, 4),
                                                                              (34, 2, 'Jaurès', 3, 5),
                                                                              (35, 2, 'Belleville', 2, 4),
                                                                              (36, 2, 'Couronnes', 3, 5),
                                                                              (37, 2, 'Ménilmontant', 2, 3),
                                                                              (38, 2, 'Philippe Auguste', 2, 4),
                                                                              (39, 2, 'Alexandre Dumas', 3, 5),
                                                                              (40, 2, 'Nation', 3, 5);

-- Ligne 3
INSERT INTO station (id, numero_ligne, nom, nbr_controlleurs, nbr_sortie) VALUES
                                                                              (41, 3, 'Pont de Levallois', 2, 4),
                                                                              (42, 3, 'Anatole France', 3, 5),
                                                                              (43, 3, 'Porte de Champerret', 2, 3),
                                                                              (44, 3, 'Wagram', 2, 4),
                                                                              (45, 3, 'Malesherbes', 3, 5),
                                                                              (46, 3, 'Europe', 2, 4),
                                                                              (47, 3, 'Villiers', 3, 5),
                                                                              (48, 3, 'Saint-Lazare', 2, 3),
                                                                              (49, 3, 'Havre', 2, 4),
                                                                              (50, 3, 'Opéra', 2, 4),
                                                                              (51, 3, 'Quatre-Septembre', 3, 5),
                                                                              (52, 3, 'Bourse', 2, 8),
                                                                              (53, 3, 'Arts et Métiers', 2, 4),
                                                                              (54, 3, 'Temple', 3, 5),
                                                                              (55, 3, 'République', 2, 4),
                                                                              (56, 3, 'Parmentier', 3, 5),
                                                                              (57, 3, 'Rue Saint-Maure', 2, 3),
                                                                              (58, 3, 'Gambetta', 2, 4),
                                                                              (59, 3, 'Porte de Bagnolet', 3, 5),
                                                                              (60, 3, 'Gallieni', 3, 5);

-- Ligne 4
INSERT INTO station (id, numero_ligne, nom, nbr_controlleurs, nbr_sortie) VALUES
                                                                              (61, 4, 'Porte de Clignancourt', 2, 4),
                                                                              (62, 4, 'Simplon', 3, 5),
                                                                              (63, 4, 'Marcadet — Poissonniers', 2, 3),
                                                                              (64, 4, 'Château Rouge', 2, 4),
                                                                              (65, 4, 'Gare du Nord', 3, 5),
                                                                              (66, 4, 'Gare de l Est', 2, 4),
                                                                              (67, 4, 'Château d Eau', 3, 5),
                                                                              (68, 4, 'Strasbourg — Saint-Denis', 2, 3),
                                                                              (69, 4, 'Réaumur — Sébastopol', 2, 4),
                                                                              (70, 4, 'Les Halles', 2, 4),
                                                                              (71, 4, 'Châtelet', 3, 5),
                                                                              (72, 4, 'Cité', 2, 8),
                                                                              (73, 4, 'Saint-Michel', 2, 4),
                                                                              (74, 4, 'Odéon', 3, 5),
                                                                              (75, 4, 'Saint-Placide', 2, 4),
                                                                              (76, 4, 'Montparnasse — Bienvenüe', 3, 5),
                                                                              (77, 4, 'Vavin', 2, 3),
                                                                              (78, 4, 'Denfert-Rochereau', 2, 4),
                                                                              (79, 4, 'Porte d Orléans', 3, 5),
                                                                              (80, 4, 'Mairie de Montrouge', 3, 5);

-- Ligne 5
INSERT INTO station (id, numero_ligne, nom, nbr_controlleurs, nbr_sortie) VALUES
                                                                              (81, 5, 'Bobigny - Pablo Picasso', 2, 4),
                                                                              (82, 5, 'Église de Pantin', 3, 5),
                                                                              (83, 5, 'Hoche', 2, 3),
                                                                              (84, 5, 'Porte de Pantin', 2, 4),
                                                                              (85, 5, 'Laumière', 3, 5),
                                                                              (86, 5, 'Jaurès', 2, 4),
                                                                              (87, 5, 'Stalingrad', 3, 5),
                                                                              (88, 5, 'Gare du Nord', 2, 3),
                                                                              (89, 5, 'Gare de l Est', 2, 4),
                                                                              (90, 5, 'Jacques Bonsergent', 2, 4),
                                                                              (91, 5, 'République', 3, 5),
                                                                              (92, 5, 'Oberkampf', 2, 8),
                                                                              (93, 5, 'Bréguet — Sabin', 2, 4),
                                                                              (94, 5, 'Bastille', 3, 5),
                                                                              (95, 5, 'Quai de la Rapée', 2, 4),
                                                                              (96, 5, 'Gare d Austerlitz', 3, 5),
                                                                              (97, 5, 'Saint-Marcel', 2, 3),
                                                                              (98, 5, 'Campo-Formio', 2, 4),
                                                                              (99, 5, 'Place d Italie', 3, 5),
                                                                              (100, 5, 'Ourcq', 3, 5);

-- Ligne 6
INSERT INTO station (id, numero_ligne, nom, nbr_controlleurs, nbr_sortie) VALUES
                                                                              (101, 6, 'Charles de Gaulle — Étoile', 2, 4),
                                                                              (102, 6, 'Kléber', 3, 5),
                                                                              (103, 6, 'Boissière', 2, 3),
                                                                              (104, 6, 'Trocadéro', 2, 4),
                                                                              (105, 6, 'Passy', 3, 5),
                                                                              (106, 6, 'Bir-Hakeim (Tour Eiffel)', 2, 4),
                                                                              (107, 6, 'Dupleix', 3, 5),
                                                                              (108, 6, 'Cambronne', 2, 3),
                                                                              (109, 6, 'Sèvres — Lecourbe', 2, 4),
                                                                              (110, 6, 'Pasteur', 2, 4),
                                                                              (111, 6, 'Montparnasse — Bienvenüe', 3, 5),
                                                                              (112, 6, 'Edgar Quinet', 2, 8),
                                                                              (113, 6, 'Raspail', 2, 4),
                                                                              (114, 6, 'Denfert-Rochereau', 3, 5),
                                                                              (115, 6, 'Saint-Jacques', 2, 4),
                                                                              (116, 6, 'Glacière', 3, 5),
                                                                              (117, 6, 'Quai de la Gare', 2, 3),
                                                                              (118, 6, 'Bercy', 2, 4),
                                                                              (119, 6, 'Bel-Air', 3, 5),
                                                                              (120, 6, 'Nation', 3, 5);

-- Ligne 7
INSERT INTO station (id, numero_ligne, nom, nbr_controlleurs, nbr_sortie) VALUES
                                                                              (121, 7, 'La Courneuve — 8 Mai 1945', 2, 4),
                                                                              (122, 7, 'Fort d Aubervilliers', 3, 5),
                                                                              (123, 7, 'Porte de la Villette', 2, 3),
                                                                              (124, 7, 'Corentin Cariou', 2, 4),
                                                                              (125, 7, 'Crimée', 3, 5),
                                                                              (126, 7, 'Riquet', 2, 4),
                                                                              (127, 7, 'Stalingrad', 3, 5),
                                                                              (128, 7, 'Louis Blanc', 2, 3),
                                                                              (129, 7, 'Château-Landon', 2, 4),
                                                                              (130, 7, 'Gare de l Est', 2, 4),
                                                                              (131, 7, 'Poissonnière', 3, 5),
                                                                              (132, 7, 'Cadet)', 2, 8),
                                                                              (133, 7, 'Opéra', 2, 4),
                                                                              (134, 7, 'Pyramides', 3, 5),
                                                                              (135, 7, 'Palais Royal — Musée du Louvre', 2, 4),
                                                                              (136, 7, 'Pont Neuf', 3, 5),
                                                                              (137, 7, 'Châtelet', 2, 3),
                                                                              (138, 7, 'Pont Marie (Cité des Arts)', 2, 4),
                                                                              (139, 7, 'Maison Blanche', 3, 5),
                                                                              (140, 7, 'Tolbiac', 3, 5);
-- Ligne 8
INSERT INTO station (id, numero_ligne, nom, nbr_controlleurs, nbr_sortie) VALUES
                                                                              (141, 8, 'Balard', 2, 4),
                                                                              (142, 8, 'Lourmel', 3, 5),
                                                                              (143, 8, 'Commerce', 2, 3),
                                                                              (144, 8, 'École Militaire', 2, 4),
                                                                              (145, 8, 'La Tour-Maubourg', 3, 5),
                                                                              (146, 8, 'Invalides', 2, 4),
                                                                              (147, 8, 'Concorde', 3, 5),
                                                                              (148, 8, 'Madeleine', 2, 3),
                                                                              (149, 8, 'Richelieu — Drouot', 2, 4),
                                                                              (150, 8, 'Opéra', 2, 4),
                                                                              (151, 8, 'Bonne Nouvelle', 3, 5),
                                                                              (152, 8, 'République', 2, 8),
                                                                              (153, 8, 'Chemin Vert', 2, 4),
                                                                              (154, 8, 'Bastille', 3, 5),
                                                                              (155, 8, 'Michel Bizot', 2, 4),
                                                                              (156, 8, 'Porte Dorée', 3, 5),
                                                                              (157, 8, 'Porte de Charenton', 2, 3),
                                                                              (158, 8, 'Liberté', 2, 4),
                                                                              (159, 8, 'Maisons-Alfort — Les Juilliottes', 3, 5),
                                                                              (160, 8, 'Créteil', 3, 5);

-- Ligne 9
INSERT INTO station (id, numero_ligne, nom, nbr_controlleurs, nbr_sortie) VALUES
                                                                              (161, 9, 'Pont de Sèvres', 2, 4),
                                                                              (162, 9, 'Billancourt', 3, 5),
                                                                              (163, 9, 'Marcel Sembat', 2, 3),
                                                                              (164, 9, 'Porte de Saint-Cloud', 2, 4),
                                                                              (165, 9, 'Exelmans', 3, 5),
                                                                              (166, 9, 'Jasmin', 2, 4),
                                                                              (167, 9, 'La Muette', 3, 5),
                                                                              (168, 9, 'Rue de la Pompe', 2, 3),
                                                                              (169, 9, 'Saint-Augustin', 2, 4),
                                                                              (170, 9, 'Havre — Caumartin', 2, 4),
                                                                              (171, 9, 'Grands Boulevards', 3, 5),
                                                                              (172, 9, 'Bonne Nouvelle', 2, 8),
                                                                              (173, 9, 'Strasbourg — Saint-Denis', 2, 4),
                                                                              (174, 9, 'République', 3, 5),
                                                                              (175, 9, 'Saint-Ambroise', 2, 4),
                                                                              (176, 9, 'Voltaire', 3, 5),
                                                                              (177, 9, 'Rue des Boulets', 2, 3),
                                                                              (178, 9, 'Porte de Montreuil', 2, 4),
                                                                              (179, 9, 'Robespierre', 3, 5),
                                                                              (180, 9, 'Mairie de Montreuil', 3, 5);

-- Ligne 10
INSERT INTO station (id, numero_ligne, nom, nbr_controlleurs, nbr_sortie) VALUES
                                                                              (181, 10, 'Boulogne', 2, 4),
                                                                              (182, 10, 'Javel — André Citroën', 3, 5),
                                                                              (183, 10, 'Avenue Émile Zola', 2, 3),
                                                                              (184, 10, 'Ségur', 2, 4),
                                                                              (185, 10, 'Duroc', 3, 5),
                                                                              (186, 10, 'Vaneau', 2, 4),
                                                                              (187, 10, 'Sèvres — Babylone', 3, 5),
                                                                              (188, 10, 'Mabillon', 2, 3),
                                                                              (189, 10, 'Odéon', 2, 4),
                                                                              (190, 10, 'Cluny — La Sorbonnet', 2, 4),
                                                                              (191, 10, 'Maubert — Mutualité', 3, 5),
                                                                              (192, 10, 'Cardinal Lemoine', 2, 8),
                                                                              (193, 10, 'Jussieu', 2, 4),
                                                                              (194, 10, 'Gare d''Austerlitz', 3, 5),
                                                                              (195, 10, 'Mirabeau', 2, 4),
                                                                              (196, 10, 'Chardon-Lagache', 3, 5),
                                                                              (197, 10, 'Mirabeau', 2, 3),
                                                                              (198, 10, 'Charles Michels', 2, 4),
                                                                              (199, 10, 'La Motte-Picquet — Grenelle', 3, 5),
                                                                              (200, 10, 'Jean Jaurès', 3, 5);

-- Ligne 11
INSERT INTO station (id, numero_ligne, nom, nbr_controlleurs, nbr_sortie) VALUES
                                                                              (201, 11, 'Mairie des Lilas', 2, 4),
                                                                              (202, 11, 'Porte des Lilas', 3, 5),
                                                                              (203, 11, 'Télégraphe', 2, 3),
                                                                              (204, 11, 'Place des Fêtes', 2, 4),
                                                                              (205, 11, 'Jourdain', 3, 5),
                                                                              (206, 11, 'Pyrénées', 2, 4),
                                                                              (207, 11, 'Belleville', 3, 5),
                                                                              (208, 11, 'Goncourt (Hôpital-Saint-Louis)', 2, 3),
                                                                              (209, 11, 'République', 2, 4),
                                                                              (210, 11, 'Arts et Métiers', 2, 4),
                                                                              (211, 11, 'Rambuteau', 3, 5),
                                                                              (212, 11, 'Hôtel de Ville', 2, 8),
                                                                              (213, 11, 'Châtelet', 2, 4);

-- Ligne 12
INSERT INTO station (id, numero_ligne, nom, nbr_controlleurs, nbr_sortie) VALUES
                                                                              (221, 12, 'Porte de la Chapelle', 2, 4),
                                                                              (222, 12, 'Marx Dormoy', 3, 5),
                                                                              (223, 12, 'Marcadet', 2, 3),
                                                                              (224, 12, 'Jules Joffrin', 2, 4),
                                                                              (225, 12, 'Lamarck', 3, 5),
                                                                              (226, 12, 'Abbesses', 2, 4),
                                                                              (227, 12, 'Pigalle', 3, 5),
                                                                              (228, 12, 'Saint-Georges', 2, 3),
                                                                              (229, 12, 'Notre-Dame-de-Lorette', 2, 4),
                                                                              (230, 12, 'Saint-Lazare', 2, 4),
                                                                              (231, 12, 'Madeleine', 3, 5),
                                                                              (232, 12, 'Concorde', 2, 8),
                                                                              (233, 12, 'Assemblée nationale', 2, 4),
                                                                              (234, 12, 'Solférino (Musée d Orsay)', 3, 5),
                                                                              (235, 12, 'Notre-Dame-des-Champs', 2, 4),
                                                                              (236, 12, 'Rennes', 3, 5),
                                                                              (237, 12, 'Pasteur', 2, 3),
                                                                              (238, 12, 'Volontaires', 2, 4),
                                                                              (239, 12, 'Convention', 3, 5),
                                                                              (240, 12, 'Mairie d Issy', 3, 5);

-- Ligne 13
INSERT INTO station (id, numero_ligne, nom, nbr_controlleurs, nbr_sortie) VALUES
                                                                               (241, 13, 'La Fourche', 2, 4),
                                                                               (242, 13, 'Place de Clichy', 3, 5),
                                                                               (243, 13, 'Liège', 2, 3),
                                                                               (244, 13, 'Saint-Lazare', 2, 4),
                                                                               (245, 13, 'Miromesnil', 3, 5),
                                                                               (246, 13, 'Champs-Élysées', 2, 4),
                                                                               (247, 13, 'Varenne', 3, 5),
                                                                               (248, 13, 'Saint-François-Xavier', 2, 3),
                                                                               (249, 13, 'Duroc', 2, 4),
                                                                               (250, 13, 'Montparnasse — Bienvenüe', 2, 4),
                                                                               (251, 13, 'Gaîté', 3, 5),
                                                                               (252, 13, 'Pernety', 2, 8),
                                                                               (253, 13, 'Plaisance', 2, 4),
                                                                               (254, 13, 'Porte de Vanves', 3, 5),
                                                                               (255, 13, 'Châtillon', 2, 4);


-- Ligne 14
INSERT INTO station (id, numero_ligne, nom, nbr_controlleurs, nbr_sortie) VALUES
                                                                              (261, 14, 'Saint-Lazare', 2, 4),
                                                                              (262, 14, 'Madeleine', 3, 5),
                                                                              (263, 14, 'Pyramides', 2, 3),
                                                                              (264, 14, 'Châtelet', 2, 4),
                                                                              (265, 14, 'Gare de Lyon', 3, 5),
                                                                              (266, 14, 'Bercy', 2, 4),
                                                                              (267, 14, 'Cour Saint-Émilion', 3, 5),
                                                                              (268, 14, 'Bibliothèque François Mitterrand', 2, 3),
                                                                              (269, 14, 'Olympiades', 2, 4);




INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (1, '2023-11-10', '09:10:10', 2,60,'Mechant','SORTIE3','dommage ' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (2, '2023-11-9', '14:30:00', 2,30,'Gentil','SORTIE1','ca passe oklm' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (3, '2023-12-8', '15:18:19', 3,33,'Neutre','SORTIE2','la negociation etait compliqué' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (4, '2023-11-12', '09:10:10', 4,30,'Mechant','SORTIE2','pire amande de ma vie' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (5, '2023-11-9', '14:30:00', 2,145,'Mechant','SORTIE1','ca passe pas' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (6, '2023-12-7', '15:18:19', 2,147,'Neutre','SORTIE2','avec un grand sourir ca se tente' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (7, '2023-12-10', '09:10:10', 2,146,'Mechant','SORTIE4','aucune chance' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (8, '2023-12-9', '14:30:00', 1,145,'Gentil','SORTIE1','un amour ce mec' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (9, '2023-11-6', '15:18:19', 5,235,'Mechant','SORTIE2','la negociation etait compliqué' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (10, '2023-12-10', '09:10:10', 2,39,'Mechant','SORTIE3','la ca crain' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (11, '2023-12-9', '14:30:00', 7,188,'Gentil','SORTIE1','Tres compréhensif' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (12, '2023-12-8', '15:18:19', 2,176,'Neutre','SORTIE2','une chance sur deux' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (13, '2023-11-2', '09:10:10', 4,254,'Mechant','SORTIE3','dommage ' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (14, '2023-11-1', '14:30:00', 3,223,'Gentil','SORTIE1','ca passe oklm' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (15, '2023-12-3', '15:18:19', 6,222,'Neutre','SORTIE2','la negociation etait compliqué' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (16, '2023-11-4', '09:10:10', 8,95,'Mechant','SORTIE2','pire amande de ma vie' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (17, '2023-11-15', '14:30:00', 2,174,'Mechant','SORTIE1','ca passe pas' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (18, '2023-12-12', '15:18:19', 9,170,'Neutre','SORTIE2','avec un grand sourir ca se tente' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (19, '2023-12-3', '09:10:10', 2,70,'Mechant','SORTIE4','aucune chance' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (20, '2023-12-12', '14:30:00', 1,69,'Gentil','SORTIE1','un amour ce mec' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (21, '2023-11-2', '15:18:19', 5,60,'Mechant','SORTIE2','la negociation etait compliqué' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (22, '2023-12-14', '09:10:10', 6,198,'Mechant','SORTIE3','la ca crain' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (23, '2023-12-12', '14:30:00', 7,201,'Gentil','SORTIE1','Tres compréhensif' );
INSERT INTO signalements (id, date, heure, nbr_controlleurs, station_id, humeur, position_controlleurs, commentaire) VALUES (24, '2023-12-3', '15:18:19', 2,201,'Neutre','SORTIE2','RAS' );
