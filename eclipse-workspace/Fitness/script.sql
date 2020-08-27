use fitness;
create table `data` (`id` int(3) NOT NULL auto_increment,
		`gym_name` varchar(40) default null,
        `healthcare_name` varchar(40) default null,
        `city` varchar(20) default null,
        primary key (`id`));
insert into `data` values(1,'Gold gym','All in one', 'Delhi');
insert into `data` values(2,'Gold gym','All in one', 'Jaipur');
insert into `data` values(3,'Gold gym','All in one', 'Chennai');
insert into `data` values(4,'Gold gym','All in one', 'Pune');
insert into `data` values(5,'Gold gym','All in one', 'Bangalore');

insert into `data` values(6,'Gold gym','All in one', 'Gurugram');
insert into `data` values(7,'Gold gym','All in one', 'Noida');
insert into `data` values(8,'Gold gym','All in one', 'Kochi');
insert into `data` values(9,'Gold gym','All in one', 'Kolkata');
insert into `data` values(10,'Gold gym','All in one', 'Kanpur');

insert into `data` values(11,'Gold gym','All in one', 'Prayag');
insert into `data` values(12,'Gold gym','All in one', 'Lucknow');
insert into `data` values(13,'Gold gym','All in one', 'Dehradun');
insert into `data` values(14,'Gold gym','All in one', 'Mumbai');
insert into `data` values(15,'Gold gym','All in one', 'Sikkim');

insert into `data` values(16,'Fitmuscle gym','YouFit', 'Delhi');
insert into `data` values(17,'Fitmuscle gym','YouFit', 'Jaipur');
insert into `data` values(18,'Fitmuscle gym','YouFit', 'Chennai');
insert into `data` values(19,'Fitmuscle gym','YouFit', 'Bangalore');
insert into `data` values(20,'Fitmuscle gym','YouFit', 'Pune');
insert into `data` values(21,'Fitmuscle gym','YouFit', 'Mumbai');
insert into `data` values(22,'Fitmuscle gym','YouFit', 'Noida');

insert into `data` values(23,'Fitmuscle gym','YouFit', 'Goa');
insert into `data` values(24,'Fitmuscle gym','YouFit', 'Hydrabad');
insert into `data` values(25,'Fitmuscle gym','YouFit', 'Madurai');
insert into `data` values(26,'Fitmuscle gym','YouFit', 'Coimbatore');
insert into `data` values(27,'Fitmuscle gym','YouFit', 'Mysuru');
