create database Vocabulary

use Vocabulary

create table words (
	id int primary key,
	word nvarchar(20),
	sentence nvarchar(100),
	definition nvarchar(40)
)

insert into words values (1, 'apparatus', 'you may consider replacing the whole apparatus', 'a set of tools to meet a purpose');
insert into words values (2, 'stopper', 'you need a new stopper', 'a stopper');
insert into words values (3, 'ease up on', 'ease up on your drag', 'relax effort');


