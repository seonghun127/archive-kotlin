CREATE TABLE member (
    id          BIGINT          NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(15)     COMMENT '이름',
    age         BIGINT          COMMENT '나이'
);

CREATE TABLE team (
    id          BIGINT          NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(15)     COMMENT '이름'
);