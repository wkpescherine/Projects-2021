import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Route} from 'react-router-dom'

import Main from './main'
import Home from './home'

function App() {
  return (
    <div className="App">
      <Router>
        <Route exact path="/" component = {Main} />
        <Route exact path="/home" component = {Home} />
      </Router>
    </div>
  );
}

export default App;