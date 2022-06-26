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
INSERT INTO category VALUES(320,"빵길이",300);
INSERT INTO category VALUES(325,"토스트",300);
INSERT INTO category VALUES(330,"치즈",300); 
INSERT INTO category VALUES(340,"야채",300);
INSERT INTO category VALUES(350,"절입야채",300);  
INSERT INTO category VALUES(360,"소스",300); 
INSERT INTO category VALUES(370,"기타",300); 



 -- promotion inserts....
 
INSERT INTO product VALUES(NULL,"프로모션샌드위치1",4500,"test1.jpeg",sysdate(),140,1);
INSERT INTO product VALUES(NULL,"프로모션샌드위치2",4600,"test2.jpeg",sysdate(),140,1);
INSERT INTO product VALUES(NULL,"프로모션샌드위치3",4900,"test3.jpeg",sysdate(),140,1);
INSERT INTO product VALUES(NULL,"프로모션샌드위치4",5300,"test4.jpeg",sysdate(),140,1);
INSERT INTO product VALUES(NULL,"프로모션샌드위치5",3000,"test5.jpeg",sysdate(),140,1);

-- sandwitch inserts...

INSERT INTO product VALUES(NULL,"베지 아보카토",5400,"sandwitch1.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"로스트 치킨 아보카도",6400,"sandwitch2.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"터키 베이컨 아보카도",6500,"sandwitch3.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"로티셰리 바비큐 치킨",5900,"sandwitch4.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"이탈리안 비엠티",5200,"sandwitch5.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"쉬림프",5700,"sandwitch6.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"로스트치킨",5900,"sandwitch7.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"에그마요",4300,"sandwitch8.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"K-바비큐",6000,"sandwitch9.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"풀드 포크 바비큐",5900,"sandwitch10.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"비엘티",5200,"sandwitch11.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"미트볼",5200,"sandwitch12.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"햄",4700,"sandwitch13.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"참치",4800,"sandwitch14.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"써브웨이 클럽",5700,"sandwitch15.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"터키",5200,"sandwitch16.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"베지",3900,"sandwitch17.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"스테이크 & 치즈",6500,"sandwitch18.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"스파이시 이탈리안",5700,"sandwitch19.png",sysdate(),110,1);
INSERT INTO product VALUES(NULL,"치킨 데리야끼",5700,"sandwitch20.png",sysdate(),110,1);

-- salad inserts 

INSERT INTO product VALUES(null,"쉬림프",7900,"salad1.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"K-바비큐",8100,"salad2.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"로티세리 바비큐 치킨",8100,"salad3.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"풀드 포크 바비큐",8000,"salad4.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"이탈리안 비엠티",7400,"salad5.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"비엘티",7400,"salad6.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"미트볼",7300,"salad7.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"햄",6600,"salad8.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"참치",6600,"salad9.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"에그마요",6300,"salad10.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"로스트 치킨",8100,"salad11.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"서브웨이 클럽",7900,"salad12.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"터키",7300,"salad13.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"베지",5800,"salad14.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"스테이크 $ 치즈",8600,"salad15.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"터키 베이컨 아보카도",8600,"salad16.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"스파이시 이탈리안",7700,"salad17.png",sysdate(),120,1);
INSERT INTO product VALUES(null,"치킨 데리야끼",7700,"salad18.png",sysdate(),120,1);

-- side, lab inserts..
INSERT INTO product VALUES(NULL,"쉬림프 에그 그릴드 랩",5000,"wrap1.png",sysdate(),130,1);
INSERT INTO product VALUES(NULL,"스테이크 & 치즈 아보카도 그릴드 랩",5700,"wrap2.png",sysdate(),130,1);
INSERT INTO product VALUES(NULL,"치킨 베이컨 미니 그릴드 랩",2900,"wrap3.png",sysdate(),130,1);
INSERT INTO product VALUES(NULL,"스테이크 앤 치즈 아보카도 랩",5700,"wrap4.jpg",sysdate(),130,1);
INSERT INTO product VALUES(NULL,"쉬림프 에그마요 랩",5000,"wrap5.jpg",sysdate(),130,1);
INSERT INTO product VALUES(NULL,"치킨 베이컨 미니 랩",2900,"wrap6.jpg",sysdate(),130,1);

INSERT INTO product VALUES(NULL,"우유",5700,"milk.jpg",sysdate(),210,1);
INSERT INTO product VALUES(NULL,"탄산음료",1500,"soda.jpg",sysdate(),210,1);
INSERT INTO product VALUES(NULL,"커피",2000,"coffee.png",sysdate(),210,1);
INSERT INTO product VALUES(NULL,"더블 초코칩",1000,"cookie1.jpg",sysdate(),220,1);
INSERT INTO product VALUES(NULL,"초코칩",1000,"cookie2.jpg",sysdate(),220,1);
INSERT INTO product VALUES(NULL,"오트밀 레이즌",1000,"cookie3.jpg",sysdate(),220,1);
INSERT INTO product VALUES(NULL,"라즈베리 치즈케익",1000,"cookie4.jpg",sysdate(),220,1);
INSERT INTO product VALUES(NULL,"화이트 마카다미아",1000,"cookie5.jpg",sysdate(),220,1);
INSERT INTO product VALUES(NULL,"칩",1000,"chip.jpg",sysdate(),230,1);
INSERT INTO product VALUES(NULL,"웨지 포테이토",1500,"potato1.jpg",sysdate(),240,1);
INSERT INTO product VALUES(NULL,"Cheesy 웨지 포테이토",2000,"potato2.jpg",sysdate(),240,1);
INSERT INTO product VALUES(NULL,"Bacon Cheesy 웨지 포테이토",2300,"potato3.jpg",sysdate(),240,1);
INSERT INTO product VALUES(NULL,"해쉬브라운",1400,"potato4.jpg",sysdate(),240,1);
INSERT INTO product VALUES(NULL,"머쉬룸 수프",2900,"soup1.png",sysdate(),240,1);
INSERT INTO product VALUES(NULL,"브로콜리 체다 수프",2900,"soup2.png",sysdate(),240,1);
INSERT INTO product VALUES(NULL,"베이크 포테이토 수프",2900,"soup3.png",sysdate(),240,1);

-- topping inserts....



INSERT INTO topping VALUES(NULL,"허니오트",0,"bread1.png",310);
INSERT INTO topping VALUES(NULL,"하티",0,"bread2.png",310);
INSERT INTO topping VALUES(NULL,"위트",0,"bread3.png",310);
INSERT INTO topping VALUES(NULL,"파마산오레가노",0,"bread4.png",310);
INSERT INTO topping VALUES(NULL,"화이트",0,"bread5.png",310);
INSERT INTO topping VALUES(NULL,"플랫브레드",0,"bread6.png",310);


INSERT INTO topping VALUES(NULL,"15cm",0,null,320);
INSERT INTO topping VALUES(NULL,"30cm",3000,null,320);
INSERT INTO topping VALUES(NULL,"toast",0,null,325);
INSERT INTO topping VALUES(NULL,"none toast",0,null,325);

INSERT INTO topping VALUES(NULL,"양상추",0,"vegetable1.png",340);
INSERT INTO topping VALUES(NULL,"토마토",0,"vegetable2.png",340);
INSERT INTO topping VALUES(NULL,"오이",0,"vegetable3.png",340);
INSERT INTO topping VALUES(NULL,"피망",0,"vegetable4.png",340);
INSERT INTO topping VALUES(NULL,"양파",0,"vegetable5.png",340);
INSERT INTO topping VALUES(NULL,"피클",0,"vegetable6.png",340);
INSERT INTO topping VALUES(NULL,"올리브",0,"vegetable7.png",340);
INSERT INTO topping VALUES(NULL,"할라피뇨",0,"vegetable8.png",340);	


INSERT INTO topping VALUES(NULL,"아메리칸 치즈",0,"cheese1.png",330);
INSERT INTO topping VALUES(NULL,"슈레드 치즈",0,"cheese2.png",330);
INSERT INTO topping VALUES(NULL,"모차렐라 치즈",0,"cheese3.png",330);

INSERT INTO topping VALUES(NULL,"랜치",0,"sauce1.png",360);
INSERT INTO topping VALUES(NULL,"마요네즈",0,"sauce2.png",360);
INSERT INTO topping VALUES(NULL,"스위트 어니언",0,"sauce3.png",360);
INSERT INTO topping VALUES(NULL,"허니 머스타드",0,"sauce4.png",360);
INSERT INTO topping VALUES(NULL,"스위트 칠리",0,"sauce5.png",360);
INSERT INTO topping VALUES(NULL,"핫 칠리",0,"sauce6.png",360);
INSERT INTO topping VALUES(NULL,"사우스웨스트 치폴레",0,"sauce7.png",360);
INSERT INTO topping VALUES(NULL,"머스타드",0,"sauce8.png",360);
INSERT INTO topping VALUES(NULL,"홀스래디쉬",0,"sauce9.png",360);
INSERT INTO topping VALUES(NULL,"올리브 오일",0,"sauce10.png",360);
INSERT INTO topping VALUES(NULL,"레드와인식초",0,"sauce11.png",360);
INSERT INTO topping VALUES(NULL,"소금",0,"sauce12.png",360);
INSERT INTO topping VALUES(NULL,"후츠",0,"sauce13.png",360);
INSERT INTO topping VALUES(NULL,"스모크 바비큐",0,"sauce14.png",360);
INSERT INTO topping VALUES(NULL,"이탈리안 드레싱",0,"sauce15.png",360);

INSERT INTO topping VALUES(NULL,"에그마요",1600,"others1.png",370);
INSERT INTO topping VALUES(NULL,"오믈렛",1300,"others2.png",370);
INSERT INTO topping VALUES(NULL,"아보카도",1300,"others3.png",370);
INSERT INTO topping VALUES(NULL,"베이컨",1000,"others4.png",370);
INSERT INTO topping VALUES(NULL,"페퍼로니",900,"others5.png",370);
INSERT INTO topping VALUES(999,"선택안함",0,"noselect.png",300);


select * from orders;
select * from ordersDetail;
SELECT td.id, td.amount,t.id as topping, t.name as toppingName, td.ordersDId,td.tdPrice FROM toppingDetail td
INNER JOIN topping t ON td.toppingId = t.id;

        
 select * from topping;
```



