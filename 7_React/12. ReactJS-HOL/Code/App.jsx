import React, { useState } from 'react';
import './App.css';

function GuestPage() {
  return (
    <div>
      <h2>Welcome, Guest!</h2>
      <p>Browse available flights below.</p>
      {/* Sample flight details */}
      <ul>
        <li>IndiGo - Mumbai to Delhi - ₹4500</li>
        <li>Air India - Bengaluru to Chennai - ₹3000</li>
      </ul>
    </div>
  );
}

function UserPage() {
  return (
    <div>
      <h2>Welcome, User!</h2>
      <p>You can now book your tickets.</p>
      <button>Book Ticket</button>
    </div>
  );
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div className="App">
      <h1>Ticket Booking App</h1>
      {isLoggedIn ? <UserPage /> : <GuestPage />}
      <br />
      <button onClick={() => setIsLoggedIn(!isLoggedIn)}>
        {isLoggedIn ? "Logout" : "Login"}
      </button>
    </div>
  );
}

export default App;
