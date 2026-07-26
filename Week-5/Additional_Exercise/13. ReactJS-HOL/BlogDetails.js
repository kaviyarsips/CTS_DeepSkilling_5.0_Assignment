import React from "react";

function BlogDetails(){

    const blogs=[

        {

            id:1,

            title:"Introduction to React",

            author:"John"

        },

        {

            id:2,

            title:"Learning JavaScript",

            author:"David"

        },

        {

            id:3,

            title:"Spring Boot Tutorial",

            author:"Smith"

        }

    ];

    return(

        <div>

            <h2>Blog Details</h2>

            <ul>

                {

                    blogs.map(blog=>

                        <li key={blog.id}>

                            <b>Title :</b>

                            {blog.title}

                            <br/>

                            <b>Author :</b>

                            {blog.author}

                        </li>

                    )

                }

            </ul>

        </div>

    );

}

export default BlogDetails;