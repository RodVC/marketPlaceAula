
CREATE TABLE usuario (
                         id_usuario BIGINT AUTO_INCREMENT PRIMARY KEY,
                         nome VARCHAR(100) NOT NULL,
                         email VARCHAR(100) NOT NULL,
                         senha VARCHAR(100) NOT NULL,
                         dt_criacao DATE NOT NULL
);


CREATE TABLE categoria (
                         id_categoria INT AUTO_INCREMENT PRIMARY KEY,
                         nome VARCHAR(100) NOT NULL
);

CREATE TABLE produto (
                         id_produto BIGINT AUTO_INCREMENT PRIMARY KEY,
                         nome VARCHAR(100) NOT NULL,
                         preco DECIMAL(10, 2) NOT NULL,
                         quantidade INT NOT NULL,
                         id_categoria INT NOT NULL,
                         FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);


CREATE TABLE carrinho (
                         id_usuario BIGINT NOT NULL,
                         id_produto BIGINT NOT NULL,
                         quantidade INT NOT NULL,
                         PRIMARY KEY (id_usuario, id_produto),
                         FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
                         FOREIGN KEY (id_produto) REFERENCES produto(id_produto)
);

CREATE TABLE pedido (
                         id_pedido BIGINT AUTO_INCREMENT PRIMARY KEY,
                         id_usuario BIGINT NOT NULL,
                         total DECIMAL(10, 2) NOT NULL,
                         dt_pedido TIMESTAMP NOT NULL,
                         status VARCHAR(100) NOT NULL,
                         FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)

);

CREATE TABLE avaliacao (
                         id_avaliacao BIGINT AUTO_INCREMENT PRIMARY KEY,
                         id_produto BIGINT NOT NULL,
                         id_usuario BIGINT NOT NULL,
                         nota INT NOT NULL,
                         comentario VARCHAR(MAX) NOT NULL,
                         FOREIGN KEY (id_produto) REFERENCES produto(id_produto),
                         FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);
