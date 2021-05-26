INSERT INTO tb_admins () VALUES ();
INSERT INTO tb_admins () VALUES ();

INSERT INTO tb_cards (user_name, bingo, admin_code) VALUES ('bob', FALSE, 1);
INSERT INTO tb_cards (user_name, bingo, admin_code) VALUES ('ana', FALSE, 1);
INSERT INTO tb_cards (user_name, bingo, admin_code) VALUES ('maria', FALSE, 2);

INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 1, 23, 1);
INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 2, 15, 1);
INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 3, 3, 1);
INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 4, 84, 1);
INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 5, 52, 1);
INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 1, 11, 2);
INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 2, 44, 2);
INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 3, 56, 2);
INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 4, 82, 2);
INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 5, 37, 2);
INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 1, 11, 3);
INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 2, 44, 3);
INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 3, 56, 3);
INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 4, 82, 3);
INSERT INTO tb_positions (market, position, valor, card_id) VALUES (FALSE, 5, 37, 3);


INSERT INTO tb_numbers (value, admin_code) VALUES (7, 1);
INSERT INTO tb_numbers (value, admin_code) VALUES (24, 1);
INSERT INTO tb_numbers (value, admin_code) VALUES (84, 1);
INSERT INTO tb_numbers (value, admin_code) VALUES (46, 2);