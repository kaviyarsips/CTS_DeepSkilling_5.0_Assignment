import React, { Component } from "react";

class Register extends Component {

    constructor() {

        super();

        this.state = {

            name: "",

            email: "",

            password: "",

            errors: {}

        };

    }

    handleChange = (event) => {

        this.setState({

            [event.target.name]: event.target.value

        });

    };

    validate = () => {

        let errors = {};

        let valid = true;

        if (this.state.name.length < 5) {

            errors.name = "Name should have at least 5 characters";

            valid = false;

        }

        if (

            !this.state.email.includes("@") ||

            !this.state.email.includes(".")

        ) {

            errors.email = "Enter a valid Email";

            valid = false;

        }

        if (this.state.password.length < 8) {

            errors.password = "Password should have at least 8 characters";

            valid = false;

        }

        this.setState({

            errors

        });

        return valid;

    };

    handleSubmit = (event) => {

        event.preventDefault();

        if (this.validate()) {

            alert("Registration Successful!");

            this.setState({

                name: "",

                email: "",

                password: "",

                errors: {}

            });

        }

    };

    render() {

        return (

            <div className="container">

                <h1>Mail Registration Form</h1>

                <form onSubmit={this.handleSubmit}>

                    <label>Name</label>

                    <input

                        type="text"

                        name="name"

                        value={this.state.name}

                        onChange={this.handleChange}

                    />

                    <span className="error">

                        {this.state.errors.name}

                    </span>

                    <label>Email</label>

                    <input

                        type="text"

                        name="email"

                        value={this.state.email}

                        onChange={this.handleChange}

                    />

                    <span className="error">

                        {this.state.errors.email}

                    </span>

                    <label>Password</label>

                    <input

                        type="password"

                        name="password"

                        value={this.state.password}

                        onChange={this.handleChange}

                    />

                    <span className="error">

                        {this.state.errors.password}

                    </span>

                    <button type="submit">

                        Register

                    </button>

                </form>

            </div>

        );

    }

}

export default Register;