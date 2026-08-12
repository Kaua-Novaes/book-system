CREATE TABLE users (
                       id BIGSERIAL PRIMARY KEY,
                       username VARCHAR(100) NOT NULL UNIQUE,
                       password VARCHAR(255) NOT NULL,
                       role VARCHAR(50) NOT NULL
);

CREATE TABLE rooms (
                       id BIGSERIAL PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       description TEXT,
                       hour_open TIME NOT NULL,
                       hour_close TIME NOT NULL
);

CREATE TABLE reservations (
                              id BIGSERIAL PRIMARY KEY,
                              user_id BIGINT NOT NULL,
                              room_id BIGINT NOT NULL,
                              hour_start TIMESTAMP NOT NULL,
                              hour_end TIMESTAMP NOT NULL,
                              exec_time INTEGER,

                              CONSTRAINT fk_reservation_user
                                  FOREIGN KEY (user_id)
                                      REFERENCES users (id),

                              CONSTRAINT fk_reservation_room
                                  FOREIGN KEY (room_id)
                                      REFERENCES rooms (id)
);