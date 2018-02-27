select * from all_tables; --show all tables

/*
desc dual
desc SYSTEM_PRIVILEGE_MAP;
select * from SYSTEM_PRIVILEGE_MAP; --caution: dont mess with system talbs
*/


--create table w/o primary key
create table Player(
    name varchar2(50),
    position varchar2(50)
);
-- primary key: unique identifer that is never null
-- contains uniqeness and not null(both unique constrant and not null constraing)
-- primary keys can't be null, unique keys can have one null value

--diadvantage of not having a primary key

-- adding a player to Player
insert into Player values('Tom Brady', 'Quarter Back');

-- retrieve all data from Player
select * from Player;
-- * refers to (anyting but must have something) all records

-- try to insert duplicate record
insert into Player values('Tom Brady', 'Quarter Back');

--clear records before adding primary key
delete from Player;

--alter table
alter table Player 
add player_id Number(10) Primary KEY;

--commit saves the state of a database
--rollback returns the db to the last commit state

--describes a table
desc Player; -- not decending order
--desc at the end of a query displays contents in decending order

--make name not null
alter table Player
modify name Not null;

--inserting values in a defined order
-- I super dont care if they're in the wrong teams
insert into Player(PLAYER_ID, Name, POSITION, TEAM_ID) values(1, 'Tom Grady', 'QB', 1);
insert into Player values('Russel Wilson', 'QB', 2, 2);
insert into Player values('Aaron Rodgers', 'QB', 3, 3);
insert into Player values('Cam Newton', 'QB', 4, 4);
insert into Player values('Colin Capernick', 'QB', 5, 5);
insert into Player values('Matt Ryan', 'QB', 6, 4);
insert into Player values('Antother Player', 'QB', 7, 6);
insert into Player values('Kirk  Cousins', 'QB', 8, 8);
insert into Player values('Jarred Goff', 'QB', 9, 9);
insert into Player values('Payton Manning', 'QB', 10, 9);
insert into Player values('Eli Manning', 'QB', 11, 8);
insert into Player values('Drew Brees', 'QB', 12, 7);
insert into Player values('Ben Rothilsberg', 'QB', 13, 6);
insert into Player values('Jay Cuter', 'QB', 14, 5);
insert into Player values('Matt Stafford', 'QB', 15, 4);
insert into Player values('Joe Flaco', 'QB', 16, 3);

create table Teams (
    id number(10) Primary key, 
    team_name varchar2(50),
    city varchar2(20)
);

delete from Player;
alter table Player add team_id number(10);
alter table Player add foreign key (team_id) references Teams(id);

desc Player;
desc Teams;

alter table Player modify team_id not Null ;

insert into TEAMS values( 1, 'Patroits', 'New England');
insert into TEAMS values( 2, 'Seahawks', 'Seatle');
insert into TEAMS values( 3, 'Giants', 'New York');
insert into TEAMS values( 4, 'Falcons', 'Atlanta');
insert into TEAMS values( 5, 'Saints', 'New Orleans');
insert into TEAMS values( 6, 'Texans', 'Houston');
insert into TEAMS values( 7, 'Ravens', 'Baltamore');
insert into TEAMS values( 8, 'Ead Skins', 'DC');
insert into TEAMS values( 9, 'Broncos', 'Denver');

select * from PLAYER p join teams t
    on p.Team_id = t.id;


--aliasees can be used for tambe name or column names

--rename colum name inthe result
--selected only the columns that we needed
-- AS - aliases for the table
--inner join
--chose the order of columns
select 
    p.Team_id as teamid, 
    p.name as player_name,
    t.city as playing_for,
    t.team_name as favorite_teams
from player p join teams t 
    on p.team_id = t.id;
    
--outer join
select 
    p.Team_id as teamid, 
    p.name as player_name,
    t.city as playing_for,
    t.team_name as favorite_teams
from player p left join teams t 
    on p.team_id = t.id;
    
-- order by - sorts records by the given condition (default ASC)
-- DESC for decenting

-- group by - groups by similar values in a column
-- can only be applied to agragate funcitons
-- group by before order by

--scalar vs aggreegate
--scalar - trim, ltrim, rtrim, abs, round, trunc, length, rpad, lpad, instr, string functions, substring, to_char
--  non math funtions
--aggregate
--  math functions