import './App.css';
import {BrowserRouter as Router, Route} from 'react-router-dom'

import Main from './main'
import Home from './home'
import Create from "./create"

function App() {
  return (
    <div className="App">
      <Router>
        <Route exact path="/" component = {Main} />
        <Route exact path="/home" component = {Home} />
        <Route exact path="/create" component = {Create} />
      </Router>
    </div>
  );
}

export default App;