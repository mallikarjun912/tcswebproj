import React,{ useEffect } from "react";
import { Link } from "react-router-dom";
import { useSelector } from "react-redux/es/exports";
import BookAction from "../redux/action/BookAction"; 

const GetAllBooks = () => {
    const bookAction = BookAction();
    const {books} = useSelector((state) => {
        const statecopy = {...state};
        return {
            books :statecopy.books || []
        };
    });
    useEffect(() => {
        if(books.length===0) {bookAction.getBooks();} 
        },  [] );  

    const AdminButtons = ({id}) => {
            return(
                <React.Fragment>
                    <td>
                        <Link to={`/editbook/${id}`}> <button className="btn btn-warning">Update</button> </Link>
                    </td>
                    <td>
                        <div onClick={()=> {bookAction.deleteBook(id);}}>
                            <button className="btn btn-danger">Delete</button>
                        </div>
                    </td>
                </React.Fragment>
            );
        };

    return(
        <div>
            <div className="ui large menu">
                <h1 align="center">Book Information System</h1>
                <Link to={"/addbook"} className="right menu">
                 <button className="btn btn-primary">ADD Book</button> 
                </Link>
             </div>
            <table className="table table-striped" width={"50%"}>
            <thead>
                    <tr>
                        <th>BOOK ID</th>
                        <th>TITLE</th>
                        <th>AUTHOR</th>
                        <th>PUBLICATIONS</th>
                        <th>YEAR</th>
                        <th>PRICE</th>
                    </tr>
                </thead>
                <tbody>
                {
                        books.map((bk) => (
                        <tr key={bk.bookId}>
                            <td>{bk.bookId}</td>            
                            <td>{bk.title}</td>            
                            <td>{bk.author}</td>            
                            <td>{bk.publications}</td>            
                            <td>{bk.year}</td>            
                            <td>{bk.price}</td>   
                           <AdminButtons id={bk.bookId}></AdminButtons>
                        </tr>
                        ) )
                    }
                </tbody>
            </table>
        </div>
    );
};

export default GetAllBooks;

