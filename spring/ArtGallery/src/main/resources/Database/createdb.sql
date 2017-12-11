create DATABASE ArtGallery;
use ArtGallery;

CREATE table Product(
  pid integer not null,
  name varchar(30) not null,
  description varchar(255),
  price INTEGER not NULL ,
  img varchar(255) ,
  primary key(pid));



CREATE TABLE Producttype(
  prid INTEGER PRIMARY KEY,
  type VARCHAR(40),
  desciption VARCHAR(40));

CREATE TABLE Types(
 tid INTEGER PRIMARY KEY,
 pid INTEGER ,
 prid INTEGER,
 FOREIGN KEY (prid) REFERENCES Producttype(prid)
);


CREATE TABLE inventory(
  id INTEGER PRIMARY KEY,
  pid INTEGER NOT NULL ,
  count INTEGER not NULL,
  date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP on UPDATE CURRENT_TIMESTAMP,
  FOREIGN KEY (pid) REFERENCES Product(pid)
);

create table customer(
  custid INTEGER PRIMARY KEY,
  name VARCHAR(255) NOT NULL UNIQUE ,
  email VARCHAR(255) not null,
  password VARCHAR(255),
  zipcode INTEGER,
  address varchar(255),
  role varchar(40)
);


CREATE TABLE orders(
  oid INTEGER PRIMARY KEY AUTO_INCREMENT,
  quantity INTEGER not null,
  custid INTEGER not null,
  placed INTEGER not null,
  order_date TIMESTAMP(3),
  FOREIGN KEY (custid) REFERENCES customer(custid)
);

insert into customer values(1,'smita','sm@gmail.com','123',96232,'homes','cust');
insert into customer values(2,'priya','sm@gmail.com','123',96232,'homes','cust');
insert into customer values(3,'amu','sm@gmail.com','123',96232,'homes','cust');
insert into customer values(4,'super','sm@gmail.com','123',96232,'homes','cust');

insert into Product VALUES (1,"Chair","Leather chair with soft cusion",50,"chair.png");
insert into Product VALUES (2,"Sofa","Leather chair with soft cusion",500,"chair.png");
insert into Product VALUES (3,"Table","Leather chair with soft cusion",60,"chair.png");
insert into Product VALUES (4,"ChairWodden","Leather chair with soft cusion",70,"chair.png");
insert into Product VALUES (5,"TV Table","Leather chair with soft cusion",150,"chair.png");
insert into Product VALUES (6,"Sofa cotton","Leather chair with soft cusion",650,"chair.png");

