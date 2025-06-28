CREATE OR REPLACE PROCEDURE TransferFunds(
  p_FromAccountID IN NUMBER,
  p_ToAccountID   IN NUMBER,
  p_Amount        IN NUMBER
) IS
  v_FromBalance NUMBER;
BEGIN

  SELECT Balance INTO v_FromBalance
    FROM Accounts
   WHERE AccountID = p_FromAccountID
     FOR UPDATE;

  IF v_FromBalance < p_Amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account.');
  END IF;

  UPDATE Accounts
     SET Balance = Balance - p_Amount
   WHERE AccountID = p_FromAccountID;

  UPDATE Accounts
     SET Balance = Balance + p_Amount
   WHERE AccountID = p_ToAccountID;

  DBMS_OUTPUT.PUT_LINE('Transferred ' || p_Amount ||
                       ' from account ' || p_FromAccountID ||
                       ' to account ' || p_ToAccountID);

  COMMIT;
END;
/
