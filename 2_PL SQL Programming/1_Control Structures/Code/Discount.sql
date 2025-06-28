SET SERVEROUTPUT ON;

DECLARE
  CURSOR c_senior IS
    SELECT c.CustomerID
    FROM   Customers c
    WHERE  c.Age > 60;
BEGIN
  FOR cust IN c_senior LOOP
    UPDATE Loans
       SET InterestRate = InterestRate * 0.99
     WHERE CustomerID   = cust.CustomerID;

    DBMS_OUTPUT.PUT_LINE('Discount applied for customer ' || cust.CustomerID);
  END LOOP;

  COMMIT;
END;
/
