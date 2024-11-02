SET FOREIGN_KEY_CHECKS = 0;

TRUNCATE TABLE medical_exam;
TRUNCATE TABLE medical_appointment;
TRUNCATE TABLE patient_phone;
TRUNCATE TABLE patient_email;
TRUNCATE TABLE patient;
TRUNCATE TABLE address;
TRUNCATE TABLE neighborhood;
TRUNCATE TABLE street;
TRUNCATE TABLE street_type;
TRUNCATE TABLE city;
TRUNCATE TABLE state;
TRUNCATE TABLE doctor;
TRUNCATE TABLE diagnosis;
TRUNCATE TABLE exam_result;
TRUNCATE TABLE exam_type;
TRUNCATE TABLE ddd;
TRUNCATE TABLE ddi;

SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO state (abbreviation, name)
VALUES ('SP', 'São Paulo');

INSERT INTO city (id, name, state_abbreviation)
VALUES (1, 'São Paulo', 'SP');

INSERT INTO street_type (abbreviation, name)
VALUES ('R', 'Rua');
INSERT INTO street_type (abbreviation, name)
VALUES ('AV', 'Avenida');

INSERT INTO neighborhood (id, name)
VALUES (1, 'Centro');
INSERT INTO neighborhood (id, name)
VALUES (2, 'Jardins');

INSERT INTO street (id, name, street_type_abbreviation)
VALUES (1, 'Paulista', 'AV');
INSERT INTO street (id, name, street_type_abbreviation)
VALUES (2, 'Liberdade', 'R');

INSERT INTO address (id, zip_code, neighborhood_id, street_id, city_id)
VALUES (1, '01001-000', 1, 1, 1),
       (2, '01002-000', 2, 2, 1);

INSERT INTO ddi (number)
VALUES ('55');
INSERT INTO ddd (number)
VALUES ('11');
INSERT INTO ddd (number)
VALUES ('45');

INSERT INTO patient (patient_id, name, birth_date, gender, marital_status, identity_document, address_number, address_complement, address_id)
VALUES (1, 'João Silva', '1980-05-15', 'M', 'Solteiro', '123456789', 244, 'Apto 12', 1),
       (2, 'Maria Oliveira', '1990-08-22', 'F', 'Casada', '987654321', 153, 'Casa 3', 2),
       (3, 'Carlos Sousa', '1975-09-30', 'M', 'Divorciado', '456789123', 241, 'Apto 45', 1),
       (4, 'Ana Paula', '1985-12-10', 'F', 'Solteira', '123123123', 321, 'Casa 10', 2),
       (5, 'Ricardo Lima', '1992-04-17', 'M', 'Casado', '789789789', 51, 'Apto 67', 1),
       (6, 'John Doe', '2004-1-22', 'M', 'Casado', '789789789', 319, 'Apto 3', 1),
       (7, 'D Lorean Ipsum', '200-06-12', 'M', 'Casado', '789789789', 115, 'Apto 7', 1);

INSERT INTO patient_phone (id, number, ddd_id, ddi_id, patient_id)
VALUES (1, '912345678', '11', '55', 1),
       (2, '920004455', '45', '55', 1),
       (3, '988445533', '45', '55', 1),
       (4, '923456789', '11', '55', 2),
       (5, '934567890', '11', '55', 3),
       (6, '945678901', '11', '55', 4),
       (7, '956789012', '11', '55', 5);

INSERT INTO patient_email (id, email_address, patient_id)
VALUES (1, 'joao.silva@example.com', 1),
       (2, 'joao123.silva@lorem.com', 1),
       (3, 'maria.oliveira@example.com', 2),
       (4, 'carlos.sousa@example.com', 3),
       (5, 'ana.paula@example.com', 4),
       (6, 'ricardo.lima@example.com', 5);

INSERT INTO doctor (crm, name, email)
VALUES ('12345-SP', 'Dr. Pedro Mendes', 'dr.pedro@example.com'),
       ('67890-SP', 'Dra. Laura Farias', 'dr.laura@example.com'),
       ('11223-SP', 'Dr. Marcos Teixeira', 'dr.marcos@example.com');

INSERT INTO diagnosis (code, description)
VALUES ('A01', 'Infecção viral'),
       ('B02', 'Hipertensão'),
       ('C03', 'Diabetes Tipo 2');

INSERT INTO exam_type (code, name)
VALUES ('E01', 'Hemograma Completo'),
       ('E02', 'Raio X'),
       ('E03', 'Ultrassonografia'),
       ('E04', 'Tomografia'),
       ('E05', 'Ressonância Magnética');

INSERT INTO exam_result (id, result)
VALUES (1, 'Normal'),
       (2, 'Alterado'),
       (3, 'Dentro do esperado');

INSERT INTO medical_appointment (id, date, diagnosis_id, doctor_id, patient_id)
VALUES (1, '2024-01-15', 'A01', '12345-SP', 1),
       (2, '2024-02-20', 'B02', '67890-SP', 1),
       (3, '2024-03-10', 'C03', '11223-SP', 1),
       (4, '2024-01-12', 'A01', '67890-SP', 2),
       (5, '2024-02-18', 'B02', '11223-SP', 2),
       (6, '2024-03-15', 'C03', '12345-SP', 2),
       (7, '2024-01-20', 'A01', '11223-SP', 3),
       (8, '2024-02-22', 'B02', '12345-SP', 3),
       (9, '2024-03-18', 'C03', '67890-SP', 3),
       (10, '2024-01-25', 'A01', '12345-SP', 4),
       (11, '2024-02-28', 'B02', '67890-SP', 4),
       (12, '2024-03-20', 'C03', '11223-SP', 4),
       (13, '2024-01-30', 'A01', '67890-SP', 5),
       (14, '2024-02-25', 'B02', '11223-SP', 5),
       (15, '2024-03-25', 'C03', '12345-SP', 5),
       (16, '2024-05-28', 'C03', '12345-SP', 6);

INSERT INTO medical_exam (id, date, observations, result_id, exam_type_id, patient_id)
VALUES (1, '2024-01-16', 'Observação 1', 1, 'E01', 1),
       (2, '2024-01-17', 'Observação 2', 2, 'E02', 1),
       (3, '2024-01-18', 'Observação 3', 3, 'E03', 1),
       (4, '2024-01-19', 'Observação 4', 1, 'E04', 1),
       (5, '2024-01-20', 'Observação 5', 2, 'E05', 1),
       (6, '2024-02-16', 'Observação 1', 3, 'E01', 2),
       (7, '2024-02-17', 'Observação 2', 1, 'E02', 2),
       (8, '2024-02-18', 'Observação 3', 2, 'E03', 2),
       (9, '2024-02-19', 'Observação 4', 3, 'E04', 2),
       (10, '2024-02-20', 'Observação 5', 1, 'E05', 2),
       (11, '2024-03-16', 'Observação 1', 2, 'E01', 3),
       (12, '2024-03-17', 'Observação 2', 3, 'E02', 3),
       (13, '2024-03-18', 'Observação 3', 1, 'E03', 3),
       (14, '2024-03-19', 'Observação 4', 2, 'E04', 3),
       (15, '2024-03-20', 'Observação 5', 3, 'E05', 3),
       (16, '2024-04-16', 'Observação 1', 1, 'E01', 4),
       (17, '2024-04-17', 'Observação 2', 2, 'E02', 4),
       (18, '2024-04-18', 'Observação 3', 3, 'E03', 4),
       (19, '2024-04-19', 'Observação 4', 1, 'E04', 4),
       (20, '2024-04-20', 'Observação 5', 2, 'E05', 4),
       (21, '2024-05-16', 'Observação 1', 3, 'E01', 5),
       (22, '2024-05-17', 'Observação 2', 1, 'E02', 5),
       (23, '2024-05-18', 'Observação 3', 2, 'E03', 5),
       (24, '2024-05-19', 'Observação 4', 3, 'E04', 5),
       (25, '2024-05-20', 'Observação 5', 1, 'E05', 5);
