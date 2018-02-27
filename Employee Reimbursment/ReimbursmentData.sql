
--CREATE DUMMY USERS
EXEC INSERT_EMPLOYEE('Nathan Poole', 'nathan.pooled@gmail.com', 'NathanDPoole', 'password1', 'Admin', 1);
EXEC INSERT_EMPLOYEE('John Doe', 'john.doe@revature.com', 'JohnDoe', 'password2', 'Accountant', 0);   
EXEC INSERT_EMPLOYEE('Mary Deer', 'mary.deer@revature.com', 'MaryDeer', 'password3', 'General Manager', 1);
EXEC INSERT_EMPLOYEE('Kevin Durant', 'kevin.durant@notthethunder.com', 'KevinDurant', 'password4', 'Shot Taker', 0);
EXEC INSERT_EMPLOYEE('Player Unknown', 'player.unknown@revature.com', 'PlayerUnknown', 'password5', 'Mail Room', 0);
SELECT * FROM EMPLOYEES;

--CREATE DUMMY DATA FOR USERS
--USER 1
EXEC INSERT_REQUEST(1/*NUMBER*/,10/*NUMBER*/,'Travel'/*VARCHAR2*/);
EXEC INSERT_REQUEST(1/*NUMBER*/,25/*NUMBER*/,'Company Phone'/*VARCHAR2*/);
EXEC INSERT_REQUEST(1/*NUMBER*/,50/*NUMBER*/,'Office Supplies'/*VARCHAR2*/);
EXEC INSERT_REQUEST(1/*NUMBER*/,100.75/*NUMBER*/,'Travel'/*VARCHAR2*/);
--USER 2
EXEC INSERT_REQUEST(2/*NUMBER*/,10/*NUMBER*/,'Travel'/*VARCHAR2*/);
EXEC INSERT_REQUEST(2/*NUMBER*/,25/*NUMBER*/,'Company Phone'/*VARCHAR2*/);
EXEC INSERT_REQUEST(2/*NUMBER*/,50/*NUMBER*/,'Office Supplies'/*VARCHAR2*/);
EXEC INSERT_REQUEST(2/*NUMBER*/,100.75/*NUMBER*/,'Travel'/*VARCHAR2*/);
--USER 3
EXEC INSERT_REQUEST(3/*NUMBER*/,10/*NUMBER*/,'Travel'/*VARCHAR2*/);
EXEC INSERT_REQUEST(3/*NUMBER*/,25/*NUMBER*/,'Company Phone'/*VARCHAR2*/);
EXEC INSERT_REQUEST(3/*NUMBER*/,50/*NUMBER*/,'Office Supplies'/*VARCHAR2*/);
EXEC INSERT_REQUEST(3/*NUMBER*/,100.75/*NUMBER*/,'Travel'/*VARCHAR2*/);
--USER 4
EXEC INSERT_REQUEST(4/*NUMBER*/,10/*NUMBER*/,'Travel'/*VARCHAR2*/);
EXEC INSERT_REQUEST(4/*NUMBER*/,25/*NUMBER*/,'Company Phone'/*VARCHAR2*/);
EXEC INSERT_REQUEST(4/*NUMBER*/,50/*NUMBER*/,'Office Supplies'/*VARCHAR2*/);
EXEC INSERT_REQUEST(4/*NUMBER*/,100.75/*NUMBER*/,'Travel'/*VARCHAR2*/);
--USER 5
EXEC INSERT_REQUEST(5/*NUMBER*/,10/*NUMBER*/,'Travel'/*VARCHAR2*/);
EXEC INSERT_REQUEST(5/*NUMBER*/,25/*NUMBER*/,'Company Phone'/*VARCHAR2*/);
EXEC INSERT_REQUEST(5/*NUMBER*/,50/*NUMBER*/,'Office Supplies'/*VARCHAR2*/);
EXEC INSERT_REQUEST(5/*NUMBER*/,100.75/*NUMBER*/,'Travel'/*VARCHAR2*/);
SELECT * FROM OPENREQUESTS;

--FINALIZE PART OF THE REQESTS FOR TESTING
--USER 1
EXEC FINALIZE_REQUEST(1/*NUMBER*/,'APPROVED'/*VARCHAR2*/,NULL/*VARCHAR2*/,1/*NUMBER*/);
EXEC FINALIZE_REQUEST(2/*NUMBER*/,'DENIED'/*VARCHAR2*/,NULL/*VARCHAR2*/,1/*NUMBER*/);
--USER 2
EXEC FINALIZE_REQUEST(5/*NUMBER*/,'APPROVED'/*VARCHAR2*/,NULL/*VARCHAR2*/,1/*NUMBER*/);
EXEC FINALIZE_REQUEST(6/*NUMBER*/,'DENIED'/*VARCHAR2*/,NULL/*VARCHAR2*/,1/*NUMBER*/);
--USER3
EXEC FINALIZE_REQUEST(9/*NUMBER*/,'APPROVED'/*VARCHAR2*/,NULL/*VARCHAR2*/,1/*NUMBER*/);
EXEC FINALIZE_REQUEST(10/*NUMBER*/,'DENIED'/*VARCHAR2*/,NULL/*VARCHAR2*/,1/*NUMBER*/);
--USER 4
EXEC FINALIZE_REQUEST(13/*NUMBER*/,'APPROVED'/*VARCHAR2*/,NULL/*VARCHAR2*/,1/*NUMBER*/);
EXEC FINALIZE_REQUEST(14/*NUMBER*/,'DENIED'/*VARCHAR2*/,NULL/*VARCHAR2*/,1/*NUMBER*/);
--USER 5
EXEC FINALIZE_REQUEST(17/*NUMBER*/,'APPROVED'/*VARCHAR2*/,NULL/*VARCHAR2*/,1/*NUMBER*/);
EXEC FINALIZE_REQUEST(18/*NUMBER*/,'DENIED'/*VARCHAR2*/,NULL/*VARCHAR2*/,1/*NUMBER*/);
SELECT * FROM CLOSEDREQUESTS;

EXEC UPDATE_EMPLOYEE(1, 'Nathan Poole', 'n8poole@gmail.com', 'NathanPoole', 'password1');
EXEC UPDATE_EMPLOYEE(1, 'Nathan Poole', 'nathan.poole@gmail.com', 'NathanPoole', 'password1');
SELECT * FROM EMPLOYEES;
