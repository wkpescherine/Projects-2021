import React from 'react';
import './App.css';

class Categorys extends React.Component {
    render(){
        return(
            <div>
                {this.props.data === "AdMob" && 
                    <button>SDK Issues</button>
                }
                {this.props.data === "AdMob" && 
                    <button>Account Issues</button>
                }
                {this.props.data === "AdMob" && 
                    <button>Mediation</button>
                }
            </div>
        )
    }

}
export default Categorys;