--named function
create or replace function mulitply(i Number, j Number) -- leave off () if no parms
return Number
as myResult Number;
begin
    myResult := i*j;
    return myResult;
end
;
/ --end marker

--unnamed function good for running other functions
declare
    myVar Number;
begin
    myVar := multiply(10, 20);
    DBMS_OUTPUT.PUT_LINE(myVar);
end
;
/



-- approach 2
select mulitply(10, 20) from dual;

-- dual is a temporary table for storing the result of a function

select * from players
    where teams.id = getplayerid('Spongebob Squarepans');
    
--use || for string concat or CONCAT function
--UPPER(varchar); present in all uppercase