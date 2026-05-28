DELETE FROM study_logs
WHERE id BETWEEN 7 AND 36;

INSERT INTO study_logs (id, title, category, minutes, memo)
VALUES
(7, 'Paging test 07', 'JAVA', 25, 'paging seed data'),
(8, 'Paging test 08', 'SPRING', 35, 'paging seed data'),
(9, 'Paging test 09', 'DATABASE', 45, 'paging seed data'),
(10, 'Paging test 10', 'JAVA', 30, 'paging seed data'),
(11, 'Paging test 11', 'SPRING', 40, 'paging seed data'),
(12, 'Paging test 12', 'DATABASE', 50, 'paging seed data'),
(13, 'Paging test 13', 'JAVA', 35, 'paging seed data'),
(14, 'Paging test 14', 'SPRING', 45, 'paging seed data'),
(15, 'Paging test 15', 'DATABASE', 55, 'paging seed data'),
(16, 'Paging test 16', 'JAVA', 40, 'paging seed data'),
(17, 'Paging test 17', 'SPRING', 50, 'paging seed data'),
(18, 'Paging test 18', 'DATABASE', 60, 'paging seed data'),
(19, 'Paging test 19', 'JAVA', 45, 'paging seed data'),
(20, 'Paging test 20', 'SPRING', 55, 'paging seed data'),
(21, 'Paging test 21', 'DATABASE', 65, 'paging seed data'),
(22, 'Paging test 22', 'JAVA', 50, 'paging seed data'),
(23, 'Paging test 23', 'SPRING', 60, 'paging seed data'),
(24, 'Paging test 24', 'DATABASE', 70, 'paging seed data'),
(25, 'Paging test 25', 'JAVA', 55, 'paging seed data'),
(26, 'Paging test 26', 'SPRING', 65, 'paging seed data'),
(27, 'Paging test 27', 'DATABASE', 75, 'paging seed data'),
(28, 'Paging test 28', 'JAVA', 60, 'paging seed data'),
(29, 'Paging test 29', 'SPRING', 70, 'paging seed data'),
(30, 'Paging test 30', 'DATABASE', 80, 'paging seed data'),
(31, 'Paging test 31', 'JAVA', 65, 'paging seed data'),
(32, 'Paging test 32', 'SPRING', 75, 'paging seed data'),
(33, 'Paging test 33', 'DATABASE', 85, 'paging seed data'),
(34, 'Paging test 34', 'JAVA', 70, 'paging seed data'),
(35, 'Paging test 35', 'SPRING', 80, 'paging seed data'),
(36, 'Paging test 36', 'DATABASE', 90, 'paging seed data');

SELECT *
FROM study_logs
WHERE id BETWEEN 7 AND 36
ORDER BY id;
