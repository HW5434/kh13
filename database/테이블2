-- soccer 테이블 생성 구문
create table soccer(
rank number(2),
name varchar2(21),
win number(2),
draw number(2),
lose number(2)
);
drop table soccer;

-- account 테이블 생성 구문
create table account(
owner varchar2(21),
base_rate number(5,2),
plus_rate number(5,2),
monthly number,
period number(3)
);
drop table account;

-- player 테이블 생성 구문
create table player(
name varchar2(21),
event varchar2(60),
type char(6),
gold number(3),
silver number(3),
bronze number(3)
);

drop table player;

-- 테이블을 만들고 데이터를 추가하도록 코드 작성

-- 테이블 생성
create table student(
name varchar2(21),
score number(3)
);

-- 데이터 추가
-- insert into 테이블이름(형식들) values(값들);
-- (주의) 오라클에서 문자열은 외따옴표를 쓴다
insert into student(name, score) values('홍길동', 50);

-- 데이터 조회
-- select * from 테이블이름;
select * from student;



-- 통신사 요금제 테이블 생성 및 데이터 추가 코드
create table plan(
telecom char(2),
name varchar2(60),
month_price number,
data_gb number(4),
call_min number(4),
sms_count number(4)
);
drop table plan;

insert into plan(telecom, name, month_price, data_gb, call_min, sms_count)
values('SK', '5G언택트 52', 52000, 200, 1000, 2000);
insert into plan(telecom, name, month_price, data_gb, call_min, sms_count)
values('KT', '5G세이브', 45000, 100, 900, 1500);
insert into plan(telecom, name, month_price, data_gb, call_min, sms_count)
values('LG', '5G시그니처', 130000, 500, 2000, 2500);

select * from plan;

/*
	테이블 제약조건(table consetraint)
	- 테이블에 추가되는 데이터에 대한 조건을 설정할 수 있다
	- 종류는 null, 중복 , 값의범위 or 조건 등이 있다 
	- null을 허용하지 않으려면 컬럼 옆에 not null 키워드를 추가한다 
	- 중복을 허용하지 않으려면 컬럼 옆에 unique 키워드를 추가한다
	- 허용되는 값을 지정하려면 컬럼 옆에 check 키워드를 추가한다
 **/

create table menu(
menu_name varchar2(60)not null unique 
	check(regexp_like(menu_name,'^[가-힣]+$')), --regexp 레귤러 익스프레션 
menu_type varchar2(9)not null check(menu_type in ('디저트' , '음료')),
menu_price number not null check(menu_price >= 0),
--menu_event char(1) not null check(menu_event = 'Y' or menu_event = 'N')
menu_event char(1) not null check(menu_event IN ('Y' , 'N'))
);
drop table menu;

insert into menu(menu_name,menu_type,menu_price,menu_event)
values('아메 리카노','디저트',3000,'Y');
select * from menu;



create table class(
program varchar2(60) not null unique,
class_time number not null 
	check(class_time > 0 and mod(class_time,30) = 0),
class_pay number not null check(class_pay >= 0),
onoff char(12) not null check(onoff IN ('온라인' , '오프라인' , '혼합'))
);

drop table class;

insert into class(program , class_time , class_pay , onoff)
values('자바 마스터 과정' , 91 , 1000000 , '온라인');
insert into class(program , class_time , class_pay , onoff)
values('파이썬 기초' , 60 , 600000 , '온라인');
insert into class(program , class_time , class_pay , onoff)
values('웹 개발자 단기완성' , 120 , 1200000 , '오프라인');
select * from class;









