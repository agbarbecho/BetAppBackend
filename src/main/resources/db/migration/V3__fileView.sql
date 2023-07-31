CREATE VIEW file_view AS
SELECT f.id AS file_id,
       f.admission_date,
       f.weight,
       f.diagnostic,
       f.exams,
       f.discharge_date,
       p.id AS pet_id,
       p.name AS pet_name,
       p.breed AS pet_breed,
       p.species AS pet_species,
       v.id AS vet_id,
       v.name AS vet_name,
       v.lastname AS vet_lastname
FROM file f
JOIN pet p ON f.pet_id = p.id
JOIN vet v ON f.vet_id = v.id;