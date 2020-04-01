drop database hxcxy;
create database hxcxy;
use hxcxy;

create table t_user(
 username varchar(40) primary key,
 realname varchar(100),
 password varchar(40),
 email varchar(40)
);

delete from t_user where username='100001';

alter table `t_user` convert to character set utf8;

insert into t_user(username,realname,password,email) 
values ('100001','赵家伟','123456','1916168788@qq.com');

select * from t_user;

set character_set_client = utf8;
set character_set_server = utf8;
set character_set_connection = utf8;
set character_set_database = utf8;
set character_set_results = utf8;
set collation_connection = utf8_general_ci;
set collation_database = utf8_general_ci;
set collation_server = utf8_general_ci;