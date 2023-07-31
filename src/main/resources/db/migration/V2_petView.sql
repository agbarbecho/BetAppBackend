CREATE VIEW pet_view AS
SELECT p.id AS pet_id,
       p.name AS pet_name,
       p.breed AS pet_breed,
       p.species AS pet_species,
       c.id AS client_id,
       c.name AS client_name,
       c.lastname AS client_lastname,
       c.address AS client_address,
       c.phone AS client_phone
FROM pet p JOIN client c
ON p.client_id = c.id;