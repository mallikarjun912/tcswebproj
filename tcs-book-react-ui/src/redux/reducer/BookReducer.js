export const ADD_BOOK = "ADD_BOOK";
export const GET_BOOKS = "GET_BOOKS"
export const DEL_BOOK = "DEL_BOOK";
export const GET_BY_ID = "GET_BY_ID"
export const EDIT_BOOK = "EDIT_BOOK"

const BookReducer = (state = [], action)=>{
    let books = [...state];
    switch(action.type){
        case ADD_BOOK : {
                books.push(action.payload);
                return books;
            }
        case EDIT_BOOK : {
            const index = books.findIndex((book)=> book.bookId = action.payload.bookId);
            books[index] = {...books[index], ...action.payload};
            return books;
        }
        case DEL_BOOK : {
            books = books.filter((book)=> book.bookId !== action.payload);
            return books;
        }
        case GET_BOOKS : {
            return [...action.payload];
        }
        default :
            return state;
    }
}

export default BookReducer;

