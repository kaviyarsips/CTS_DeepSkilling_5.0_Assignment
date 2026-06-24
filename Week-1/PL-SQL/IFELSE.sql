DECLARE
    marks NUMBER := 45;
BEGIN
    IF marks >= 50 THEN
        DBMS_OUTPUT.PUT_LINE('PASS');
    ELSE
        DBMS_OUTPUT.PUT_LINE('FAIL');
    END IF;
END;
/