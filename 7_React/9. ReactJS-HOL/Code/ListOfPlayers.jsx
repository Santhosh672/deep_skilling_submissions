import React from 'react';

const players = [
  { name: 'Rohit', score: 85 },
  { name: 'Virat', score: 55 },
  { name: 'Rahul', score: 72 },
  { name: 'Dhawan', score: 48 },
  { name: 'Pant', score: 90 },
  { name: 'Hardik', score: 60 },
  { name: 'Bumrah', score: 35 },
  { name: 'Shami', score: 40 },
  { name: 'Ashwin', score: 75 },
  { name: 'Jadeja', score: 80 },
  { name: 'Iyer', score: 66 },
];

const ListOfPlayers = () => {
  const filtered = players.filter(p => p.score >= 70);
  return (
    <div>
      <h2>Players with score ≥ 70</h2>
      <ul>
        {filtered.map((player, index) => (
          <li key={index}>{player.name}: {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
