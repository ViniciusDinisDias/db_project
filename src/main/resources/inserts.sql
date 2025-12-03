-- Cargos
INSERT INTO Cargo (nome) VALUES
('Médico'),
('Enfermeiro'),
('Recepcionista');
-- Funcionários
INSERT INTO Funcionario (id_cargo, nome, sexo, telefone, data_nascimento, cpf, rg, endereco, cep, uf, crm, coren)
VALUES
(1, 'Dr. João Silva', 'Masculino', '11999998888', '1980-05-12', '12345678901', '123456789', 'Rua A, 100', '01001000', 'SP', '123456', NULL),
(1, 'Dra. Maria Souza', 'Feminino', '11988887777', '1985-09-20', '98765432100', '987654321', 'Rua B, 200', '02002000', 'SP', '654321', NULL),
(2, 'Enf. Pedro Santos', 'Masculino', '11977776666', '1990-01-15', '32165498700', '112233445', 'Rua C, 300', '03003000', 'SP', NULL, 'ENF12345'),
(3, 'Ana Oliveira', 'Feminino', '11966665555', '1995-11-10', '74185296300', '223344556', 'Rua D, 400', '04004000', 'SP', NULL, NULL),
(1, 'Dr. Luiz Ferreira', 'Masculino', '11955553333', '1978-08-22', '55544433322', '112244668', 'Rua H, 800', '08008000', 'SP', '998877', NULL),
(2, 'Enf. Carla Ribeiro', 'Feminino', '11944442222', '1989-10-05', '66655544433', '667788990', 'Rua I, 900', '09009000', 'SP', NULL, 'ENF54321'),
(3, 'Paulo Mendes', 'Masculino', '11933331111', '1993-02-28', '77766655544', '556677889', 'Rua J, 1000', '10010000', 'SP', NULL, NULL),
(1, 'Dr. Ricardo Alves', 'Masculino', '11922229999', '1982-04-30', '88877766655', '445566778', 'Rua K, 1100', '11011000', 'SP', '112233', NULL),
(2, 'Enf. Helena Costa', 'Feminino', '11911118888', '1991-06-14', '99988877766', '334455667', 'Rua L, 1200', '12012000', 'SP', NULL, 'ENF67890'),
(3, 'Camila Duarte', 'Feminino', '11910101010', '1996-03-19', '10101010199', '223355779', 'Rua M, 1300', '13013000', 'SP', NULL, NULL);

-- Pacientes
INSERT INTO Paciente (nome, sexo, telefone, data_nascimento, cpf, rg, endereco, cep, uf)
VALUES
('Carlos Mendes', 'Masculino', '11955554444', '2000-03-05', '11122233344', '998877665', 'Rua E, 500', '05005000', 'SP'),
('Fernanda Lima', 'Feminino', '11944443333', '1992-07-18', '22233344455', '887766554', 'Rua F, 600', '06006000', 'SP'),
('José Almeida', 'Masculino', '11933332222', '1975-12-22', '33344455566', '776655443', 'Rua G, 700', '07007000', 'SP'),
('Mariana Rocha', 'Feminino', '11922221111', '1988-11-02', '44455566677', '665544332', 'Rua N, 1400', '14014000', 'SP'),
('Rafael Teles', 'Masculino', '11911112222', '1999-01-08', '55566677788', '554433221', 'Rua O, 1500', '15015000', 'SP'),
('Bianca Torres', 'Feminino', '11910102020', '2001-09-15', '66677788899', '443322110', 'Rua P, 1600', '16016000', 'SP'),
('Lucas Martins', 'Masculino', '11990909090', '1987-04-10', '77788899900', '332211009', 'Rua Q, 1700', '17017000', 'SP'),
('Patrícia Gomes', 'Feminino', '11980808080', '1994-05-20', '88899900011', '221100998', 'Rua R, 1800', '18018000', 'SP'),
('Eduardo Barbosa', 'Masculino', '11970707070', '1983-12-19', '99900011122', '110099887', 'Rua S, 1900', '19019000', 'SP'),
('Juliana Freire', 'Feminino', '11960606060', '1997-02-14', '10020030040', '009988776', 'Rua T, 2000', '20020000', 'SP');

-- Salas
INSERT INTO Sala (numero, id_funcionario) VALUES
('101', 1),
('102', 2);
-- Remédios
INSERT INTO Remedio (nome, descricao) VALUES
('Paracetamol', 'Analgésico e antitérmico'),
('Amoxicilina', 'Antibiótico'),
('Dipirona', 'Analgésico e antitérmico'),
('Ibuprofeno', 'Anti-inflamatório'),
('Omeprazol', 'Inibidor de bomba de prótons'),
('Loratadina', 'Antialérgico'),
('Azitromicina', 'Antibiótico'),
('Cetoprofeno', 'Anti-inflamatório'),
('Prednisona', 'Corticosteroide'),
('Ranitidina', 'Reduz a acidez estomacal');

-- Estoque
INSERT INTO Estoque (id_remedio, quantidade, data_entrada, data_validade) VALUES
(1, 100, '2025-01-01', '2026-01-01'),
(2, 50, '2025-02-01', '2025-12-31'),
(3, 200, '2025-03-01', '2026-03-01'),
(4, 150, '2025-04-10', '2026-04-10'),
(5, 180, '2025-05-12', '2027-05-12'),
(6, 90,  '2025-06-03', '2026-06-03'),
(7, 60,  '2025-07-20', '2026-07-20'),
(8, 130, '2025-08-25', '2026-08-25'),
(9, 70,  '2025-09-14', '2027-09-14'),
(10, 40, '2025-10-01', '2026-10-01');
-- Receita (Dr. João prescrevendo para Carlos)
INSERT INTO Receita (id_paciente, id_funcionario, data_emissao, observacoes)
VALUES
(1, 1, '2025-09-01', 'Paciente com febre e dor de cabeça'),
(2, 2, '2025-09-03', 'Sintomas gripais leves'),
(3, 1, '2025-09-05', 'Dores musculares'),
(4, 5, '2025-09-06', 'Refluxo frequente'),
(5, 6, '2025-09-10', 'Crise alérgica'),
(6, 8, '2025-09-12', 'Dor estomacal'),
(7, 1, '2025-09-14', 'Infecção bacteriana'),
(8, 9, '2025-09-15', 'Tosse persistente'),
(9, 4, '2025-09-18', 'Dor intensa'),
(10,7, '2025-09-20', 'Avaliação preliminar');

-- Receita -> Remédios
INSERT INTO Receita_Remedio (id_receita, id_remedio, quantidade, dosagem, periodo)
VALUES
(1, 1, '10 comprimidos', '500mg', '8/8h por 5 dias'),
(2, 3, '12 comprimidos', '500mg', '6/6h por 3 dias'),
(3, 4, '15 comprimidos', '400mg', '12/12h por 7 dias'),
(4, 5, '30 cápsulas', '20mg', '1x ao dia'),
(5, 6, '10 comprimidos', '10mg', '1x ao dia por 3 dias'),
(6, 10, '8 comprimidos', '150mg', '2x ao dia'),
(7, 7, '6 comprimidos', '500mg', '1x ao dia por 5 dias'),
(8, 2, '10 cápsulas', '500mg', '1x ao dia por 3 dias'),
(9, 9, '5 comprimidos', '20mg', '1x ao dia'),
(10,8, '10 comprimidos', '50mg', '2x ao dia por 4 dias');

-- Consulta
INSERT INTO Consulta (id_paciente, id_funcionario, id_sala, id_receita, diagnostico, data_hora, temperatura, pressao, frequencia_cardiaca)
VALUES
(1, 1, 1, 1, 'Infecção viral', '2025-09-01 10:00:00', 38.5, '120/80', 90),
(2, 2, 2, NULL, 'Check-up de rotina', '2025-09-02 15:00:00', 36.8, '110/70', 75),
(3, 1, 1, 3, 'Dores musculares', '2025-09-05 09:00:00', 37.6, '118/78', 82),
(4, 5, 1, 4, 'Refluxo gástrico', '2025-09-06 11:30:00', 36.5, '115/76', 70),
(5, 6, 2, 5, 'Alergia aguda', '2025-09-10 14:30:00', 37.0, '112/72', 80),
(6, 8, 1, 6, 'Dor estomacal', '2025-09-12 16:10:00', 36.7, '119/77', 78),
(7, 1, 2, 7, 'Infecção bacteriana', '2025-09-14 10:45:00', 38.2, '124/82', 95),
(8, 9, 2, 8, 'Tosse persistente', '2025-09-15 17:20:00', 37.4, '117/74', 88),
(9, 4, 1, 9, 'Dor crônica', '2025-09-18 09:45:00', 36.6, '110/70', 72),
(10,7, 2, 10, 'Avaliação geral', '2025-09-20 08:50:00', 36.9, '113/75', 76);


-- Usuários
INSERT INTO usuario (username, senha, role, enabled) VALUES
('admin', 'admin', 'ROLE_ADMIN', TRUE),
('medico1', '123456', 'ROLE_MEDICO', TRUE),
('recep1', '123456', 'ROLE_RECEP', TRUE),
('medico2', '123456', 'ROLE_MEDICO', TRUE),
('enfermeiro1', '123456', 'ROLE_ENF', TRUE),
('enfermeiro2', '123456', 'ROLE_ENF', TRUE),
('recep2', '123456', 'ROLE_RECEP', TRUE),
('user1', '123456', 'ROLE_USER', TRUE),
('user2', '123456', 'ROLE_USER', TRUE),
('admin2', 'admin2', 'ROLE_ADMIN', TRUE);