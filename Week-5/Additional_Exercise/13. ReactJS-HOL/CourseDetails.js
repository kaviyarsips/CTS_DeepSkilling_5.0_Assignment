import React from "react";

function CourseDetails(){

    const courses=[

        {

            id:1,

            name:"React",

            duration:"2 Months"

        },

        {

            id:2,

            name:"Angular",

            duration:"3 Months"

        },

        {

            id:3,

            name:"Spring Boot",

            duration:"4 Months"

        }

    ];

    return(

        <div>

            <h2>Course Details</h2>

            <ul>

                {

                    courses.map(course=>

                        <li key={course.id}>

                            <b>Course :</b>

                            {course.name}

                            <br/>

                            <b>Duration :</b>

                            {course.duration}

                        </li>

                    )

                }

            </ul>

        </div>

    );

}

export default CourseDetails;