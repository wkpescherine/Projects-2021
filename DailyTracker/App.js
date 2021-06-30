import {BrowserRouter as Router, Route} from 'react-router-dom'
import './App.css';

import DailyDev from './dailydev'
import Login from "./login"
import Dashboard from "./dashboard"

function App() {
  return (
    <div className="App">
        <Route exact path="/" component = {Login} />
        <Route exact path="/dashboard" component = {Dashboard} />
        <Route exact path="/dailydev" component = {DailyDev} />
    </div>
  );
}

export default App;
