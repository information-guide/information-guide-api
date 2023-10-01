CREATE TABLE INTERVIEW_GUIDE.TOPICS (
	ID INT AUTO_INCREMENT,
    CODE INT NOT NULL,
    NAME VARCHAR (100) NOT NULL,
    PRIMARY KEY(ID)
);

INSERT INTO INTERVIEW_GUIDE.TOPICS(CODE, NAME)
VALUES
	(1001, 'Java Core'),
    (1002, 'Java MultiThreading'),
    (1003, 'Java Collection'),
    (1004, 'Spring Core'),
    (1005, 'Spring Boot'),
    (1006, 'Spring JPA'),
	(1007, 'Angular');

COMMIT;