import React from 'react';
import './App.css';

import HomeArticle from "./home_article"

class Article extends React.Component {
    render(){
        return (
            <div style={{
                display: "flex",
                justifyContent: "center"
                }}>
                <div style={{width: 400}}>
                    <div style={{display:"inline", color: "white"}}>
                        { this.props.data1 === "home" &&
                            <HomeArticle />
                        }
                    </div>
                </div>
                <div style={{width: 400}}>
                    <div style={{display:"inline", color: "white"}}>
                        { this.props.data1 === "sportforge" &&
                            <p style={{display:"inline", color: "white"}}>A sports based web app that allows you to play Iron man challenges on a daily basis using live games</p>
                        }
                    </div>
                </div>
            </div>
        );
    }
}

export default Article;