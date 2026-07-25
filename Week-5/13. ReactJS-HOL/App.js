import React from "react";

import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App(){

    const showBooks=true;

    const showBlogs=false;

    const showCourses=true;

    return(

        <div style={{margin:"20px"}}>

            <h1>Blogger Application</h1>

            {/* Way 1 : if using ternary */}

            {showBooks ? <BookDetails/> : <p>Books Hidden</p>}

            <hr/>

            {/* Way 2 : Logical AND */}

            {showBlogs && <BlogDetails/>}

            <hr/>

            {/* Way 3 : Simple Conditional */}

            {

                showCourses

                ? <CourseDetails/>

                : null

            }

        </div>

    );

}

export default App;