import React from "react";
import "./App.css";

import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {

  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  let courseComponent;

  if (showCourses) {
    courseComponent = <CourseDetails />;
  } else {
    courseComponent = <h2>No Course Details</h2>;
  }

  return (

    <div className="container">

      <h1>Blogger Application</h1>

      <hr />

      {/* Ternary Operator */}

      {showBooks ? <BookDetails /> : <h2>No Book Details</h2>}

      <hr />

      {/* Logical AND */}

      {showBlogs && <BlogDetails />}

      <hr />

      {/* Element Variable */}

      {courseComponent}

    </div>

  );

}

export default App;