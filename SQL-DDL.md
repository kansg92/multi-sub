```sql
DROP DATABASE IF EXISTS multisub;

CREATE DATABASE multisub;
USE multisub;


DROP TABLE IF EXISTS coupon;
DROP TABLE IF EXISTS useres;
DROP TABLE IF EXISTS couponDetail;
DROP TABLE IF EXISTS usersType;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS topping;
DROP TABLE IF EXISTS toppingDetail;
DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS nutrition;
DROP TABLE IF EXISTS ordersDetail;
DROP TABLE IF EXISTS orders;


-- create table nutrition
CREATE TABLE nutrition(
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    kcal DOUBLE NOT NULL,
    gram DOUBLE NOT NULL,
    protein DOUBLE NOT NULL,
    fat DOUBLE NOT NULL,
    sugar DOUBLE NOT NULL,
    salt DOUBLE NOT NULL
);

INSERT INTO nutrition VALUES(NULL,341,205,25,10,10,5);

-- create category tables
CREATE TABLE category(
	id INT PRIMARY KEY NOT NULL,
    name VARCHAR(30),
    pid INT
);

ALTER TABLE category
ADD FOREIGN KEY (pid) REFERENCES category (id);

INSERT INTO category VALUES(1,"test",NULL); 
INSERT INTO category VALUES(2,"test2",NULL); 

-- CREATE product table
CREATE TABLE product (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	name VARCHAR(30),
	price INT,
    imgname VARCHAR(30),
    regdate DATE,
    cateid INT,
    nutId INT
);

ALTER TABLE product
ADD FOREIGN KEY (nutid) REFERENCES nutrition (id);
ALTER TABLE product
ADD FOREIGN KEY (cateid) REFERENCES category (id);


INSERT INTO product VALUES(NULL,"샌드위치1",5000,"샌드위치1",sysdate(),1,1);


-- create topping table
CREATE TABLE topping (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(30),
    price INT,
    imgname VARCHAR(30),
    cateid INT
);

ALTER TABLE topping
ADD FOREIGN KEY (cateid) REFERENCES category (id);

INSERT INTO topping VALUES(NULL,"야채",0,"야채사진",2);
INSERT INTO topping VALUES(NULL,"야채2",0,"야채사진",1);




-- create usersType tables
CREATE TABLE usersType(
	id INT PRIMARY KEY,
    userType VARCHAR(10),
    regdate Date
);

INSERT INTO usersType VALUES (100,"비회원",sysdate());
INSERT INTO usersType VALUES (200,"회원",sysdate());
INSERT INTO usersType VALUES (300,"직원",sysdate());

-- create users tables
CREATE TABLE users(
	id VARCHAR(30) PRIMARY KEY NOT NULL,
	pwd VARCHAR(30) NOT NULL,
    name VARCHAR(30) NOT NULL,
    email VARCHAR(50) NOT NULL,
	addr VARCHAR(50) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    point INT,
    membersip Varchar(30) NOT NULL,
    regdate date,
    userTypeId INT
 
);

ALTER TABLE users
ADD FOREIGN KEY (userTypeId) REFERENCES usersType (id);

INSERT INTO users VALUES ("id01","pwd01","비회원계정","email","seoul","010-1234-5678","0","M-100-12345",sysdate(),100);



-- create orders table
CREATE TABLE orders (
	id int primary KEY AUTO_INCREMENT NOT NULL,
    price INT NOT NULL,
    payInfo VARCHAR(10),
    regdate Date NOT NULL,
    payState Varchar(10),
    udate DATE,
    usersID VARCHAR(30) NOT NULL
);


ALTER TABLE orders
ADD FOREIGN KEY (usersID) REFERENCES users (id);

INSERT INTO orders VALUES (NULL,10000,"현금",sysdate(),"결제완료",NULL,"id01");


-- create ordersdetail table
CREATE TABLE ordersDetail(
	id int PRIMARY KEY AUTO_INCREMENT NOT NULL,
    amount INT NOT NULL,
    odPrice INT NOT NULL,
    prodId INT,
    ordersId INT
);

ALTER TABLE ordersDetail
ADD FOREIGN KEY (prodid) REFERENCES product(id);
ALTER TABLE ordersDetail
ADD FOREIGN KEY (ordersId) REFERENCES orders (id);

INSERT INTO ordersDetail VALUES (NULL,1,10000,1,1);

-- create coupon tabels
CREATE TABLE coupon (
	id INT primary KEY NOT NULL auto_increment,
    name VARCHAR(30),
	discount double,
    regdate DATE NOT NULL,
    expirDate DATE,
    expirYN INT NOT NULL
);

INSERT INTO coupon VALUES (NULL,"기본쿠폰",0.1,sysdate(),"2023-06-16",0);

-- create couponDetail tables
CREATE TABLE couponDetail (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	state VARCHAR(10) NOT NULL,
	useDate Date,
    userId VARCHAR(30),
    couponId INT,
    ordersDId INT
);

ALTER TABLE couponDetail
ADD FOREIGN KEY (userId) REFERENCES users (id);
ALTER TABLE couponDetail
ADD FOREIGN KEY (couponId) REFERENCES coupon (id);
ALTER TABLE couponDetail
ADD FOREIGN KEY (ordersDId) REFERENCES ordersDetail (id);

INSERT INTO couponDetail VALUES (NULL,"미사용",NULL,"id01",1,1);



-- crete toppingDetail table
CREATE TABLE toppingDetail(
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    amount INT ,
	tdPrice INT NOT NULL,
    toppingId INT,
    ordersDId INT
);

ALTER TABLE toppingDetail
ADD FOREIGN KEY (toppingId) REFERENCES topping (id);
ALTER TABLE toppingDetail
ADD FOREIGN KEY (ordersDId) REFERENCES ordersDetail(id);

INSERT INTO toppingDetail VALUES(NULL,3,500,1,1);
INSERT INTO toppingDetail VALUES(NULL,3,1000,2,1);


SELECT td.id, td.amount, t.name as toppingName, td.ordersDId,td.tdPrice FROM toppingDetail td
INNER JOIN topping t ON td.toppingId = t.id;





SELECT od.id, od.ordersId, od.amount, c.name as cateName, p.name as prodName,
	o.regdate as paydate, o.payinfo as payInfo, o.payState as payState,
    o.udate as udate, od.odPrice as odPrice
	FROM ordersDetail od
	INNER JOIN orders o ON o.id = od.ordersId
	INNER JOIN product p ON p.id = od.prodId
	INNER JOIN category c ON p.cateid = c.id;


select * from product;
```

