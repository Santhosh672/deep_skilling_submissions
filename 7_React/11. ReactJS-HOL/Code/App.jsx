import React, { useState } from 'react';
import './App.css';

function App() {
  const [count, setCount] = useState(0);
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState('');

  const handleIncrement = () => {
    sayHello();
    setCount(count + 1);
  };

  const sayHello = () => {
    alert("Hello! Static message here.");
  };

  const handleDecrement = () => setCount(count - 1);

  const sayWelcome = (message) => alert(`Say: ${message}`);

  const handleClick = (e) => alert("I was clicked");

  const handleConversion = () => {
    const euro = (parseFloat(rupees) / 90).toFixed(2);
    setEuros(euro);
  };

  return (
    <div className="App">
      <h1>Event Handling Examples</h1>

      <h2>Counter: {count}</h2>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={handleDecrement}>Decrement</button>

      <br /><br />
      <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>

      <br /><br />
      <button onClick={handleClick}>Synthetic Event (OnPress)</button>

      <br /><br />
      <div>
        <h2>Currency Converter</h2>
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          placeholder="Enter amount in INR"
        />
        <button onClick={handleConversion}>Convert to Euro</button>
        <p>Converted: €{euros}</p>
      </div>
    </div>
  );
}

export default App;
