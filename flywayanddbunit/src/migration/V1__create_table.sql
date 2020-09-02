CREATE TABLE members (
    id          BIGINT          NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(15)     COMMENT '이름',
    age         BIGINT          COMMENT '나이',
    team_id     BIGINT          COMMENT '팀 ID'
);

CREATE TABLE team (
    id          BIGINT          NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(15)     COMMENT '이름'
);