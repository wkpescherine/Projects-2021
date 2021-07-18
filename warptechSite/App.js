import './App.css';
import {BrowserRouter as Router, Route} from 'react-router-dom'

import Homepage from "./homepage"

function App() {
  return (
    <div className="App">
      <div>
        <Router>
          <Route exact path="/" component = {Homepage} />
        </Router>
      </div>
    </div>
  );
}

export default App;
