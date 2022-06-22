# SQL-DML 



## Category table

| CATENAME    | ID   | 분류   |
| ----------- | ---- | ------ |
| 메인상품    | 100  |        |
| 사이드      | 200  |        |
| 토핑류      | 300  |        |
| 빵          | 310  | 토핑   |
| 빵옵션      | 320  | 토핑   |
| 치즈        | 330  | 토핑   |
| 야채        | 340  | 토핑   |
| 야채 절임류 | 350  | 토핑   |
| 소스        | 360  | 토핑   |
| 기타        | 370  | 토핑   |
| 샌드위치    | 110  | 상품   |
| 샐러드      | 120  | 상품   |
| 랩          | 130  | 상품   |
| 프로모션    | 140  | 상품   |
| 음료        | 210  | 사이드 |
| 쿠키        | 220  | 사이드 |
| 칩          | 230  | 사이드 |
| 기타        | 240  | 사이드 |

```sql
-- category insert...

INSERT INTO category VALUES(100,"메인상품",NULL); 
INSERT INTO category VALUES(110,"샌드위치",100);
INSERT INTO category VALUES(120,"샐러드",100);
INSERT INTO category VALUES(130,"랩",100);
INSERT INTO category VALUES(140,"프로모션",100);
INSERT INTO category VALUES(150,"샌드위치",100);
INSERT INTO category VALUES(200,"사이드",NULL); 
INSERT INTO category VALUES(210,"음료",200);
INSERT INTO category VALUES(220,"쿠키",200); 
INSERT INTO category VALUES(230,"칩",200); 
INSERT INTO category VALUES(240,"기타",200);  
INSERT INTO category VALUES(300,"토핑",NULL); 
INSERT INTO category VALUES(310,"빵",300); 
INSERT INTO category VALUES(320,"빵옵션",300);
INSERT INTO category VALUES(330,"치즈",300); 
INSERT INTO category VALUES(340,"야채",300);
INSERT INTO category VALUES(350,"절입야채",300);  
INSERT INTO category VALUES(360,"소스",300); 
INSERT INTO category VALUES(370,"기타",300); 

SELECT * FROM category
```





## topping table



## product table

