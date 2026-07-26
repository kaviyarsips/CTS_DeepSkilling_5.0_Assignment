import React, { Component } from "react";
import "../App.css";

class CountPeople extends Component {

    constructor() {
        super();

        this.state = {
            entryCount: 0,
            exitCount: 0
        };
    }

    updateEntry = () => {

        this.setState({

            entryCount: this.state.entryCount + 1

        });

    }

    updateExit = () => {

        this.setState({

            exitCount: this.state.exitCount + 1

        });

    }

    render() {

       return (
    <div className="container">

        <h1>Mall Counter Application</h1>

        <h2>People Entered: <span className="count">{this.state.entryCount}</span></h2>

        <button
            className="login-btn"
            onClick={this.updateEntry}
        >
            Login
        </button>

        <h2>People Exited: <span className="count">{this.state.exitCount}</span></h2>

        <button
            className="exit-btn"
            onClick={this.updateExit}
        >
            Exit
        </button>

    </div>
);

    }

}

export default CountPeople;