import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Route} from 'react-router-dom'

import Main from './main'

function App() {
  return (
    <div className="App">
      <Router>
        <Route exact path="/" component = {Main} />
      </Router>
    </div>
  );
}

export default App;