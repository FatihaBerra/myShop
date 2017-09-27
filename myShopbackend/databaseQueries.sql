

CREATE TABLE categorie (

	id_categorie IDENTITY,
	nom_cat VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	
	CONSTRAINT pk_categorie_id PRIMARY KEY (id_categorie)

);

-- adding three categories
INSERT INTO categorie (nom_cat, description,image_url,is_active) VALUES ('Camion', 'This is description for Camion category!', 'CAT_1.png', true);
INSERT INTO categorie (nom_cat, description,image_url,is_active) VALUES ('Nacelle', 'This is description for Nacelle category!', 'CAT_2.png', true);
INSERT INTO categorie (nom_cat, description,image_url,is_active) VALUES ('Grus', 'This is description for Grus category!', 'CAT_3.png', true);

CREATE TABLE user_detail (
	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(60),
	email VARCHAR(100),
	contact_number VARCHAR(15),	
	CONSTRAINT pk_user_id PRIMARY KEY(id)
);


CREATE TABLE product (
	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(50),
	brand VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	superficie INT,
	HAUTEUR INT,
	LARGEUR INT, 
	nbr_person INT,
	poids INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_vehicule_id PRIMARY KEY (id),
 	CONSTRAINT fk_vehicule_category_id FOREIGN KEY (category_id) REFERENCES categorie (id_categorie),
	CONSTRAINT fk_vehicule_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_detail(id),	
);	

INSERT INTO product (code ,name ,brand ,description ,unit_price ,quantity ,superficie ,HAUTEUR ,LARGEUR,nbr_person ,poids ,is_active ,category_id ,supplier_id ,purchases,views )

VALUES ('PRDABC123DEFX', 'Camion N1', 'Chevrolet', 'This is one of the best camion available in the market right now!', 18000, 5,180,30,40,5,50,true, 3, 2, 0, 0 );
INSERT INTO product (code ,name ,brand ,description ,unit_price ,quantity ,superficie ,HAUTEUR ,LARGEUR,nbr_person ,poids ,is_active ,category_id ,supplier_id ,purchases,views )

VALUES ('PRDDEF123DEFX', 'NACELLE N1', 'Ford', 'the best!', 32000,5,180,30,40,5,50, 2, true, 3, 3, 0, 0 );
INSERT INTO product (code ,name ,brand ,description ,unit_price ,quantity ,superficie ,HAUTEUR ,LARGEUR,nbr_person ,poids ,is_active ,category_id ,supplier_id ,purchases,views )

VALUES ('PRDPQR123WGTX', 'Nacelle N2', 'GMC', 'This is one of the best Nacelle smart phone available in the market right now!', 57000,5,180,30,40,5,50, 5, true, 3, 2, 0, 0 );
INSERT INTO product (code ,name ,brand ,description ,unit_price ,quantity ,superficie ,HAUTEUR ,LARGEUR,nbr_person ,poids ,is_active ,category_id ,supplier_id ,purchases,views )

VALUES ('PRDMNO123PQRX', ' Grus N1', 'Freightliner', 'This is one of the best Grus available in the market right now!', 54000,5,180,30,40,5,50, 3, true, 1, 2, 0, 0 );
INSERT INTO vehicule (code ,name ,brand ,description ,unit_price ,quantity ,superficie ,HAUTEUR ,LARGEUR,nbr_person ,poids ,is_active ,category_id ,supplier_id ,purchases,views )

VALUES ('PRDABCXYZDEFX', 'Camion E6510', 'Freightliner', 'This is one of the best Camion series from dell that can be used!', 48000,5,180,30,40,5,50, 5, true, 1, 3, 0, 0 );









INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Omar', 'Ettoussi', 'ADMIN', true, '$2a$06$ORtBskA2g5Wg0HDgRE5ZsOQNDHUZSdpJqJ2.PGXv0mKyEvLnKP7SW', 'vk@gmail.com', '8888888888');
INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Ravindra', 'Jadeja', 'SUPPLIER', true, '$2a$06$bzYMivkRjSxTK2LPD8W4te6jjJa795OwJR1Of5n95myFsu3hgUnm6', 'rj@gmail.com', '9999999999');
INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Ravichandra', 'Ashwin', 'SUPPLIER', true, '$2a$06$i1dLNlXj2uY.UBIb9kUcAOxCigGHUZRKBtpRlmNtL5xtgD6bcVNOK', 'ra@gmail.com', '7777777777');
INSERT INTO user_detail 
(first_name, last_name, role, enabled, password, email, contact_number) 
VALUES ('Anas', 'Boumali', 'USER', true, '$2a$06$4mvvyO0h7vnUiKV57IW3oudNEaKPpH1xVSdbie1k6Ni2jfjwwminq', 'kn@gmail.com', '7777777777');


