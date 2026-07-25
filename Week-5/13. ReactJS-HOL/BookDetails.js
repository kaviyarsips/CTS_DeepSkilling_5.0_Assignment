import React from "react";

function BookDetails() {

    const books = [

        {
            id:1,
            name:"React Guide",
            author:"Jordan Walke",
            price:650
        },

        {
            id:2,
            name:"Java Programming",
            author:"James Gosling",
            price:550
        },

        {
            id:3,
            name:"Python Basics",
            author:"Guido Van Rossum",
            price:450
        }

    ];

    return (

        <div>

            <h2>Book Details</h2>

            <table border="1" cellPadding="8">

                <thead>

                    <tr>

                        <th>ID</th>
                        <th>Name</th>
                        <th>Author</th>
                        <th>Price</th>

                    </tr>

                </thead>

                <tbody>

                    {

                        books.map(book=>(

                            <tr key={book.id}>

                                <td>{book.id}</td>
                                <td>{book.name}</td>
                                <td>{book.author}</td>
                                <td>₹ {book.price}</td>

                            </tr>

                        ))

                    }

                </tbody>

            </table>

        </div>

    );

}

export default BookDetails;