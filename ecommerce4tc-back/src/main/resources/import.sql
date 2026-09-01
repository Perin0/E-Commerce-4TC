INSERT INTO categoria (nome, descricao) VALUES ('Informatica', 'Produto de Informatica');
INSERT INTO categoria (nome, descricao) VALUES ('Livros', 'Livros Tecnicos');
INSERT INTO categoria (nome, descricao) VALUES ('Eletronicos', 'Aparelhos Eletronicos');
INSERT INTO categoria (nome, descricao) VALUES ('Acessórios', 'Itens de acessório');
INSERT INTO categoria (nome, descricao) VALUES ('Beleza', 'Itens de Beleza');

INSERT INTO produto (nome, descricao, preco, estoque, categoria_id) VALUES ('Código Limpo', 'Livro do autor Robert C. Martin', 100.00, 20, 2);
INSERT INTO produto (nome, descricao, preco, estoque, categoria_id) VALUES ('Notebook Dell Inspiron', 'Notebook para uso profissional e pessoal', 3500.00, 10, 1);
INSERT INTO produto (nome, descricao, preco, estoque, categoria_id) VALUES ('Código Limpo', 'Livro do autor Robert C. Martin sobre boas práticas de programação', 100.00, 20, 2);
INSERT INTO produto (nome, descricao, preco, estoque, categoria_id) VALUES ('Fone de Ouvido Bluetooth', 'Fone de ouvido sem fio com conexão Bluetooth', 150.00, 30, 3);
INSERT INTO produto (nome, descricao, preco, estoque, categoria_id) VALUES ('Mouse Sem Fio', 'Mouse óptico sem fio para computadores e notebooks', 80.00, 25, 4);

INSERT INTO cliente (email, nome, telefone) VALUES ('gui@gmail.com', 'Guilherme Olavo', '(13)99756-7339');
INSERT INTO cliente (email, nome, telefone) VALUES ('ana@gmail.com', 'Ana Carolina Souza', '(11)98876-1234');
INSERT INTO cliente (email, nome, telefone) VALUES ('carlos@gmail.com', 'Carlos Eduardo Lima', '(21)97765-4321');
INSERT INTO cliente (email, nome, telefone) VALUES ('mariana@gmail.com', 'Mariana Oliveira', '(31)96654-8765');
INSERT INTO cliente (email, nome, telefone) VALUES ('joao@gmail.com', 'João Pedro Santos', '(41)95543-2109');

INSERT INTO pedido (cliente_id, data, status) VALUES (1, '2026-01-01 00:00:01', 'pago');
INSERT INTO pedido (cliente_id, data, status) VALUES (2, '2026-01-05 14:30:00', 'pago');
INSERT INTO pedido (cliente_id, data, status) VALUES (3, '2026-01-10 10:15:00', 'enviado');
INSERT INTO pedido (cliente_id, data, status) VALUES (4, '2026-01-15 16:45:00', 'processando');
INSERT INTO pedido (cliente_id, data, status) VALUES (5, '2026-01-15 18:45:00', 'processando');

INSERT INTO item_pedido (pedido_id, produto_id, quantidade, valor_unitario) VALUES (1, 1, 1, 23.99);
INSERT INTO item_pedido (pedido_id, produto_id, quantidade, valor_unitario) VALUES (1, 1, 1, 100.00);
INSERT INTO item_pedido (pedido_id, produto_id, quantidade, valor_unitario) VALUES (2, 2, 1, 3500.00);
INSERT INTO item_pedido (pedido_id, produto_id, quantidade, valor_unitario) VALUES (2, 4, 2, 150.00);
INSERT INTO item_pedido (pedido_id, produto_id, quantidade, valor_unitario) VALUES (3, 5, 1, 80.00);

INSERT INTO pagamento (pedido_id, valor, data, status, tipo) VALUES (1, 23.99, '2026-01-01 00:00:01', 'pago', 'cartão');
INSERT INTO pagamento (pedido_id, valor, data, status, tipo) VALUES (2, 100.00, '2026-01-05 14:31:00', 'pago', 'pix');
INSERT INTO pagamento (pedido_id, valor, data, status, tipo) VALUES (3, 3500.00, '2026-01-10 10:16:00', 'pago', 'cartão');
INSERT INTO pagamento (pedido_id, valor, data, status, tipo) VALUES (4, 300.00, '2026-01-10 10:17:00', 'pago', 'pix');
INSERT INTO pagamento (pedido_id, valor, data, status, tipo) VALUES (5, 80.00, '2026-01-15 16:46:00', 'pendente', 'boleto');



