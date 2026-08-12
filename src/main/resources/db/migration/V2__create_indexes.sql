CREATE INDEX idx_reservations_user
    ON reservations(user_id);

CREATE INDEX idx_reservations_room
    ON reservations(room_id);

CREATE INDEX idx_reservations_period
    ON reservations(room_id, hour_start, hour_end);