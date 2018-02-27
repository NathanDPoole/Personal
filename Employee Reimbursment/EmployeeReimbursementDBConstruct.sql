CREATE USER employeeUser
IDENTIFIED BY p4ssw0rd;
                        
GRANT connect to employeeUser;
GRANT resource to employeeUser;
GRANT create session TO employeeUser;
GRANT create table TO employeeUser;
GRANT create view TO employeeUser;

DROP TABLE EMPLOYEES;    
CREATE TABLE EMPLOYEES 
    (
    EMPID           NUMBER(10) PRIMARY KEY, 
    EMPLOYEENAME    VARCHAR2(20),
    EMAIL           VARCHAR(40),
    USERNAME        VARCHAR2(20),
    PW              VARCHAR2(100),
    TITLETYPE       VARCHAR2(50),
    ISMANAGER       NUMBER(1) DEFAULT 0 CHECK (ISMANAGER=1 OR ISMANAGER=0)
    );
    
DROP TABLE OPENREQUESTS;
CREATE TABLE OPENREQUESTS
    (
    REQUESTID       NUMBER(10) PRIMARY KEY,
    EMPID           NUMBER(10) NOT NULL,
    STATUS          VARCHAR(20) DEFAULT 'Pending',
    AMMOUT          NUMBER(10,2),
    REQUESTDESC     VARCHAR(150),
    OPENDATE        VARCHAR2(150),
    CLOSEDATE       VARCHAR2(150),
    NOTES           VARCHAR2(150),
    MANAGERCLOSEDID NUMBER(10),
    FOREIGN KEY (EMPID) REFERENCES EMPLOYEES(EMPID)
    );

DROP TABLE CLOSEDREQUESTS;
CREATE TABLE CLOSEDREQUESTS
    (
    REQUESTID       NUMBER(10) PRIMARY KEY,
    EMPID           NUMBER(10) NOT NULL,
    STATUS          VARCHAR2(20),
    AMMOUT          NUMBER(10,2),
    REQUESTDESC     VARCHAR2(150),
    OPENDATE        VARCHAR2(150),
    CLOSEDATE       VARCHAR2(150),
    NOTES           VARCHAR2(150),
    MANAGERCLOSEDID NUMBER(10),
    FOREIGN KEY (EMPID) REFERENCES EMPLOYEES(EMPID)
    );