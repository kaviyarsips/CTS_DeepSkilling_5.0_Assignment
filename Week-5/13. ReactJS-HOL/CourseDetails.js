import React from "react";

function CourseDetails(){

    const courses=[

        {
            id:1,
            name:"React",
            duration:"6 Weeks"
        },

        {
            id:2,
            name:"Angular",
            duration:"5 Weeks"
        },

        {
            id:3,
            name:"Spring Boot",
            duration:"8 Weeks"
        }

    ];

    return(

        <div>

            <h2>Course Details</h2>

            <ol>

                {

                    courses.map(course=>

                        <li key={course.id}>

                            {course.name}

                            {" - "}

                            {course.duration}

                        </li>

                    )

                }

            </ol>

        </div>

    );

}

export default CourseDetails;