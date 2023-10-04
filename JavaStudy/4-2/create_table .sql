CREATE TABLE store_table(
store_code CHAR(4) NOT NULL,
store_name VARCHAR(20) NOT NULL,
store_nameAbc VARCHAR(50) NOT NULL,
update_day DATE NOT NULL,
CONSTRAINT pk_store PRIMARY KEY(store_code))
;

CREATE TABLE goods_table(
goods_code CHAR(4) NOT NULL,
goods_name VARCHAR(50) NOT NULL,
price INTEGER DEFAULT 0,
update_day DATE NOT NULL,
CONSTRAINT pk_goods PRIMARY KEY(goods_code)
);

CREATE TABLE stock_table(
goods_code CHAR(4) NOT NULL,
store_code CHAR(4) NOT NULL,
quantity INTEGER DEFAULT 0,
update_day DATE NOT NULL,
CONSTRAINT pk_stock PRIMARY KEY(goods_code, store_code),
FOREIGN KEY(goods_code) REFERENCES goods_table(goods_code),
FOREIGN KEY(store_code) REFERENCES store_table(store_code)
);