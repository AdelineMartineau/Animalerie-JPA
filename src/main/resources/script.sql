USE animalerie;

create table address (
     ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
     number varchar(255),
     street varchar(255),
     zipcode varchar(255),
     city varchar(255)
);

create table petstore (
      ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
      name varchar(255),
      managerName varchar(255),
      idaddress int,
      foreign key (idaddress) references address(id)
);

create table animal (
    ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    birthDate Date,
    color varchar(255),
    idpetstore int,
    foreign key (idpetstore) references petstore(id)
)

create table product (
     ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
     code varchar(255),
     label varchar(255),
     prodtype ENUM('food','accessory','cleaning'),
     price DOUBLE
)

create table petstorProduct (
    idpetstore int not null,
    idproduct int not null,
    primary key(idpetstore,idproduct),
    foreign key (idpetstore) references petstore(id),
    foreign key (idproduct) references product(id)
)

create table fish (
    prodtype ENUM('fresh_water','sea_water')
);

create table cat (
    chipId VARCHAR(255)
);

INSERT INTO address VALUES (1, 8, 'rue Konrad Adenauer', 44200, 'Nantes');
INSERT INTO address VALUES (2, 4, 'boulevard vincent Gâche', 46000, 'Lyon');
INSERT INTO address VALUES (3, 6, 'allée des plantes vertes', 69000, 'Les Essarts');

INSERT INTO petstore VALUES (1, '1234', 'John Doe', 1);
INSERT INTO petstore VALUES (2, '5678', 'Mattie Cooke', 2);
INSERT INTO petstore VALUES (3, '9128', 'Isa Bella', 3);

INSERT INTO animal VALUES (1, '2021-01-12', 'black', 1);
INSERT INTO animal VALUES (2, '2020-02-06', 'brown', 2);
INSERT INTO animal VALUES (3, '2019-01-05', 'white', 3);
INSERT INTO animal VALUES (4, '2018-05-12', 'gray', 1);USE animalerie;