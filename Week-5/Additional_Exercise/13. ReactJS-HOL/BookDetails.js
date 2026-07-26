import React from "react";

function BookDetails() {

    const books = [

        {

            id:1,

            name:"React Explained",

            author:"Zac Gordon",

            price:550

        },

        {

            id:2,

            name:"Java Complete Reference",

            author:"Herbert Schildt",

            price:720

        },

        {

            id:3,

            name:"Python Crash Course",

            author:"Eric Matthes",

            price:650

        }

    ];

    return(

        <div>

            <h2>Book Details</h2>

            <ul>

                {

                    books.map(book=>

                        <li key={book.id}>

                            <b>Book :</b> {book.name}

                            <br/>

                            <b>Author :</b> {book.author}

                            <br/>

                            <b>Price :</b> ₹{book.price}

                        </li>

                    )

                }

            </ul>

        </div>

    );

}

export default BookDetails;