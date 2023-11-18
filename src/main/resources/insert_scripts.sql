INSERT INTO code.players(id, age, email, gender, `level`)
VALUES(1, 40, 'abc@gmail.com', 'Male', 7);

INSERT INTO code.players(id, age, email, gender, `level`)
VALUES(2, 30, 'ali@gmail.com', 'Male', 8);

INSERT INTO code.players(id, age, email, gender, `level`)
VALUES(3, 35, 'john@gmail.com', 'Male', 8);

INSERT INTO code.players(id, age, email, gender, `level`)
VALUES(10, 50, 'asim@gmail.com', 'Male', 10);
/*
*********************************************************************
*/


INSERT INTO code.sports(id, name)
VALUES(1, 'Basketball');
INSERT INTO code.sports(id, name)
VALUES(2, 'Tennis');
INSERT INTO code.sports (id, name)
VALUES(3, 'Soccer');


/*
*********************************************************************
*/


INSERT INTO code.sports_players (id, description, player_id, sport_id)
VALUES(1, 'test', 1, 1);
INSERT INTO code.sports_players(id, description, player_id, sport_id)
VALUES(2, 'test', 1, 2);

INSERT INTO code.sports_players(id, description, player_id, sport_id)
VALUES(3, 'test', 2, 2);

INSERT INTO code.sports_players (id, description, player_id, sport_id)
VALUES(4, 'test', 2, 1);


/*
*********************************************************************
*/

