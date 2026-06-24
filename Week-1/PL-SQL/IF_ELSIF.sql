DECLARE
    marks NUMBER:= 85;
BEGIN
   IF marks >= 85 THEN
      DBMS_OUTPUT.PUT_LINE('Excellent');
   ELSIF marks >= 75 THEN 
      DBMS_OUTPUT.PUT_LINE('Very good');
   ELSIF marks >=60 THEN
      DBMS_OUTPUT.PUT_LINE('Good');
   ELSIF marks >=50 THEN
      DBMS_OUTPUT.PUT_LINE('Need improvement');
   ELSE
      DBMS_OUTPUT.PUT_LINE('Fail');
   END IF;
END;
/
      