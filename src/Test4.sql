create table test_table (
    id int not null
);

insert into test_table values (1);
insert into test_table values (2);
insert into test_table values (4);
insert into test_table values (7);
insert into test_table values (8);
insert into test_table values (11);
insert into test_table values (29);


-- результирующий запрос
SELECT case when t.nextID - t.id > 1 then t.id + 1 end num, -- если разница больше, чем 1 (т.е. есть пропуск числа) то находим первое пропущенное число
       (t.nextID - t.id) - 1 cnt -- Находим длинну пропуска
FROM (
         SELECT t.id,
                lead(t.id, 1) OVER (ORDER BY t.id) AS nextID -- получаем через LEAD список id со сдвигом на одно значение вниз
         FROM test_table t
     ) AS t
WHERE t.nextID - t.id > 1; -- отсев чисел без пропуска;
