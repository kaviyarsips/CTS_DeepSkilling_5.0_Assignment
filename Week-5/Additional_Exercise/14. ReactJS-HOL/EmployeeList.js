import React from "react";

import EmployeeCard from "./EmployeeCard";

function EmployeeList() {

    const employees = [

        {
            id:1,
            name:"John",
            designation:"Software Engineer"
        },

        {
            id:2,
            name:"David",
            designation:"Frontend Developer"
        },

        {
            id:3,
            name:"Smith",
            designation:"React Developer"
        }

    ];

    return (

        <div>

            {

                employees.map(emp =>

                    <EmployeeCard

                        key={emp.id}

                        employee={emp}

                    />

                )

            }

        </div>

    );

}

export default EmployeeList;