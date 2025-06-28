SET SERVEROUTPUT ON;

BEGIN
  UPDATE Customers
     SET IsVIP = 'Y'
   WHERE Balance > 10000
     AND NVL(IsVIP, 'N') <> 'Y'; 

  DBMS_OUTPUT.PUT_LINE(SQL%ROWCOUNT || ' customers promoted to VIP.');
  COMMIT;
END;
/