SELECT setval(pg_get_serial_sequence('signalements', 'id'), coalesce(max(id)+1, 1), false) FROM signalements;
SELECT setval(pg_get_serial_sequence('users', 'id'), coalesce(max(id)+1, 1), false) FROM users;
SELECT setval(pg_get_serial_sequence('station', 'id'), coalesce(max(id)+1, 1), false) FROM station;