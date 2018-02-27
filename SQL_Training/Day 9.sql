--day 9 notes
OLAP VS OLTP
Online transaction processing
	regular usage
	should be faster
	indexes are applied
	normalizatin applied
Online analytical processing
	denormalize the data
	used for data warehousing
	indexes are removed

wildcards
	% any number of characters
	_ any one character


______________MISC______________________

savepiont save_12222017_1118;

--sub-query
delete from( select * from invoiceline where invoiceid >= 412;

rollback save_12222017_1118; --rollback by itself rolls back to the last commit
delete from invoice where invoiceid >= 412;
commit; -- once you commit you cant rollback past it


___________STORED PROCEDURES___________

CREATE OR REPLACE PROCEDURE printMsg(actualMsg varchar2)
as
begin
  DBMS_OUTPUT.PUT_LINE(actualMsg);
end
;
/


CREATE OR REPLACE PROCEDURE deleteInvoice(invoiceNumber Number)
AS
BEGIN
	delete from( select * from invoiceline where invoiceid >= invoiceNumber;
	delete from invoice where invoiceid >= Number;
END
;
/

--calls--
--approach 1
exec deleteInvoice(412);
rollback;

--approach 2--

begin
  deleteInvoice(412);
end
;
/


CREATE OR REPLACE PROCEDURE employeeNames(Name_Cursor OUT SYS_REFCURSTOR)
AS
BEGIN
  OPEN NAME_CURSOR FOR SELECT CONCAT(UPPER(SUBSTRING(FIRSTNAME, 1, 3)), LASTNAME) 
    FROM EMPLOYEE;
END;
/


DECLARE
	ANOTHERCURSORVAR SYS_REFCURSOTR;
	FULLNAME VARCHAR(25);
BEGIN
	EMPLOYEENAMES(ANOTHERCURSORVAR)
	LOOP
		FETCH ANOTHERCURSORVAR INTO FULLNAME;
		EXIT WHEN ANOTHERCURSORVAR%NOTFOUND;
		DBMS_OUTPUT.PUT_LINE('Employee full name is ' || FULLNAME);
	
	END LOOP;
END;
/

create sequence seq1
  minvalue 1
  maxvalue 10
  start with 1 
  increment by 1;
  
select seq1.currval, seq1.nextval from dual;
--good for creating sequential keys\

ex:
insert into playervalues('Cool player', 'RB', seq1.nextval, 5);
-- seq1 is incrementing playerID --

___________________Triggers__________________________

create table MovieNames(
	MovieID Number(10),
	MovieName varchar2(100),
	MovieGenre varchar2(10)k
	ReleasedYear date
);

creater table movies_audit_trail(
	moviename varchar(100),
	createdby varchar(25),
	creationtime timestamp
);

select * from movienames;
select * from movies_audit_trail;
--empty--

create or repLACE trigger movie_audits
after insert on movienames for each row
begin
  insert into movies_audit_trail values(:NEW.moviename, user, systimesamp);
end;
/

insert into Movienames values(playerseq.nextval, 'Father Figures', 'Comedy', to_date('2017', 'YEAR')


















