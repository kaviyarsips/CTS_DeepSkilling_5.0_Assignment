DECLARE
    grade CHAR:='A';
BEGIN
   CASE grade
       WHEN 'A' THEN
            DBMS_OUTPUT.PUT_LINE('Excellent');
       WHEN 'B' THEN 
            DBMS_OUTPUT.PUT_LINE('Very good');
       WHEN 'C' THEN
            DBMS_OUTPUT.PUT_LINE('Good');
       WHEN 'D' THEN
            DBMS_OUTPUT.PUT_LINE('Need improvement');
       ELSE
            DBMS_OUTPUT.PUT_LINE('Fail');
   END CASE;
END;
/
