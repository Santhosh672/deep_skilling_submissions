import React from 'react';
import './App.css';

function App() {
  const offices = [
    {
      name: "Alpha Towers",
      rent: 55000,
      address: "MG Road, Bengaluru",
      image: "https://via.placeholder.com/150"
    },
    {
      name: "Beta Hub",
      rent: 65000,
      address: "Baner, Pune",
      image: "https://via.placeholder.com/150"
    }
  ];

  return (
    <div className="App">
      <h1>Office Space Rentals</h1>
      {offices.map((office, index) => (
        <div key={index} style={{border: "1px solid #ccc", padding: 10, marginBottom: 10}}>
          <img src={office.image} alt={office.name} />
          <h2>{office.name}</h2>
          <p><strong>Address:</strong> {office.address}</p>
          <p style={{color: office.rent < 60000 ? 'red' : 'green'}}>
            <strong>Rent:</strong> ₹{office.rent}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;
