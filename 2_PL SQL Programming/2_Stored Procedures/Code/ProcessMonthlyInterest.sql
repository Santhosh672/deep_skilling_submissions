CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE Accounts
     SET Balance = Balance * 1.01
   WHERE AccountType = 'SAVINGS';

  DBMS_OUTPUT.PUT_LINE(SQL%ROWCOUNT || ' savings accounts updated.');
  COMMIT;
END;
/
