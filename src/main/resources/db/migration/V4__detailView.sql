CREATE VIEW detail_view AS
SELECT d.id AS detail_id,
       d.amount,
       d.date_medicament,
       d.administration_time,
       d.tomorrow,
       d.afternoon,
       d.evening,
       m.id AS medicine_id,
       m.name AS medicine_name,
       m.description AS medicine_description,
       m.expiration_date,
       f.id AS file_id,
       f.admission_date,
       f.weight,
       f.diagnostic,
       f.exams,
       f.discharge_date,
       f.pet_id,
       f.vet_id
FROM detail d
JOIN medicine m ON d.medicine_id = m.id
JOIN file f ON d.file_id = f.id;