--medal_List 테이블 생성 구문
--주석처리 : ctrl / 

--  account 생성 구문

create table account(
owner varchar2(21),
base_rate number(5,2),
plus_rate number(5,2),
monthly number,
period number(3)
);

-- medal_List 생성 구문
create table medal_list(
name varchar2(21),
event varchar2(33),
season varchar2(6),
gold_medal number(3),
silver_medal number(3),
bronze_medal number(3)
);
drop table medal_list;

