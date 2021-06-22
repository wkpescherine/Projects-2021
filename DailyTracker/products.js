import React from 'react';
import './App.css';

class Products extends React.Component {
    submitProduct(selection){
        this.setState({
            product: selection
        })
        console.log(selection);
    }

    render(){
        return (
            <div>
                <button onClick={()=>this.submitProduct("AdMob")}>AdMob</button>
                <button onClick={()=>this.submitProduct("IMA")}>IMA</button>
                <button onClick={()=>this.submitProduct("GoogleAds")}>Google Ads API</button>
            </div>
        )
    }
}

export default Products;