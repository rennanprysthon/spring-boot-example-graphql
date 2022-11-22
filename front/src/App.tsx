import { useQuery } from "@apollo/client";
import { useEffect } from "react";
import AUTHORS from "./querys";

function App() {
  const { loading, error, data } = useQuery(AUTHORS);
  
  if (loading) {
    return <p>Loading...</p>
  }

  if (error) {
    return <p>An error occurred...</p>
  }

  useEffect(() => {
    console.log(data)
  }, [])

  return (
    <div>
      {
        data?.authors?.map((author) => (
          <div key={author.id}>
            <h1>{author.name}</h1>
            <ul>
              {author.books.map(book => (
                <li>{book.title}</li>
              ))}  
            </ul>
          </div>
        )) 
      } 
    </div>
  );
}

export default App;
