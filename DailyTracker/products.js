import React from 'react';
import './App.css';

class Products extends React.Component {
    render(){
        return (
            <div style={{
                display: "flex",
                justifyContent: "center",
              }}>
                <div style={{width:525, border:"2px solid white"}}>
                    <button onClick={()=>this.props.submitProduct("AdSense")}>AdSense</button>
                    <button onClick={()=>this.props.submitProduct("AdWordsAPI")}>AdWords API</button>
                    <button onClick={()=>this.props.submitProduct("GoogleAdsAPI")}>Google Ads API</button>
                    <button onClick={()=>this.props.submitProduct("ParallelTracking")}>Parallel Tracking</button>
                    <button onClick={()=>this.props.submitProduct("GoogleAdsScript")}>Google Ads Script</button>
                    <button onClick={()=>this.props.submitProduct("ContentAPIforShopping")}>Content API for Shopping</button>
                    <button onClick={()=>this.props.submitProduct("DBMAPI")}>DBMAPI</button>
                    <button onClick={()=>this.props.submitProduct("DCMAPI")}>DCMAPI</button>
                    <button onClick={()=>this.props.submitProduct("AudiencePartnerAPI")}>Audience Partner API</button>
                    <button onClick={()=>this.props.submitProduct("IMA")}>IMA</button>
                    <button onClick={()=>this.props.submitProduct("GoogleAdManagerAPI")}>Google Ad Manager API</button>
                    <button onClick={()=>this.props.submitProduct("GoogleAnalyticsAPI")}>Google Analytics API</button>
                    <button onClick={()=>this.props.submitProduct("AdMob")}>AdMob</button>
                </div>
            </div>
        )
    }
}

export default Products;