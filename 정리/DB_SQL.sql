/*
 * 		springboot 연동 쿼리
 * 
 */

/** 데이터베이스 생성 */
create database hrdb_spring;

use hrdb_spring;
select database();

-- 모든 테이브 ㄹ확인
show tables;

/** Employee 테이블 생성 */
/* 
 	create table [테이블명] (
 		컬럼명	데이터 타입	제약 사항,
 		...
 	)
 */
create table employee(
	sno		int		primary key,	-- 사원 번호
	name	varchar(10),			-- 이름
	address	varchar(30)
)

/** 데이터 입력 */
insert into member(name, sdate)
	values('spring', now());

select * from member;

 /** 데이터 수정 */
update member set name='spring boot'
	where id = 2;

select * from member;

/** 데이터 삭제 */
delete from member where id = 2;
select * from member;





USE hrdb_spring;

CREATE TABLE IF NOT EXISTS dwitter (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50),
  message VARCHAR(225),
  image VARCHAR(255),
  sdate DATE
);

select * from dwitter;

create database dwdb;
use dwdb;
select database();

/* dwitter */

create table dwitter(
	id int	auto_increment	primary key,
	name	varchar(50),
	message	varchar(225),
	image	varchar(255),
	sdate	date
);

INSERT INTO hrdb_spring.dwitter (name, message, image, sdate)
SELECT name, message, image, sdate FROM dwdb.dwitter;

show tables;
select * from dwitter;