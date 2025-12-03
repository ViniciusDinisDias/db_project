-- Reset do banco
DROP TABLE IF EXISTS Receita_Remedio;
DROP TABLE IF EXISTS Consulta;
DROP TABLE IF EXISTS Receita;
DROP TABLE IF EXISTS Estoque;
DROP TABLE IF EXISTS Remedio;
DROP TABLE IF EXISTS Sala;
DROP TABLE IF EXISTS Funcionario;
DROP TABLE IF EXISTS Paciente;
DROP TABLE IF EXISTS Cargo;
DROP TABLE IF EXISTS usuario;

CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL,
    enabled BOOLEAN NOT NULL
);

CREATE TABLE Cargo (
    id_cargo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE Paciente (
    id_paciente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    sexo VARCHAR(20) NOT NULL,
    telefone VARCHAR(15),
    data_nascimento DATE,
    cpf CHAR(11) UNIQUE,
    rg CHAR(9),
    endereco VARCHAR(120),
    cep CHAR(8),
    uf CHAR(2)
);

CREATE TABLE Funcionario (
    id_funcionario INT AUTO_INCREMENT PRIMARY KEY,
    id_cargo INT NOT NULL,
    nome VARCHAR(100) NOT NULL,
    sexo VARCHAR(20) NOT NULL,
    telefone VARCHAR(15),
    data_nascimento DATE,
    cpf CHAR(11) UNIQUE,
    rg CHAR(9),
    endereco VARCHAR(120),
    cep CHAR(8),
    uf CHAR(2),
    crm VARCHAR(6),
    coren VARCHAR(20),
    CONSTRAINT fk_funcionario_cargo FOREIGN KEY (id_cargo) REFERENCES Cargo(id_cargo)
);

CREATE TABLE Sala (
    id_sala INT AUTO_INCREMENT PRIMARY KEY,
    numero VARCHAR(10) NOT NULL,
    id_funcionario INT,
    CONSTRAINT fk_sala_func FOREIGN KEY (id_funcionario) REFERENCES Funcionario(id_funcionario)
);

CREATE TABLE Remedio (
    id_remedio INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(200)
);

CREATE TABLE Estoque (
    id_estoque INT AUTO_INCREMENT PRIMARY KEY,
    id_remedio INT NOT NULL,
    quantidade INT NOT NULL,
    data_entrada DATE,
    data_validade DATE,
    CONSTRAINT fk_estoque_remedio FOREIGN KEY (id_remedio) REFERENCES Remedio(id_remedio)
);

CREATE TABLE Receita (
    id_receita INT AUTO_INCREMENT PRIMARY KEY,
    id_paciente INT NOT NULL,
    id_funcionario INT NOT NULL,
    data_emissao DATE,
    observacoes VARCHAR(200),
    CONSTRAINT fk_receita_paciente FOREIGN KEY (id_paciente) REFERENCES Paciente(id_paciente),
    CONSTRAINT fk_receita_funcionario FOREIGN KEY (id_funcionario) REFERENCES Funcionario(id_funcionario)
);

CREATE TABLE Receita_Remedio (
    id_receita INT NOT NULL,
    id_remedio INT NOT NULL,
    quantidade VARCHAR(50),
    dosagem VARCHAR(50),
    periodo VARCHAR(50),
    PRIMARY KEY (id_receita, id_remedio),
    CONSTRAINT fk_rr_receita FOREIGN KEY (id_receita) REFERENCES Receita(id_receita),
    CONSTRAINT fk_rr_remedio FOREIGN KEY (id_remedio) REFERENCES Remedio(id_remedio)
);

CREATE TABLE Consulta (
    id_consulta INT AUTO_INCREMENT PRIMARY KEY,
    id_paciente INT NOT NULL,
    id_funcionario INT NOT NULL,
    id_sala INT,
    id_receita INT,
    diagnostico VARCHAR(200),
    data_hora DATETIME,
    temperatura DECIMAL(4,1),
    pressao VARCHAR(7),
    frequencia_cardiaca INT,
    CONSTRAINT fk_consulta_paciente FOREIGN KEY (id_paciente) REFERENCES Paciente(id_paciente),
    CONSTRAINT fk_consulta_func FOREIGN KEY (id_funcionario) REFERENCES Funcionario(id_funcionario),
    CONSTRAINT fk_consulta_sala FOREIGN KEY (id_sala) REFERENCES Sala(id_sala),
    CONSTRAINT fk_consulta_receita FOREIGN KEY (id_receita) REFERENCES Receita(id_receita)
);
