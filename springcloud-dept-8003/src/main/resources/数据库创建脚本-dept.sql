DROP DATABASE IF EXISTS xxl_springboot_action ;
CREATE DATABASE xxl_springboot_action CHARACTER SET UTF8 ;
USE xxl_springboot_action ;
CREATE TABLE dept(
     deptno    bigint  auto_increment ,
     dname     varchar(50) ,
     loc       varchar(50) ,
     constraint pk_deptno primary key(deptno)
) engine=innodb ;
INSERT INTO dept(dname,loc) VALUES ('财务部','北京') ;
INSERT INTO dept(dname,loc) VALUES ('开发部','石家庄') ;
INSERT INTO dept(dname,loc) VALUES ('销售部','上海') ;
INSERT INTO dept(dname,loc) VALUES ('产品部','广州') ;
INSERT INTO dept(dname,loc) VALUES ('人事部','深圳') ;