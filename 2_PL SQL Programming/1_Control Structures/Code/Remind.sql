SET SERVEROUTPUT ON;

DECLARE
  CURSOR c_due IS
    SELECT l.LoanID,
           l.CustomerID,
           l.DueDate
      FROM Loans l
     WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
     ORDER BY l.DueDate;

BEGIN
  FOR loan_rec IN c_due LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Customer ' || loan_rec.CustomerID ||
      ', your loan '        || loan_rec.LoanID      ||
      ' is due on '         || TO_CHAR(loan_rec.DueDate, 'YYYY‑MM‑DD')
    );
  END LOOP;
END;
/