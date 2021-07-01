import './App.css';
import {BrowserRouter as Router, Route} from 'react-router-dom'

import DailyDev from './dailydev'
import Login from "./login"
import Dashboard from "./dashboard"

function App() {
  return (
    <div className="App">
      <Router>
        <Route exact path="/" component = {Login} />
        <Route exact path="/dashboard" component = {Dashboard} />
        <Route exact path="/dailydev" component = {DailyDev} />
      </Router>
    </div>
  );
}

export default App;
