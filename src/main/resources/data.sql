-- Inserindo categorias
INSERT INTO categoria (nome) VALUES ('PAPELARIA');
INSERT INTO categoria (nome) VALUES ('INFORMATICA');
INSERT INTO categoria (nome) VALUES ('CAMA MESA E BANHO');
INSERT INTO categoria (nome) VALUES ('CELULARES');
INSERT INTO categoria (nome) VALUES ('TELEVISORES');

-- Inserindo produtos
INSERT INTO produto (nome, preco, quantidade, id_categoria) VALUES ('Caderno', 15.00, 100, (SELECT id_categoria FROM categoria WHERE nome = 'PAPELARIA'));
INSERT INTO produto (nome, preco, quantidade, id_categoria) VALUES ('Caneta', 2.00, 500, (SELECT id_categoria FROM categoria WHERE nome = 'PAPELARIA'));
INSERT INTO produto (nome, preco, quantidade, id_categoria) VALUES ('Notebook', 3000.00, 50, (SELECT id_categoria FROM categoria WHERE nome = 'INFORMATICA'));
INSERT INTO produto (nome, preco, quantidade, id_categoria) VALUES ('Mouse', 50.00, 200, (SELECT id_categoria FROM categoria WHERE nome = 'INFORMATICA'));
INSERT INTO produto (nome, preco, quantidade, id_categoria) VALUES ('Travesseiro', 30.00, 300, (SELECT id_categoria FROM categoria WHERE nome = 'CAMA MESA E BANHO'));
INSERT INTO produto (nome, preco, quantidade, id_categoria) VALUES ('Lençol', 100.00, 150, (SELECT id_categoria FROM categoria WHERE nome = 'CAMA MESA E BANHO'));
INSERT INTO produto (nome, preco, quantidade, id_categoria) VALUES ('Smartphone', 2000.00, 80, (SELECT id_categoria FROM categoria WHERE nome = 'CELULARES'));
INSERT INTO produto (nome, preco, quantidade, id_categoria) VALUES ('Carregador', 100.00, 300, (SELECT id_categoria FROM categoria WHERE nome = 'CELULARES'));
INSERT INTO produto (nome, preco, quantidade, id_categoria) VALUES ('Televisão LED', 2500.00, 40, (SELECT id_categoria FROM categoria WHERE nome = 'TELEVISORES'));
INSERT INTO produto (nome, preco, quantidade, id_categoria) VALUES ('Controle Remoto', 80.00, 150, (SELECT id_categoria FROM categoria WHERE nome = 'TELEVISORES'));


-- Inserindo usuários
INSERT INTO usuario (nome, email, senha, dt_criacao) VALUES ('João da Silva', 'joao@example.com', 'senha123', '2025-01-01');
INSERT INTO usuario (nome, email, senha, dt_criacao) VALUES ('Maria Oliveira', 'maria@example.com', 'senha456', '2025-01-02');
INSERT INTO usuario (nome, email, senha, dt_criacao) VALUES ('Pedro Souza', 'pedro@example.com', 'senha789', '2025-01-03');

-- Inserindo itens no carrinho
INSERT INTO carrinho (id_usuario, id_produto, quantidade) VALUES ((SELECT id_usuario FROM usuario WHERE nome = 'João da Silva'), (SELECT id_produto FROM produto WHERE nome = 'Caderno'), 2);
INSERT INTO carrinho (id_usuario, id_produto, quantidade) VALUES ((SELECT id_usuario FROM usuario WHERE nome = 'Maria Oliveira'), (SELECT id_produto FROM produto WHERE nome = 'Notebook'), 1);
INSERT INTO carrinho (id_usuario, id_produto, quantidade) VALUES ((SELECT id_usuario FROM usuario WHERE nome = 'Pedro Souza'), (SELECT id_produto FROM produto WHERE nome = 'Smartphone'), 3);

-- Inserindo pedidos
INSERT INTO pedidos (id_usuario, total, dt_pedido, status) VALUES ((SELECT id_usuario FROM usuario WHERE nome = 'João da Silva'), 30.00, '2025-01-05 10:00:00', 'Em Processamento');
INSERT INTO pedidos (id_usuario, total, dt_pedido, status) VALUES ((SELECT id_usuario FROM usuario WHERE nome = 'Maria Oliveira'), 3000.00, '2025-01-06 14:30:00', 'Enviado');
INSERT INTO pedidos (id_usuario, total, dt_pedido, status) VALUES ((SELECT id_usuario FROM usuario WHERE nome = 'Pedro Souza'), 6000.00, '2025-01-07 16:45:00', 'Entregue');

-- Inserindo avaliações
INSERT INTO avaliacao (id_produto, id_usuario, nota, comentario) VALUES ((SELECT id_produto FROM produto WHERE nome = 'Caderno'), (SELECT id_usuario FROM usuario WHERE nome = 'João da Silva'), 5, 'Ótima qualidade!');
INSERT INTO avaliacao (id_produto, id_usuario, nota, comentario) VALUES ((SELECT id_produto FROM produto WHERE nome = 'Notebook'), (SELECT id_usuario FROM usuario WHERE nome = 'Maria Oliveira'), 4, 'Desempenho excelente, mas o preço é alto.');
INSERT INTO avaliacao (id_produto, id_usuario, nota, comentario) VALUES ((SELECT id_produto FROM produto WHERE nome = 'Smartphone'), (SELECT id_usuario FROM usuario WHERE nome = 'Pedro Souza'), 3, 'Bom, mas poderia ter uma bateria melhor.');
