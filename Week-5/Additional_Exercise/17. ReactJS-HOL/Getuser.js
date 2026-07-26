import React, { Component } from "react";

class Getuser extends Component {

    constructor() {

        super();

        this.state = {

            user: null

        };

    }

    async componentDidMount() {

        const response = await fetch("https://api.randomuser.me/");

        const data = await response.json();

        this.setState({

            user: data.results[0]

        });

    }

    render() {

        if (!this.state.user) {

            return <h2>Loading...</h2>;

        }

        return (

            <div className="container">

                <h1>Random User Details</h1>

                <img

                    src={this.state.user.picture.large}

                    alt="User"

                />

                <h2>

                    {this.state.user.name.title}{" "}

                    {this.state.user.name.first}

                </h2>

            </div>

        );

    }

}

export default Getuser;