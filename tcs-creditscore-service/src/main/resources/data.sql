create table credit_score(pancard varchar(10) primary key, 
    customer_name varchar(40), creditscore int);
    
insert into credit_score(pancard,customer_name,creditscore) 
values('ABCD12345','James Gosling',500);
insert into credit_score(pancard,customer_name,creditscore) 
values('BLUP12356','Dennis Ritchie',750);
insert into credit_score(pancard,customer_name,creditscore) 
values('DEFG56789','Gavin King',550);
insert into credit_score(pancard,customer_name,creditscore) 
values('AABB11223','Rod Johnson',650);