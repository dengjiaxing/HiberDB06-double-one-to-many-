create table user(
userid int not null primary key  auto_increment ,
name varchar(20) default '',
password varchar(12) 
);


create table `address` (
  `addressid` int(11) not null auto_increment,
  `addressinfo` varchar(255) default null,
  `user_id` int(11) default null,
  primary key  (`addressid`),
  key `fk_user_address` (`user_id`),
  constraint `fk_user_address` foreign key  (`user_id`) references `user` (`userid`)
);
