import { useQuery } from "@apollo/client";
import AUTHORS from "./querys";

function App() {
  const { loading, error, data } = useQuery(AUTHORS);
  
  if (loading) {
    return <p>Loading...</p>
  }

  if (error) {
    return <p>An error occurred...</p>
  }

  return (
    <div className="bg-slate-100 p-14 h-screen">
      <div>
        <h1 className="text-4xl font-bold text-indigo-700">Books</h1>
      </div>
      {
        data?.authors?.map((author) => (
          <div key={author.id} className="p-4">
            <h1 className="text-slate-700 text-lg font-bold">{author.name}</h1>
            <ul className="pl-5">
              {author.books.map(book => (
                <li className="text-slate-900 text-sm font-normal">{book.title}</li>
              ))}  
            </ul>
          </div>
        )) 
      } 
    </div>
  );
}

export default App;
