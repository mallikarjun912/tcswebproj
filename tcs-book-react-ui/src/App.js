import React from "react";
import { Provider } from "react-redux";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import AddBook from "./functions/AddBook";
import GetAllBooks from "./functions/GetAllBooks";
import EditBook from "./functions/EditBook";
import { store, persistor } from "./redux/store";
import { PersistGate } from "redux-persist/integration/react";

function App() {
  return (
   <Provider store={store}>
      <PersistGate persistor={persistor}>
        <BrowserRouter>
          <Routes>
            <Route path="/getbooks"  element={<GetAllBooks />}/>
            <Route path="/"  element={<GetAllBooks />}/>
            <Route path="/addbook" element= {<AddBook />}/>
            <Route path="/editbook/:id" element={<EditBook />}/>
          </Routes>
        </BrowserRouter>
      </PersistGate>
   </Provider>
  );
}

export default App;
