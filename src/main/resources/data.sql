-- The Spring loads this data into db , add your required data seeder below

INSERT INTO Category(name,description,state) VALUES ("Category-01","Description-Category-01",1);
INSERT INTO Category(name,description,state)  VALUES ("Category-02","Description-Category-02",1);
INSERT INTO Category(name,description,state)  VALUES ("Category-03","Description-Category-03",1);
INSERT INTO Category(name,description,state)  VALUES ("Category-04","Description-Category-04",0);
INSERT INTO Category(name,description,state)  VALUES ("Category-05","Description-Category-05",0);





INSERT INTO user(first_name, last_name,email,password,role,admin_enabled,zip) VALUES ('test','ltest','admin','admin123','ROLE_ADMIN',1,52557);