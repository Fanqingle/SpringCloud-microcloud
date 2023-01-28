DROP DATABASE IF EXISTS yootk8001;
CREATE DATABASE yootk8001 CHARACTER SET UTF8;
USE yootk8001;
CREATE TABLE dept
(
    deptno BIGINT AUTO_INCREMENT,
    dname  VARCHAR(50),
    loc    VARCHAR(50),
    CONSTRAINT pk_deptno PRIMARY KEY (deptno)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
INSERT INTO dept(dname, loc)
VALUES ('开发部', database());
INSERT INTO dept(dname, loc)
VALUES ('财务部', database());
INSERT INTO dept(dname, loc)
VALUES ('市场部', database());
INSERT INTO dept(dname, loc)
VALUES ('后勤部', database());
INSERT INTO dept(dname, loc)
VALUES ('公关部', database());
COMMIT;
