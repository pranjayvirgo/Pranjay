{\rtf1\ansi\ansicpg1252\deff0\deflang16393{\fonttbl{\f0\fswiss\fcharset0 Arial;}}
{\*\generator Msftedit 5.41.21.2509;}\viewkind4\uc1\pard\f0\fs20 CREATE TABLE Users\par
(\par
    USERID  VARCHAR(30) PRIMARY KEY NOT NULL,\par
    FIRSTNAME   VARCHAR(30),\par
    LASTNAME    VARCHAR(30),\par
    EMAILID VARCHAR(30),\par
   LASTLOGINTIME DATETIME,\par
LOGOUTTYPE VARCHAR(30),\par
LASTLOGGOUTTIME DATETIME,\par
ROLE    VARCHAR(30),\par
    CREATED     TIMESTAMP DEFAULT NOW()\par
);\par
}
 