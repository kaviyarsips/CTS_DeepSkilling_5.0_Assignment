import React, { Component } from "react";

class ComplaintRegister extends Component {

    constructor() {
        super();

        this.state = {
            employeeName: "",
            complaint: ""
        };
    }

    handleChange = (event) => {

        this.setState({
            [event.target.name]: event.target.value
        });

    };

    handleSubmit = (event) => {

        event.preventDefault();

        const referenceNumber = Math.floor(Math.random() * 1000000);

        alert(
            "Complaint Raised Successfully!\n\n" +
            "Employee Name : " +
            this.state.employeeName +
            "\nReference Number : " +
            referenceNumber
        );

        this.setState({
            employeeName: "",
            complaint: ""
        });

    };

    render() {

        return (

            <div className="container">

                <h1>Ticket Raising Application</h1>

                <form onSubmit={this.handleSubmit}>

                    <label>

                        Employee Name

                    </label>

                    <input
                        type="text"
                        name="employeeName"
                        value={this.state.employeeName}
                        onChange={this.handleChange}
                        required
                    />

                    <label>

                        Complaint

                    </label>

                    <textarea
                        name="complaint"
                        rows="6"
                        value={this.state.complaint}
                        onChange={this.handleChange}
                        required
                    ></textarea>

                    <button type="submit">

                        Submit Complaint

                    </button>

                </form>

            </div>

        );

    }

}

export default ComplaintRegister;