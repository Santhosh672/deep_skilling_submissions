import React from 'react';
import IndianPlayers from './IndianPlayers.jsx';
import ListOfPlayers from './ListOfPLayers.jsx';

const App = () => {
  const flag = false; // Change to false to render IndianPlayers
  return (
    <div>
      {flag ? <ListOfPlayers /> : <IndianPlayers />}
    </div>
  );
};

export default App;
