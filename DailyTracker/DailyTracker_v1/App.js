import './App.css';
import {BrowserRouter as Router, Route} from 'react-router-dom'

import DailyDev from './dailydev'
import Login from "./login"
import Dashboard from "./dashboard"
import MonthlyAgent from "./monthlyagent"

function App() {
  return (
    <div className="App">
      <Router>
        <Route exact path="/" component = {Login} />
        <Route exact path="/dashboard" component = {Dashboard} />
        <Route exact path="/dailydev" component = {DailyDev} />
        <Route exact path="/monthlyagent" component = {MonthlyAgent} />
      </Router>
    </div>
  );
}

export default App;
