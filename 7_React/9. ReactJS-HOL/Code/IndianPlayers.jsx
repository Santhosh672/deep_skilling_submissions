import React from 'react';

const T20Players = ['Rohit', 'Virat', 'Rahul', 'Pant', 'Hardik'];
const RanjiPlayers = ['Jadeja', 'Ashwin', 'Shami', 'Bumrah', 'Iyer'];

const mergedPlayers = [...T20Players, ...RanjiPlayers];

const IndianPlayers = () => {
  const [oddTeam, evenTeam] = mergedPlayers.reduce(
    ([odds, evens], player, index) => {
      index % 2 === 0 ? evens.push(player) : odds.push(player);
      return [odds, evens];
    },
    [[], []]
  );

  return (
    <div>
      <h2>Even Team</h2>
      <ul>{evenTeam.map((p, i) => <li key={i}>{p}</li>)}</ul>

      <h2>Odd Team</h2>
      <ul>{oddTeam.map((p, i) => <li key={i}>{p}</li>)}</ul>
    </div>
  );
};

export default IndianPlayers;
