--SELECT id, category_id, cusipid, fund_manger_name, fund_name, long_name, short_name FROM fund;
--
--delete from cf_37b85afb_91c2_4cc5_a801_35929f5a13c0.fund;
--
--
--INSERT INTO fund (id, category_id, cusipid, fund_manger_name, fund_name, long_name, short_name) VALUES (1, 1, '123', '123', '123', '123', '123');
--INSERT INTO fund (id, category_id, cusipid, fund_manger_name, fund_name, long_name, short_name) VALUES (2, 2, '234', '234', '234', '234', '234');
--INSERT INTO fund (id, category_id, cusipid, fund_manger_name, fund_name, long_name, short_name) VALUES (3, 3, '345', '345', '345', '345', '345');
--INSERT INTO fund (id, category_id, cusipid, fund_manger_name, fund_name, long_name, short_name) VALUES (4, 4, '456', '456', '456', '456', '456');
--INSERT INTO fund (id, category_id, cusipid, fund_manger_name, fund_name, long_name, short_name) VALUES (5, 5, '567', '567', '567', '567', '567');
--
--UPDATE cf_37b85afb_91c2_4cc5_a801_35929f5a13c0.fund SET fund_manger_name = '4567', fund_name = '4567', long_name = '45678', short_name = '45678' WHERE id = 1;
--
--
--CREATE TABLE cf_37b85afb_91c2_4cc5_a801_35929f5a13c0.fund (id int NOT NULL, category_id int NOT NULL, cusipid varchar(255), fund_manger_name varchar(255), fund_name varchar(255), long_name varchar(255), short_name varchar(255), PRIMARY KEY (id), CONSTRAINT UK_l51en0t4r2moovingw04h0366 UNIQUE (fund_name)) ENGINE=InnoDB DEFAULT CHARSET=utf8 DEFAULT COLLATE=utf8_unicode_ci;
--DROP TABLE cf_37b85afb_91c2_4cc5_a801_35929f5a13c0.fund;
