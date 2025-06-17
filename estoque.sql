CREATE DATABASE estoque;-- Criar o banco de dados

USE estoque; -- Seleciona o banco de dados

/*Criar a tabela de produtos */
CREATE TABLE produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,-- ID único para cada produto
    nome VARCHAR(100) NOT NULL,-- Nome do produto
    quantidade INT NOT NULL-- Quantidade disponível
);


SELECT * FROM produtos; -- Busca todos os produtos 


INSERT INTO produtos (nome, quantidade) VALUES ('void', void); -- Insere um novo produto na tabela


SELECT * FROM produtos ORDER BY quantidade DESC; -- Busca todos os produtos ordenados por quantidade

/*
Atualiza a quantidade de um produto específico.
O ID do produto deve ser informado.
*/
UPDATE produtos SET quantidade = void WHERE id = void;

DELETE FROM produtos WHERE id = void; -- Deleta um produto pelo ID

INSERT INTO produtos (nome, quantidade) VALUES 
('Teclado Mecânico', 10),
('Mouse Gamer', 15),
('Monitor 24"', 8),
('Cadeira Gamer', 5),
('Headset RGB', 12),
('Notebook Dell', 7),
('SSD 512GB', 20),
('Placa de Vídeo RTX 3060', 3),
('Processador Ryzen 5', 6),
('Memória RAM 16GB', 25),
('Fonte 750W', 9),
('Gabinete ATX', 11),
('Mousepad XXL', 30),
('Webcam Full HD', 4),
('Microfone Condensador', 13),
('Controle Xbox', 18),
('HD Externo 1TB', 14),
('Smartphone Samsung', 2),
('Tablet Apple', 5),
('Impressora HP', 7),
('Roteador Wi-Fi 6', 10),
('Carregador USB-C', 22),
('Cabo HDMI 2m', 35),
('Suporte para Monitor', 6),
('Adaptador Bluetooth', 9),
('Teclado sem fio', 12),
('Mouse sem fio', 17),
('Fone de ouvido Bluetooth', 8),
('Caixa de Som JBL', 11),
('Projetor LED', 3),
('Lâmpada Inteligente', 15),
('Echo Dot Alexa', 4),
('Smartwatch Xiaomi', 7),
('Bateria Externa 20000mAh', 5),
('Câmera de Segurança Wi-Fi', 6),
('Switch Gigabit', 9),
('Placa Mãe ASUS', 2),
('Cooler para CPU', 8),
('Ventoinha RGB', 10),
('Hub USB 3.0', 12),
('Adaptador USB para Ethernet', 7),
('Cabo de Rede Cat6', 20),
('Filtro de Linha', 14),
('Estabilizador de Energia', 5),
('Carregador de Notebook', 9),
('Dock Station', 3),
('Monitor Ultrawide', 4),
('Teclado Gamer RGB', 11),
('Mouse Gamer RGB', 13),
('Cadeira Ergonômica', 6),
('Mesa para Computador', 7),
('Suporte para Notebook', 8),
('Base Refrigerada para Notebook', 10),
('Adaptador VGA para HDMI', 5),
('Conversor de Áudio Digital', 3),
('Controle PS5', 9),
('Volante para PC', 2),
('Pedal para Simulador', 4),
('Placa de Captura', 6),
('Microfone USB', 7),
('Fone de Ouvido Profissional', 8),
('Amplificador de Áudio', 5),
('Mesa de Som', 3),
('Câmera DSLR', 2),
('Tripé para Câmera', 4),
('Ring Light', 6),
('Drone DJI', 1),
('Bateria para Drone', 3),
('Carregador para Drone', 2),
('Controle para Drone', 1),
('Smart TV 55"', 5),
('Soundbar Samsung', 4),
('Home Theater', 3),
('Console Xbox Series X', 2),
('Console PS5', 1),
('Jogos para PS5', 10),
('Jogos para Xbox', 8),
('Controle Nintendo Switch', 6),
('Dock Nintendo Switch', 4),
('Cartão de Memória 128GB', 12),
('Pendrive 64GB', 15),
('HD Interno 2TB', 7),
('SSD NVMe 1TB', 9),
('Placa de Som USB', 3),
('Adaptador USB-C para HDMI', 5),
('Carregador Rápido 30W', 6),
('Cabo Lightning para iPhone', 8),
('Cabo USB-C para Android', 10),
('Suporte para Celular', 12),
('Carregador Wireless', 7),
('Bateria para Notebook', 5),
('Adaptador de Tomada Universal', 4),
('Extensão Elétrica 3m', 9),
('Filtro de Linha Inteligente', 6),
('Luminária de Mesa LED', 8),
('Teclado Mecânico Compacto', 10),
('Mouse Ergonômico', 12),
('Monitor 27" 144Hz', 3),
('Placa de Vídeo RTX 4080', 2),
('Processador Intel i9', 1);

