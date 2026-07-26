import React, { useState } from "react";

import EmployeeList from "./Components/EmployeeList";

import ThemeContext from "./Context/ThemeContext";

import "./App.css";

function App() {

    const [theme, setTheme] = useState("light");

    const changeTheme = () => {

        if(theme==="light")

            setTheme("dark");

        else

            setTheme("light");

    }

    return (

        <ThemeContext.Provider value={theme}>

            <div className="container">

                <h1>Employee Management</h1>

                <button onClick={changeTheme}>

                    Toggle Theme

                </button>

                <EmployeeList/>

            </div>

        </ThemeContext.Provider>

    );

}

export default App;