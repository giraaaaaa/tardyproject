DROP TABLE IF EXISTS meetingroom;
CREATE TABLE meetingroom(
    id INT AUTO_INCREMENT PRIMARY KEY,
    meettingname  VARCHAR(30) UNIQUE NOT NULL,
    member VARCHAR(30) NOT NULL,
    meetingcontent VARCHAR(30) NOT NULL,
    meetingtime VARCHAR(30) NOT NULL,
    meetinglocation VARCHAR(30) NOT NULL,
    latepenalty VARCHAR(30) NOT NULL,
    profilepic VARCHAR(30) NOT NULL,
    personal VARCHAR(30) NOT NULL
)DEFAULT CHARSET=utf8;

commit;